/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasbesar;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

import javax.swing.*;
//Fungsi Import yang digunakan sql
import java.sql.*;
//Fungsi Import yang digunakan untuk Tanggal
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class gameStore extends javax.swing.JFrame {

    /**
     * Creates new form gameStore
     */
    koneksi2 dbsetting;
    String driver, database, user, pass;
    Object tabel;

    public gameStore() {
        initComponents();
        dbsetting = new koneksi2();
        driver = dbsetting.SettingPanel("DBDriver");
        database = dbsetting.SettingPanel("DBDatabase");
        user = dbsetting.SettingPanel("DBUsername");
        pass = dbsetting.SettingPanel("DBPassword");

        tabel_studios.setModel(tableModelStudios);
        tabel_publishers.setModel(tableModelPublishers);
        tabel_games.setModel(tableModelGames);
        tabel_users.setModel(tableModelUsers);
        tabel_transactions.setModel(tableModelTransactions);
        settableload(1);
        settableload(2);
        settableload(3);
        settableload(4);
        settableload(5);

        tabel_studios.getTableHeader().setFont(new Font("Inter", Font.BOLD, 14));
        tabel_studios.getTableHeader().setOpaque(false);
        tabel_studios.getTableHeader().setBackground(new Color(40, 46, 57));
        tabel_studios.getTableHeader().setForeground(new Color(255, 255, 255));
        
        tabel_publishers.getTableHeader().setFont(new Font("Inter", Font.BOLD, 14));
        tabel_publishers.getTableHeader().setOpaque(false);
        tabel_publishers.getTableHeader().setBackground(new Color(40, 46, 57));
        tabel_publishers.getTableHeader().setForeground(new Color(255, 255, 255));

        tabel_games.getTableHeader().setFont(new Font("Inter", Font.BOLD, 14));
        tabel_games.getTableHeader().setOpaque(false);
        tabel_games.getTableHeader().setBackground(new Color(40, 46, 57));
        tabel_games.getTableHeader().setForeground(new Color(255, 255, 255));

        tabel_users.getTableHeader().setFont(new Font("Inter", Font.BOLD, 14));
        tabel_users.getTableHeader().setOpaque(false);
        tabel_users.getTableHeader().setBackground(new Color(40, 46, 57));
        tabel_users.getTableHeader().setForeground(new Color(255, 255, 255));

        tabel_transactions.getTableHeader().setFont(new Font("Inter", Font.BOLD, 14));
        tabel_transactions.getTableHeader().setOpaque(false);
        tabel_transactions.getTableHeader().setBackground(new Color(40, 46, 57));
        tabel_transactions.getTableHeader().setForeground(new Color(255, 255, 255));
    }
    private javax.swing.table.DefaultTableModel tableModelStudios = getDefaultTableModel(1);
    private javax.swing.table.DefaultTableModel tableModelPublishers = getDefaultTableModel(2);
    private javax.swing.table.DefaultTableModel tableModelGames = getDefaultTableModel(3);
    private javax.swing.table.DefaultTableModel tableModelUsers = getDefaultTableModel(4);
    private javax.swing.table.DefaultTableModel tableModelTransactions = getDefaultTableModel(5);

    private javax.swing.table.DefaultTableModel getDefaultTableModel(int i) {
        switch (i) {
            case 1:
                // Sama kan column dengan yang ada di database
                return new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"StudioID", "Studio Name", "Director", "Studio Country"}) {
                    boolean[] canEdit = new boolean[]{
                        // banyaknya false = banyak nya column
                        false, false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };
            case 2:
                return new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"PublisherID", "Publisher Name", "Publisher Country"}) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };
            case 3:
                return new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"GameID", "StudioID", "PublisherID", "Game Title", "Genre", "Release Date", "Price"}) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };
            case 4:
                return new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"UserID", "Name", "Email", "Gender"}) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };
            case 5:
                return new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"TransactionID", "UserID", "GameID", "Transactions Date"}) {
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };
        }
        return null;
    }

    String data[];

    private void settableload(int j) {
        String stat = "";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(database, user, pass);
            Statement stt = conn.createStatement();
            String SQL = "";
            ResultSet res;
            switch (j) {
                case 1:
                    data = new String[4]; // angka nya sesuaikan dengan getString nya berapa
                    SQL += "SELECT * FROM studios";
                    res = stt.executeQuery(SQL);
                    while (res.next()) {
                        data[0] = res.getString(1);
                        data[1] = res.getString(2);
                        data[2] = res.getString(3);
                        data[3] = res.getString(4);
                        tableModelStudios.addRow(data);
                    }
                    res.close();
                    stt.close();
                    conn.close();
                    break;
                case 2:
                    data = new String[3];
                    SQL += "SELECT * FROM publishers";
                    res = stt.executeQuery(SQL);
                    while (res.next()) {
                        data[0] = res.getString(1);
                        data[1] = res.getString(2);
                        data[2] = res.getString(3);
                        tableModelPublishers.addRow(data);
                    }
                    res.close();
                    stt.close();
                    conn.close();
                    break;
                case 3:
                    data = new String[7];
                    SQL += "SELECT * FROM games";
                    res = stt.executeQuery(SQL);
                    while (res.next()) {
                        data[0] = res.getString(1);
                        data[1] = res.getString(2);
                        data[2] = res.getString(3);
                        data[3] = res.getString(4);
                        data[4] = res.getString(5);
                        data[5] = res.getString(6);
                        data[6] = res.getString(7);
                        tableModelGames.addRow(data);
                    }
                    res.close();
                    stt.close();
                    conn.close();
                    break;
                case 4:
                    data = new String[4];
                    SQL += "SELECT * FROM users";
                    res = stt.executeQuery(SQL);
                    while (res.next()) {
                        data[0] = res.getString(1);
                        data[1] = res.getString(2);
                        data[2] = res.getString(3);
                        data[3] = res.getString(4);
                        tableModelUsers.addRow(data);
                    }
                    res.close();
                    stt.close();
                    conn.close();
                    break;
                case 5:
                    data = new String[4];
                    SQL += "SELECT * FROM transactions";
                    res = stt.executeQuery(SQL);
                    while (res.next()) {
                        data[0] = res.getString(1);
                        data[1] = res.getString(2);
                        data[2] = res.getString(3);
                        data[3] = res.getString(4);
                        tableModelTransactions.addRow(data);
                    }
                    res.close();
                    stt.close();
                    conn.close();
                    break;
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pane_menus = new javax.swing.JPanel();
        btn_studios = new javax.swing.JLabel();
        btn_publishers = new javax.swing.JLabel();
        btn_games = new javax.swing.JLabel();
        btn_users = new javax.swing.JLabel();
        btn_transactions = new javax.swing.JLabel();
        pane_content = new javax.swing.JTabbedPane();
        content_studios = new javax.swing.JPanel();
        ttl_studios = new javax.swing.JLabel();
        btn_search_studios = new tugasbesar.ButtonRound();
        panelRound7 = new tugasbesar.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        txt_search_studios = new tugasbesar.TextFieldRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_studios = new tugasbesar.TableRound();
        content_publishers = new javax.swing.JPanel();
        ttl_publishers = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_publishers = new javax.swing.JTable();
        btn_search_publishers = new tugasbesar.ButtonRound();
        txt_search_publishers = new tugasbesar.TextFieldRound();
        panelRound8 = new tugasbesar.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        content_games = new javax.swing.JPanel();
        ttl_games = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_games = new javax.swing.JTable();
        btn_search_games = new tugasbesar.ButtonRound();
        txt_search_games = new tugasbesar.TextFieldRound();
        panelRound9 = new tugasbesar.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        content_users = new javax.swing.JPanel();
        ttl_users = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabel_users = new javax.swing.JTable();
        btn_search_users = new tugasbesar.ButtonRound();
        txt_search_users = new tugasbesar.TextFieldRound();
        panelRound10 = new tugasbesar.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        content_transactions = new javax.swing.JPanel();
        ttl_transactions = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel_transactions = new javax.swing.JTable();
        btn_search_transactions = new tugasbesar.ButtonRound();
        txt_search_transactions = new tugasbesar.TextFieldRound();
        panelRound11 = new tugasbesar.PanelRound();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(22, 25, 32));
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pane_menus.setBackground(new java.awt.Color(0, 0, 0));

        btn_studios.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        btn_studios.setForeground(new java.awt.Color(255, 255, 255));
        btn_studios.setText("STUDIOS");
        btn_studios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_studiosMouseDragged(evt);
            }
        });
        btn_studios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_studiosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_studiosMouseEntered(evt);
            }
        });

        btn_publishers.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        btn_publishers.setForeground(new java.awt.Color(255, 255, 255));
        btn_publishers.setText("PUBLISHERS");
        btn_publishers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_publishersMouseClicked(evt);
            }
        });

        btn_games.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        btn_games.setForeground(new java.awt.Color(255, 255, 255));
        btn_games.setText("GAMES");
        btn_games.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gamesMouseClicked(evt);
            }
        });

        btn_users.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        btn_users.setForeground(new java.awt.Color(255, 255, 255));
        btn_users.setText("USERS");
        btn_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usersMouseClicked(evt);
            }
        });

        btn_transactions.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        btn_transactions.setForeground(new java.awt.Color(255, 255, 255));
        btn_transactions.setText("TRANSACTIONS");
        btn_transactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_transactionsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane_menusLayout = new javax.swing.GroupLayout(pane_menus);
        pane_menus.setLayout(pane_menusLayout);
        pane_menusLayout.setHorizontalGroup(
            pane_menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_menusLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btn_studios)
                .addGap(80, 80, 80)
                .addComponent(btn_publishers)
                .addGap(80, 80, 80)
                .addComponent(btn_games)
                .addGap(80, 80, 80)
                .addComponent(btn_users)
                .addGap(80, 80, 80)
                .addComponent(btn_transactions))
        );
        pane_menusLayout.setVerticalGroup(
            pane_menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_menusLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pane_menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_studios)
                    .addComponent(btn_publishers)
                    .addComponent(btn_games)
                    .addComponent(btn_users)
                    .addComponent(btn_transactions)))
        );

        background.add(pane_menus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 70));

        pane_content.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pane_contentMouseClicked(evt);
            }
        });

        content_studios.setBackground(new java.awt.Color(22, 25, 32));

        ttl_studios.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        ttl_studios.setForeground(new java.awt.Color(255, 255, 255));
        ttl_studios.setText("STUDIOS");

        btn_search_studios.setBackground(new java.awt.Color(111, 166, 32));
        btn_search_studios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_search_studios.setForeground(new java.awt.Color(255, 255, 255));
        btn_search_studios.setText("Search");
        btn_search_studios.setContentAreaFilled(false);
        btn_search_studios.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        btn_search_studios.setRoundBottomLeft(15);
        btn_search_studios.setRoundBottomRight(15);
        btn_search_studios.setRoundTopLeft(15);
        btn_search_studios.setRoundTopRight(15);
        btn_search_studios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_studiosActionPerformed(evt);
            }
        });

        panelRound7.setBackground(new java.awt.Color(111, 166, 32));
        panelRound7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRound7.setRoundBottomLeft(15);
        panelRound7.setRoundBottomRight(15);
        panelRound7.setRoundTopLeft(15);
        panelRound7.setRoundTopRight(15);

        jLabel3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADD");

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        txt_search_studios.setBackground(new java.awt.Color(51, 51, 51));
        txt_search_studios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_search_studios.setForeground(new java.awt.Color(255, 255, 255));
        txt_search_studios.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txt_search_studios.setRoundBottomLeft(15);
        txt_search_studios.setRoundBottomRight(15);
        txt_search_studios.setRoundTopLeft(15);
        txt_search_studios.setRoundTopRight(15);

        jScrollPane1.setBackground(new java.awt.Color(31, 39, 51));

        tabel_studios.setBackground(new java.awt.Color(31, 39, 51));
        tabel_studios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabel_studios.setForeground(new java.awt.Color(255, 255, 255));
        tabel_studios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_studios);

        javax.swing.GroupLayout content_studiosLayout = new javax.swing.GroupLayout(content_studios);
        content_studios.setLayout(content_studiosLayout);
        content_studiosLayout.setHorizontalGroup(
            content_studiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_studiosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(content_studiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(content_studiosLayout.createSequentialGroup()
                        .addGroup(content_studiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttl_studios, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(330, 330, 330)
                        .addComponent(txt_search_studios, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_search_studios, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        content_studiosLayout.setVerticalGroup(
            content_studiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_studiosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ttl_studios)
                .addGap(31, 31, 31)
                .addGroup(content_studiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_search_studios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search_studios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        pane_content.addTab("tab1", content_studios);

        content_publishers.setBackground(new java.awt.Color(22, 25, 32));

        ttl_publishers.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        ttl_publishers.setForeground(new java.awt.Color(255, 255, 255));
        ttl_publishers.setText("PUBLISHERS");

        tabel_publishers.setBackground(new java.awt.Color(31, 39, 51));
        tabel_publishers.setForeground(new java.awt.Color(255, 255, 255));
        tabel_publishers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabel_publishers);

        btn_search_publishers.setBackground(new java.awt.Color(111, 166, 32));
        btn_search_publishers.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_search_publishers.setForeground(new java.awt.Color(255, 255, 255));
        btn_search_publishers.setText("Search");
        btn_search_publishers.setContentAreaFilled(false);
        btn_search_publishers.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        btn_search_publishers.setRoundBottomLeft(15);
        btn_search_publishers.setRoundBottomRight(15);
        btn_search_publishers.setRoundTopLeft(15);
        btn_search_publishers.setRoundTopRight(15);
        btn_search_publishers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_publishersActionPerformed(evt);
            }
        });

        txt_search_publishers.setBackground(new java.awt.Color(51, 51, 51));
        txt_search_publishers.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_search_publishers.setForeground(new java.awt.Color(255, 255, 255));
        txt_search_publishers.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txt_search_publishers.setRoundBottomLeft(15);
        txt_search_publishers.setRoundBottomRight(15);
        txt_search_publishers.setRoundTopLeft(15);
        txt_search_publishers.setRoundTopRight(15);

        panelRound8.setBackground(new java.awt.Color(111, 166, 32));
        panelRound8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRound8.setRoundBottomLeft(15);
        panelRound8.setRoundBottomRight(15);
        panelRound8.setRoundTopLeft(15);
        panelRound8.setRoundTopRight(15);

        jLabel6.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD");

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout content_publishersLayout = new javax.swing.GroupLayout(content_publishers);
        content_publishers.setLayout(content_publishersLayout);
        content_publishersLayout.setHorizontalGroup(
            content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_publishersLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttl_publishers)
                    .addGroup(content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(content_publishersLayout.createSequentialGroup()
                            .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_search_publishers, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_search_publishers, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        content_publishersLayout.setVerticalGroup(
            content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_publishersLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ttl_publishers)
                .addGap(32, 32, 32)
                .addGroup(content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_search_publishers, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_search_publishers, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );

        pane_content.addTab("tab2", content_publishers);

        content_games.setBackground(new java.awt.Color(22, 25, 32));

        ttl_games.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        ttl_games.setForeground(new java.awt.Color(255, 255, 255));
        ttl_games.setText("GAMES");

        tabel_games.setBackground(new java.awt.Color(31, 39, 51));
        tabel_games.setForeground(new java.awt.Color(255, 255, 255));
        tabel_games.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_games.setSelectionBackground(new java.awt.Color(235, 235, 235));
        jScrollPane3.setViewportView(tabel_games);

        btn_search_games.setBackground(new java.awt.Color(111, 166, 32));
        btn_search_games.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_search_games.setForeground(new java.awt.Color(255, 255, 255));
        btn_search_games.setText("Search");
        btn_search_games.setContentAreaFilled(false);
        btn_search_games.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        btn_search_games.setRoundBottomLeft(15);
        btn_search_games.setRoundBottomRight(15);
        btn_search_games.setRoundTopLeft(15);
        btn_search_games.setRoundTopRight(15);
        btn_search_games.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_gamesActionPerformed(evt);
            }
        });

        txt_search_games.setBackground(new java.awt.Color(51, 51, 51));
        txt_search_games.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_search_games.setForeground(new java.awt.Color(255, 255, 255));
        txt_search_games.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txt_search_games.setRoundBottomLeft(15);
        txt_search_games.setRoundBottomRight(15);
        txt_search_games.setRoundTopLeft(15);
        txt_search_games.setRoundTopRight(15);

        panelRound9.setBackground(new java.awt.Color(111, 166, 32));
        panelRound9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRound9.setRoundBottomLeft(15);
        panelRound9.setRoundBottomRight(15);
        panelRound9.setRoundTopLeft(15);
        panelRound9.setRoundTopRight(15);

        jLabel7.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADD");

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(panelRound9);
        panelRound9.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelRound9Layout.setVerticalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout content_gamesLayout = new javax.swing.GroupLayout(content_games);
        content_games.setLayout(content_gamesLayout);
        content_gamesLayout.setHorizontalGroup(
            content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_gamesLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttl_games)
                    .addGroup(content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(content_gamesLayout.createSequentialGroup()
                            .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_search_games, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_search_games, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        content_gamesLayout.setVerticalGroup(
            content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_gamesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ttl_games)
                .addGap(32, 32, 32)
                .addGroup(content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_search_games, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_search_games, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );

        pane_content.addTab("tab3", content_games);

        content_users.setBackground(new java.awt.Color(22, 25, 32));

        ttl_users.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        ttl_users.setForeground(new java.awt.Color(255, 255, 255));
        ttl_users.setText("USERS");

        tabel_users.setBackground(new java.awt.Color(31, 39, 51));
        tabel_users.setForeground(new java.awt.Color(255, 255, 255));
        tabel_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_users.setSelectionBackground(new java.awt.Color(235, 235, 235));
        jScrollPane5.setViewportView(tabel_users);

        btn_search_users.setBackground(new java.awt.Color(111, 166, 32));
        btn_search_users.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_search_users.setForeground(new java.awt.Color(255, 255, 255));
        btn_search_users.setText("Search");
        btn_search_users.setContentAreaFilled(false);
        btn_search_users.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        btn_search_users.setRoundBottomLeft(15);
        btn_search_users.setRoundBottomRight(15);
        btn_search_users.setRoundTopLeft(15);
        btn_search_users.setRoundTopRight(15);
        btn_search_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_usersActionPerformed(evt);
            }
        });

        txt_search_users.setBackground(new java.awt.Color(51, 51, 51));
        txt_search_users.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_search_users.setForeground(new java.awt.Color(255, 255, 255));
        txt_search_users.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txt_search_users.setRoundBottomLeft(15);
        txt_search_users.setRoundBottomRight(15);
        txt_search_users.setRoundTopLeft(15);
        txt_search_users.setRoundTopRight(15);

        panelRound10.setBackground(new java.awt.Color(111, 166, 32));
        panelRound10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRound10.setRoundBottomLeft(15);
        panelRound10.setRoundBottomRight(15);
        panelRound10.setRoundTopLeft(15);
        panelRound10.setRoundTopRight(15);

        jLabel9.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ADD");

        javax.swing.GroupLayout panelRound10Layout = new javax.swing.GroupLayout(panelRound10);
        panelRound10.setLayout(panelRound10Layout);
        panelRound10Layout.setHorizontalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelRound10Layout.setVerticalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound10Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout content_usersLayout = new javax.swing.GroupLayout(content_users);
        content_users.setLayout(content_usersLayout);
        content_usersLayout.setHorizontalGroup(
            content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_usersLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttl_users)
                    .addGroup(content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(content_usersLayout.createSequentialGroup()
                            .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_search_users, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_search_users, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        content_usersLayout.setVerticalGroup(
            content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_usersLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ttl_users)
                .addGap(32, 32, 32)
                .addGroup(content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_search_users, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_search_users, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );

        pane_content.addTab("tab4", content_users);

        content_transactions.setBackground(new java.awt.Color(22, 25, 32));
        content_transactions.setForeground(new java.awt.Color(255, 255, 255));

        ttl_transactions.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        ttl_transactions.setForeground(new java.awt.Color(255, 255, 255));
        ttl_transactions.setText("TRANSACTIONS");

        tabel_transactions.setBackground(new java.awt.Color(31, 39, 51));
        tabel_transactions.setForeground(new java.awt.Color(255, 255, 255));
        tabel_transactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_transactions.setSelectionBackground(new java.awt.Color(235, 235, 235));
        jScrollPane4.setViewportView(tabel_transactions);

        btn_search_transactions.setBackground(new java.awt.Color(111, 166, 32));
        btn_search_transactions.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_search_transactions.setForeground(new java.awt.Color(255, 255, 255));
        btn_search_transactions.setText("Search");
        btn_search_transactions.setContentAreaFilled(false);
        btn_search_transactions.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        btn_search_transactions.setRoundBottomLeft(15);
        btn_search_transactions.setRoundBottomRight(15);
        btn_search_transactions.setRoundTopLeft(15);
        btn_search_transactions.setRoundTopRight(15);
        btn_search_transactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_transactionsActionPerformed(evt);
            }
        });

        txt_search_transactions.setBackground(new java.awt.Color(51, 51, 51));
        txt_search_transactions.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_search_transactions.setForeground(new java.awt.Color(255, 255, 255));
        txt_search_transactions.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txt_search_transactions.setRoundBottomLeft(15);
        txt_search_transactions.setRoundBottomRight(15);
        txt_search_transactions.setRoundTopLeft(15);
        txt_search_transactions.setRoundTopRight(15);

        panelRound11.setBackground(new java.awt.Color(111, 166, 32));
        panelRound11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRound11.setRoundBottomLeft(15);
        panelRound11.setRoundBottomRight(15);
        panelRound11.setRoundTopLeft(15);
        panelRound11.setRoundTopRight(15);

        jLabel10.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADD");

        javax.swing.GroupLayout panelRound11Layout = new javax.swing.GroupLayout(panelRound11);
        panelRound11.setLayout(panelRound11Layout);
        panelRound11Layout.setHorizontalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound11Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelRound11Layout.setVerticalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound11Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout content_transactionsLayout = new javax.swing.GroupLayout(content_transactions);
        content_transactions.setLayout(content_transactionsLayout);
        content_transactionsLayout.setHorizontalGroup(
            content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_transactionsLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttl_transactions)
                    .addGroup(content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(content_transactionsLayout.createSequentialGroup()
                            .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_search_transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_search_transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        content_transactionsLayout.setVerticalGroup(
            content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_transactionsLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ttl_transactions)
                .addGap(32, 32, 32)
                .addGroup(content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_search_transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_search_transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );

        pane_content.addTab("tab5", content_transactions);

        background.add(pane_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 950, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(964, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_studiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_studiosMouseClicked
        // TODO add your handling code here:
        pane_content.setSelectedIndex(0);
    }//GEN-LAST:event_btn_studiosMouseClicked

    private void btn_publishersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_publishersMouseClicked
        // TODO add your handling code here:
        pane_content.setSelectedIndex(1);
    }//GEN-LAST:event_btn_publishersMouseClicked

    private void btn_gamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gamesMouseClicked
        // TODO add your handling code here:
        pane_content.setSelectedIndex(2);
    }//GEN-LAST:event_btn_gamesMouseClicked

    private void btn_transactionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transactionsMouseClicked
        // TODO add your handling code here:
        pane_content.setSelectedIndex(4);
    }//GEN-LAST:event_btn_transactionsMouseClicked

    private void btn_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseClicked
        // TODO add your handling code here:
        pane_content.setSelectedIndex(3);
    }//GEN-LAST:event_btn_usersMouseClicked

    private void btn_studiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_studiosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_studiosMouseEntered

    private void btn_studiosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_studiosMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_studiosMouseDragged

    private void pane_contentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pane_contentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pane_contentMouseClicked

    private void btn_search_studiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_studiosActionPerformed
        // TODO add your handling code here:
        tableModelStudios.setRowCount(0);
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database, user, pass);
            Statement stt = kon.createStatement();

            String SQL = "select * from studios where studio_name LIKE '%"
            + txt_search_studios.getText() + "%'";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                data[0] = res.getString(1);
                data[1] = res.getString(2);
                data[2] = res.getString(3);
                data[3] = res.getString(4);
                tableModelStudios.addRow(data);
            }
            res.close();
            stt.close();
            kon.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    
    }//GEN-LAST:event_btn_search_studiosActionPerformed

    private void btn_search_publishersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_publishersActionPerformed
        // TODO add your handling code here:
        tableModelPublishers.setRowCount(0);
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database, user, pass);
            Statement stt = kon.createStatement();

            String SQL = "select * from publishers where publisher_name LIKE '%"
            + txt_search_publishers.getText() + "%'";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                data[0] = res.getString(1);
                data[1] = res.getString(2);
                data[2] = res.getString(3);
                tableModelPublishers.addRow(data);
            }
            res.close();
            stt.close();
            kon.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_btn_search_publishersActionPerformed

    private void btn_search_gamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_gamesActionPerformed
        // TODO add your handling code here:
        tableModelGames.setRowCount(0);
        data = new String[7];
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database, user, pass);
            Statement stt = kon.createStatement();

            String SQL = "select * from games where game_title LIKE '%"
            + txt_search_games.getText() + "%'";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                data[0] = res.getString(1);
                data[1] = res.getString(2);
                data[2] = res.getString(3);
                data[3] = res.getString(4);
                data[4] = res.getString(5);
                data[5] = res.getString(6);
                data[6] = res.getString(7);

                tableModelGames.addRow(data);
            }
            res.close();
            stt.close();
            kon.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_btn_search_gamesActionPerformed

    private void btn_search_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_usersActionPerformed
        // TODO add your handling code here:
        tableModelUsers.setRowCount(0);
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database, user, pass);
            Statement stt = kon.createStatement();

            String SQL = "select * from users where name LIKE '%"
            + txt_search_users.getText() + "%'";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                data[0] = res.getString(1);
                data[1] = res.getString(2);
                data[2] = res.getString(3);
                data[3] = res.getString(4);
                tableModelUsers.addRow(data);
            }
            res.close();
            stt.close();
            kon.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_btn_search_usersActionPerformed

    private void btn_search_transactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_transactionsActionPerformed
        // TODO add your handling code here:
        tableModelTransactions.setRowCount(0);
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database, user, pass);
            Statement stt = kon.createStatement();

            String SQL = "select * from transactions where transactionID LIKE '%"
                    + txt_search_transactions.getText() + "%'";
            ResultSet res = stt.executeQuery(SQL);
            while (res.next()) {
                data[0] = res.getString(1);
                data[1] = res.getString(2);
                data[2] = res.getString(3);
                data[3] = res.getString(4);
                tableModelTransactions.addRow(data);
            }
            res.close();
            stt.close();
            kon.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_btn_search_transactionsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gameStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel btn_games;
    private javax.swing.JLabel btn_publishers;
    private tugasbesar.ButtonRound btn_search_games;
    private tugasbesar.ButtonRound btn_search_publishers;
    private tugasbesar.ButtonRound btn_search_studios;
    private tugasbesar.ButtonRound btn_search_transactions;
    private tugasbesar.ButtonRound btn_search_users;
    private javax.swing.JLabel btn_studios;
    private javax.swing.JLabel btn_transactions;
    private javax.swing.JLabel btn_users;
    private javax.swing.JPanel content_games;
    private javax.swing.JPanel content_publishers;
    private javax.swing.JPanel content_studios;
    private javax.swing.JPanel content_transactions;
    private javax.swing.JPanel content_users;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane pane_content;
    private javax.swing.JPanel pane_menus;
    private tugasbesar.PanelRound panelRound10;
    private tugasbesar.PanelRound panelRound11;
    private tugasbesar.PanelRound panelRound7;
    private tugasbesar.PanelRound panelRound8;
    private tugasbesar.PanelRound panelRound9;
    private javax.swing.JTable tabel_games;
    private javax.swing.JTable tabel_publishers;
    private tugasbesar.TableRound tabel_studios;
    private javax.swing.JTable tabel_transactions;
    private javax.swing.JTable tabel_users;
    private javax.swing.JLabel ttl_games;
    private javax.swing.JLabel ttl_publishers;
    private javax.swing.JLabel ttl_studios;
    private javax.swing.JLabel ttl_transactions;
    private javax.swing.JLabel ttl_users;
    private tugasbesar.TextFieldRound txt_search_games;
    private tugasbesar.TextFieldRound txt_search_publishers;
    private tugasbesar.TextFieldRound txt_search_studios;
    private tugasbesar.TextFieldRound txt_search_transactions;
    private tugasbesar.TextFieldRound txt_search_users;
    // End of variables declaration//GEN-END:variables
}
