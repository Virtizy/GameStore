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
    String driver,database,user,pass;
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
        settableload(1);
        settableload(2);
        
        tabel_studios.getTableHeader().setFont(new Font ("Inter",Font.BOLD,14));
        tabel_studios.getTableHeader().setOpaque(false);
        tabel_studios.getTableHeader().setBackground(new Color(40,46,57)); 
        tabel_studios.getTableHeader().setForeground(new Color(255,255,255));
        
        tabel_publishers.getTableHeader().setFont(new Font ("Inter",Font.BOLD,14));
        tabel_publishers.getTableHeader().setOpaque(false);
        tabel_publishers.getTableHeader().setBackground(new Color(40,46,57)); 
        tabel_publishers.getTableHeader().setForeground(new Color(255,255,255));
        
        tabel_games.getTableHeader().setFont(new Font ("Inter",Font.BOLD,14));
        tabel_games.getTableHeader().setOpaque(false);
        tabel_games.getTableHeader().setBackground(new Color(40,46,57)); 
        tabel_games.getTableHeader().setForeground(new Color(255,255,255));
        
        tabel_users.getTableHeader().setFont(new Font ("Inter",Font.BOLD,14));
        tabel_users.getTableHeader().setOpaque(false);
        tabel_users.getTableHeader().setBackground(new Color(40,46,57)); 
        tabel_users.getTableHeader().setForeground(new Color(255,255,255));
        
        tabel_transactions.getTableHeader().setFont(new Font ("Inter",Font.BOLD,14));
        tabel_transactions.getTableHeader().setOpaque(false);
        tabel_transactions.getTableHeader().setBackground(new Color(40,46,57)); 
        tabel_transactions.getTableHeader().setForeground(new Color(255,255,255));
    }
    private javax.swing.table.DefaultTableModel tableModelStudios = getDefaultTableModel(1);
    private javax.swing.table.DefaultTableModel tableModelPublishers = getDefaultTableModel(2);


    private javax.swing.table.DefaultTableModel getDefaultTableModel(int i) {
        switch(i){
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
        }
        return null;
    }

    String data[];
    private void settableload(int j)
    {
        String stat = "";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(database, user, pass);
            Statement stt = conn.createStatement();
            String SQL = "";
            ResultSet res;
            switch(j){
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
            }
        } catch(Exception ex){
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_studios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        content_publishers = new javax.swing.JPanel();
        ttl_publishers = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_publishers = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        content_games = new javax.swing.JPanel();
        ttl_games = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_games = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        content_users = new javax.swing.JPanel();
        ttl_users = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabel_users = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        content_transactions = new javax.swing.JPanel();
        ttl_transactions = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel_transactions = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();

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

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Search...");

        tabel_studios.setBackground(new java.awt.Color(31, 39, 51));
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

        jPanel1.setBackground(new java.awt.Color(111, 166, 32));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 33, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 34, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout content_studiosLayout = new javax.swing.GroupLayout(content_studios);
        content_studios.setLayout(content_studiosLayout);
        content_studiosLayout.setHorizontalGroup(
            content_studiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_studiosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(content_studiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(content_studiosLayout.createSequentialGroup()
                        .addGroup(content_studiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ttl_studios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        content_studiosLayout.setVerticalGroup(
            content_studiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_studiosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ttl_studios)
                .addGap(28, 28, 28)
                .addGroup(content_studiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pane_content.addTab("tab1", content_studios);

        content_publishers.setBackground(new java.awt.Color(22, 25, 32));

        ttl_publishers.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        ttl_publishers.setForeground(new java.awt.Color(255, 255, 255));
        ttl_publishers.setText("PUBLISHERS");

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Search...");

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

        jPanel2.setBackground(new java.awt.Color(111, 166, 32));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout content_publishersLayout = new javax.swing.GroupLayout(content_publishers);
        content_publishers.setLayout(content_publishersLayout);
        content_publishersLayout.setHorizontalGroup(
            content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_publishersLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(content_publishersLayout.createSequentialGroup()
                        .addGroup(content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttl_publishers)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        content_publishersLayout.setVerticalGroup(
            content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_publishersLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ttl_publishers)
                .addGap(28, 28, 28)
                .addGroup(content_publishersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pane_content.addTab("tab2", content_publishers);

        content_games.setBackground(new java.awt.Color(22, 25, 32));

        ttl_games.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        ttl_games.setForeground(new java.awt.Color(255, 255, 255));
        ttl_games.setText("GAMES");

        jPanel4.setBackground(new java.awt.Color(111, 166, 32));

        jLabel5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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

        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Search...");

        javax.swing.GroupLayout content_gamesLayout = new javax.swing.GroupLayout(content_games);
        content_games.setLayout(content_gamesLayout);
        content_gamesLayout.setHorizontalGroup(
            content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_gamesLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(content_gamesLayout.createSequentialGroup()
                        .addGroup(content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttl_games)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        content_gamesLayout.setVerticalGroup(
            content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_gamesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ttl_games)
                .addGap(28, 28, 28)
                .addGroup(content_gamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pane_content.addTab("tab3", content_games);

        content_users.setBackground(new java.awt.Color(22, 25, 32));

        ttl_users.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        ttl_users.setForeground(new java.awt.Color(255, 255, 255));
        ttl_users.setText("USERS");

        jPanel6.setBackground(new java.awt.Color(111, 166, 32));

        jLabel7.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADD");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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

        jTextField5.setBackground(new java.awt.Color(51, 51, 51));
        jTextField5.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("Search...");

        javax.swing.GroupLayout content_usersLayout = new javax.swing.GroupLayout(content_users);
        content_users.setLayout(content_usersLayout);
        content_usersLayout.setHorizontalGroup(
            content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_usersLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(content_usersLayout.createSequentialGroup()
                        .addGroup(content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttl_users)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        content_usersLayout.setVerticalGroup(
            content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_usersLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ttl_users)
                .addGap(28, 28, 28)
                .addGroup(content_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pane_content.addTab("tab4", content_users);

        content_transactions.setBackground(new java.awt.Color(22, 25, 32));
        content_transactions.setForeground(new java.awt.Color(255, 255, 255));

        ttl_transactions.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        ttl_transactions.setForeground(new java.awt.Color(255, 255, 255));
        ttl_transactions.setText("TRANSACTIONS");

        jPanel5.setBackground(new java.awt.Color(111, 166, 32));

        jLabel6.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabel_transactions.setBackground(new java.awt.Color(31, 39, 51));
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

        jTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jTextField4.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Search...");

        javax.swing.GroupLayout content_transactionsLayout = new javax.swing.GroupLayout(content_transactions);
        content_transactions.setLayout(content_transactionsLayout);
        content_transactionsLayout.setHorizontalGroup(
            content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_transactionsLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(content_transactionsLayout.createSequentialGroup()
                        .addGroup(content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttl_transactions)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        content_transactionsLayout.setVerticalGroup(
            content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_transactionsLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ttl_transactions)
                .addGap(28, 28, 28)
                .addGroup(content_transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        pack();
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
    private javax.swing.JLabel btn_studios;
    private javax.swing.JLabel btn_transactions;
    private javax.swing.JLabel btn_users;
    private javax.swing.JPanel content_games;
    private javax.swing.JPanel content_publishers;
    private javax.swing.JPanel content_studios;
    private javax.swing.JPanel content_transactions;
    private javax.swing.JPanel content_users;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTabbedPane pane_content;
    private javax.swing.JPanel pane_menus;
    private javax.swing.JTable tabel_games;
    private javax.swing.JTable tabel_publishers;
    private javax.swing.JTable tabel_studios;
    private javax.swing.JTable tabel_transactions;
    private javax.swing.JTable tabel_users;
    private javax.swing.JLabel ttl_games;
    private javax.swing.JLabel ttl_publishers;
    private javax.swing.JLabel ttl_studios;
    private javax.swing.JLabel ttl_transactions;
    private javax.swing.JLabel ttl_users;
    // End of variables declaration//GEN-END:variables
}
