/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasbesar;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class login_page extends javax.swing.JFrame {

    /**
     * Creates new form login_page
     */
    public login_page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pane_login = new javax.swing.JTabbedPane();
        welcome_page = new javax.swing.JPanel();
        title_welcome = new javax.swing.JPanel();
        txt_welcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        title_select = new javax.swing.JPanel();
        btn_admin = new javax.swing.JButton();
        btn_user = new javax.swing.JButton();
        login_admin = new javax.swing.JPanel();
        admin_page = new javax.swing.JPanel();
        title_admin = new javax.swing.JPanel();
        txt_admin = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        title_login_admin = new javax.swing.JPanel();
        txt_username = new javax.swing.JLabel();
        username_admin = new javax.swing.JTextField();
        txt_password = new javax.swing.JLabel();
        password_admin = new javax.swing.JPasswordField();
        show_password_admin = new javax.swing.JCheckBox();
        txt_register = new javax.swing.JLabel();
        btn_admin_login = new javax.swing.JButton();
        login_user = new javax.swing.JPanel();
        title_user = new javax.swing.JPanel();
        txt_user = new javax.swing.JLabel();
        btn_back1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        title_login_user = new javax.swing.JPanel();
        txt_username2 = new javax.swing.JLabel();
        username_user = new javax.swing.JTextField();
        txt_password1 = new javax.swing.JLabel();
        password_user = new javax.swing.JPasswordField();
        show_password_user = new javax.swing.JCheckBox();
        txt_register2 = new javax.swing.JLabel();
        btn_user_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(22, 25, 32));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome_page.setBackground(new java.awt.Color(22, 25, 32));

        title_welcome.setBackground(new java.awt.Color(0, 0, 0));

        txt_welcome.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        txt_welcome.setForeground(new java.awt.Color(255, 255, 255));
        txt_welcome.setText("WELCOME");

        javax.swing.GroupLayout title_welcomeLayout = new javax.swing.GroupLayout(title_welcome);
        title_welcome.setLayout(title_welcomeLayout);
        title_welcomeLayout.setHorizontalGroup(
            title_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_welcomeLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(txt_welcome)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        title_welcomeLayout.setVerticalGroup(
            title_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_welcomeLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(txt_welcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PLEASE SELECT");

        title_select.setBackground(new java.awt.Color(32, 49, 59));

        btn_admin.setBackground(new java.awt.Color(0, 96, 213));
        btn_admin.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        btn_admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_admin.setText("ADMIN");
        btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionPerformed(evt);
            }
        });

        btn_user.setBackground(new java.awt.Color(0, 96, 213));
        btn_user.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        btn_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_user.setText("USER");
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout title_selectLayout = new javax.swing.GroupLayout(title_select);
        title_select.setLayout(title_selectLayout);
        title_selectLayout.setHorizontalGroup(
            title_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_selectLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(title_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );
        title_selectLayout.setVerticalGroup(
            title_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_selectLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout welcome_pageLayout = new javax.swing.GroupLayout(welcome_page);
        welcome_page.setLayout(welcome_pageLayout);
        welcome_pageLayout.setHorizontalGroup(
            welcome_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_pageLayout.createSequentialGroup()
                .addComponent(title_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(welcome_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcome_pageLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(title_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(welcome_pageLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        welcome_pageLayout.setVerticalGroup(
            welcome_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(welcome_pageLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(title_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        pane_login.addTab("tab1", welcome_page);

        login_admin.setBackground(new java.awt.Color(22, 25, 32));

        admin_page.setBackground(new java.awt.Color(22, 25, 32));

        title_admin.setBackground(new java.awt.Color(0, 0, 0));

        txt_admin.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        txt_admin.setForeground(new java.awt.Color(255, 255, 255));
        txt_admin.setText("ADMIN");

        btn_back.setBackground(new java.awt.Color(0, 0, 0));
        btn_back.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("GO BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout title_adminLayout = new javax.swing.GroupLayout(title_admin);
        title_admin.setLayout(title_adminLayout);
        title_adminLayout.setHorizontalGroup(
            title_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_adminLayout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(txt_admin)
                .addGap(170, 170, 170))
            .addGroup(title_adminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        title_adminLayout.setVerticalGroup(
            title_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_adminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_admin)
                .addGap(272, 272, 272))
        );

        jLabel2.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");

        title_login_admin.setBackground(new java.awt.Color(32, 49, 59));

        txt_username.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txt_username.setForeground(new java.awt.Color(4, 175, 244));
        txt_username.setText("USERNAME");

        username_admin.setBackground(new java.awt.Color(255, 255, 255));
        username_admin.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        txt_password.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txt_password.setForeground(new java.awt.Color(4, 175, 244));
        txt_password.setText("PASSWORD");

        password_admin.setBackground(new java.awt.Color(255, 255, 255));
        password_admin.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        password_admin.setForeground(new java.awt.Color(0, 0, 0));

        show_password_admin.setBackground(new java.awt.Color(32, 49, 59));
        show_password_admin.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        show_password_admin.setForeground(new java.awt.Color(4, 175, 244));
        show_password_admin.setText("Show Password");
        show_password_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_password_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout title_login_adminLayout = new javax.swing.GroupLayout(title_login_admin);
        title_login_admin.setLayout(title_login_adminLayout);
        title_login_adminLayout.setHorizontalGroup(
            title_login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_login_adminLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(title_login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(title_login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(password_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(username_admin)
                        .addComponent(txt_username)
                        .addComponent(txt_password))
                    .addComponent(show_password_admin))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        title_login_adminLayout.setVerticalGroup(
            title_login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_login_adminLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txt_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show_password_admin)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        txt_register.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txt_register.setForeground(new java.awt.Color(4, 175, 244));
        txt_register.setText("Don't have an account?");

        btn_admin_login.setBackground(new java.awt.Color(0, 96, 213));
        btn_admin_login.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn_admin_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_admin_login.setText("LOGIN");
        btn_admin_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout admin_pageLayout = new javax.swing.GroupLayout(admin_page);
        admin_page.setLayout(admin_pageLayout);
        admin_pageLayout.setHorizontalGroup(
            admin_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_pageLayout.createSequentialGroup()
                .addGroup(admin_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_register)
                    .addGroup(admin_pageLayout.createSequentialGroup()
                        .addComponent(title_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(admin_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(admin_pageLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel2))
                            .addGroup(admin_pageLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(title_login_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(admin_pageLayout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(btn_admin_login, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        admin_pageLayout.setVerticalGroup(
            admin_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(admin_pageLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(title_login_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_register)
                .addGap(45, 45, 45)
                .addComponent(btn_admin_login)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout login_adminLayout = new javax.swing.GroupLayout(login_admin);
        login_admin.setLayout(login_adminLayout);
        login_adminLayout.setHorizontalGroup(
            login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(login_adminLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(admin_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        login_adminLayout.setVerticalGroup(
            login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
            .addGroup(login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(login_adminLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(admin_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pane_login.addTab("tab2", login_admin);

        login_user.setBackground(new java.awt.Color(22, 25, 32));

        title_user.setBackground(new java.awt.Color(0, 0, 0));

        txt_user.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setText("USER");

        btn_back1.setBackground(new java.awt.Color(0, 0, 0));
        btn_back1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn_back1.setForeground(new java.awt.Color(255, 255, 255));
        btn_back1.setText("GO BACK");
        btn_back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout title_userLayout = new javax.swing.GroupLayout(title_user);
        title_user.setLayout(title_userLayout);
        title_userLayout.setHorizontalGroup(
            title_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_userLayout.createSequentialGroup()
                .addGroup(title_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(title_userLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(txt_user))
                    .addGroup(title_userLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_back1)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        title_userLayout.setVerticalGroup(
            title_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back1)
                .addGap(241, 241, 241)
                .addComponent(txt_user)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGIN");

        title_login_user.setBackground(new java.awt.Color(32, 49, 59));

        txt_username2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txt_username2.setForeground(new java.awt.Color(4, 175, 244));
        txt_username2.setText("USERNAME");

        username_user.setBackground(new java.awt.Color(255, 255, 255));
        username_user.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        txt_password1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txt_password1.setForeground(new java.awt.Color(4, 175, 244));
        txt_password1.setText("PASSWORD");

        password_user.setBackground(new java.awt.Color(255, 255, 255));
        password_user.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        password_user.setForeground(new java.awt.Color(0, 0, 0));

        show_password_user.setBackground(new java.awt.Color(32, 49, 59));
        show_password_user.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        show_password_user.setForeground(new java.awt.Color(4, 175, 244));
        show_password_user.setText("Show Password");
        show_password_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_password_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout title_login_userLayout = new javax.swing.GroupLayout(title_login_user);
        title_login_user.setLayout(title_login_userLayout);
        title_login_userLayout.setHorizontalGroup(
            title_login_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_login_userLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(title_login_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(title_login_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(password_user)
                        .addComponent(username_user, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(txt_username2)
                        .addComponent(txt_password1))
                    .addComponent(show_password_user))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        title_login_userLayout.setVerticalGroup(
            title_login_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_login_userLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txt_username2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_user, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_password1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show_password_user)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        txt_register2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txt_register2.setForeground(new java.awt.Color(4, 175, 244));
        txt_register2.setText("Don't have an account?");

        btn_user_login.setBackground(new java.awt.Color(0, 96, 213));
        btn_user_login.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btn_user_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_user_login.setText("LOGIN");
        btn_user_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_userLayout = new javax.swing.GroupLayout(login_user);
        login_user.setLayout(login_userLayout);
        login_userLayout.setHorizontalGroup(
            login_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_userLayout.createSequentialGroup()
                .addGroup(login_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_register2)
                    .addGroup(login_userLayout.createSequentialGroup()
                        .addComponent(title_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(login_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(login_userLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel3))
                            .addGroup(login_userLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(title_login_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(login_userLayout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(btn_user_login, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        login_userLayout.setVerticalGroup(
            login_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(login_userLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(title_login_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_register2)
                .addGap(45, 45, 45)
                .addComponent(btn_user_login)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pane_login.addTab("tab3", login_user);

        jPanel3.add(pane_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 950, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(964, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionPerformed
        // TODO add your handling code here:
        pane_login.setSelectedIndex(1);
    }//GEN-LAST:event_btn_adminActionPerformed

    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
        // TODO add your handling code here:
        pane_login.setSelectedIndex(2);
    }//GEN-LAST:event_btn_userActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        pane_login.setSelectedIndex(0);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back1ActionPerformed
        // TODO add your handling code here:
        pane_login.setSelectedIndex(0);
    }//GEN-LAST:event_btn_back1ActionPerformed

    private void btn_admin_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_loginActionPerformed
        // TODO add your handling code here:
        if(username_admin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out username");
        }
        else if(password_admin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out password");
        }
        else if(username_admin.getText().contains("Faris")&& password_admin.getText().contains("faris"))
        {
            gameStore game = new gameStore();
            game.setVisible(true);
        
            this.setVisible(false);
        }
        else if(username_admin.getText().contains("Rashad")&& password_admin.getText().contains("rashad"))
        {
            gameStore game = new gameStore();
            game.setVisible(true);
        
            this.setVisible(false);
        }
        else if(username_admin.getText().contains("Raihan")&& password_admin.getText().contains("raihan"))
        {
            gameStore game = new gameStore();
            game.setVisible(true);
        
            this.setVisible(false);
        }
        else if(username_admin.getText().contains("Rama")&& password_admin.getText().contains("rama"))
        {
            gameStore game = new gameStore();
            game.setVisible(true);
        
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Wrong username or password!!!",
                    "Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_admin_loginActionPerformed

    private void btn_user_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_loginActionPerformed
        // TODO add your handling code here:
        if(username_user.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out username");
        }
        else if(password_user.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out password");
        }
        else{
            JOptionPane.showMessageDialog(null, "Wrong username or password!!!",
                    "Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_user_loginActionPerformed

    private void show_password_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_password_adminActionPerformed
        // TODO add your handling code here:
        if(show_password_admin.isSelected()){
            password_admin.setEchoChar((char)0);
        }
        else{
            password_admin.setEchoChar('*');
        }
    }//GEN-LAST:event_show_password_adminActionPerformed

    private void show_password_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_password_userActionPerformed
        // TODO add your handling code here:
        if(show_password_user.isSelected()){
            password_user.setEchoChar((char)0);
        }
        else{
            password_user.setEchoChar('*');
        }
    }//GEN-LAST:event_show_password_userActionPerformed

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
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin_page;
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_admin_login;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_back1;
    private javax.swing.JButton btn_user;
    private javax.swing.JButton btn_user_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel login_admin;
    private javax.swing.JPanel login_user;
    private javax.swing.JTabbedPane pane_login;
    private javax.swing.JPasswordField password_admin;
    private javax.swing.JPasswordField password_user;
    private javax.swing.JCheckBox show_password_admin;
    private javax.swing.JCheckBox show_password_user;
    private javax.swing.JPanel title_admin;
    private javax.swing.JPanel title_login_admin;
    private javax.swing.JPanel title_login_user;
    private javax.swing.JPanel title_select;
    private javax.swing.JPanel title_user;
    private javax.swing.JPanel title_welcome;
    private javax.swing.JLabel txt_admin;
    private javax.swing.JLabel txt_password;
    private javax.swing.JLabel txt_password1;
    private javax.swing.JLabel txt_register;
    private javax.swing.JLabel txt_register2;
    private javax.swing.JLabel txt_user;
    private javax.swing.JLabel txt_username;
    private javax.swing.JLabel txt_username2;
    private javax.swing.JLabel txt_welcome;
    private javax.swing.JTextField username_admin;
    private javax.swing.JTextField username_user;
    private javax.swing.JPanel welcome_page;
    // End of variables declaration//GEN-END:variables
}
