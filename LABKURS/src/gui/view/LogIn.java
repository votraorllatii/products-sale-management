/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import BLL.Users;
import BLL.Klienti;
import BLL.Pozitat;
import BLL.Punetori;
import DAL.UsersRepository;
import DAL.PunetoriRepository;
import DAL.KlientiRepository;
import Exceptions.KlientiException;
import Exceptions.PunetoriException;
import Exceptions.UsersException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
        setTitle("CPDS - Login");

        LOGINBUTON.setHorizontalTextPosition(SwingConstants.LEFT);
        LOGINBUTON.setIconTextGap(15);

        //setFullScreen();//KJO
        setFormInMiddle();//KJO

    }

    UsersRepository ur = new UsersRepository();
    PunetoriRepository pr = new PunetoriRepository();
    KlientiRepository kr = new KlientiRepository();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parent_panel = new javax.swing.JPanel();
        background_login = new javax.swing.JPanel();
        IDField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LOGINBUTON = new javax.swing.JButton();
        NotCorrect = new javax.swing.JLabel();
        username_jlabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        password_jlabel = new javax.swing.JLabel();
        info_icon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(923, 572));
        setResizable(false);

        background_login.setBackground(new java.awt.Color(255, 255, 255));
        background_login.setAlignmentY(0.4F);

        IDField.setBorder(null);
        IDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFieldActionPerformed(evt);
            }
        });

        PasswordField.setBorder(null);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        LOGINBUTON.setText("LOG IN");
        LOGINBUTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINBUTONActionPerformed(evt);
            }
        });

        NotCorrect.setBackground(new java.awt.Color(153, 153, 255));
        NotCorrect.setForeground(new java.awt.Color(204, 0, 0));
        NotCorrect.setVisible(false);

        username_jlabel.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        username_jlabel.setForeground(new java.awt.Color(51, 51, 51));
        username_jlabel.setText("username:");

        jSeparator1.setBackground(new java.awt.Color(25, 25, 25));
        jSeparator1.setForeground(new java.awt.Color(25, 25, 25));
        jSeparator1.setFocusable(true);
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(new java.awt.Color(25, 25, 25));
        jSeparator2.setForeground(new java.awt.Color(25, 25, 25));
        jSeparator2.setFocusable(true);
        jSeparator2.setOpaque(true);

        password_jlabel.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        password_jlabel.setForeground(new java.awt.Color(51, 51, 51));
        password_jlabel.setText("password:");

        info_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/Info_20px.png"))); // NOI18N
        info_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                info_iconMouseClicked(evt);
            }
        });

        jScrollPane1.setToolTipText("");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(1);
        jTextArea1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 48)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 153, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setTabSize(0);
        jTextArea1.setText("   BPDS");
        jTextArea1.setAlignmentY(1.0F);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextArea1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTextArea1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleName("");

        jTextArea2.setColumns(5);
        jTextArea2.setFont(new java.awt.Font("Leelawadee UI Semilight", 3, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(204, 153, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(1);
        jTextArea2.setText("\n         BEAUTY PRODUCTS\n       DISTRIBUTION SYSTEM ");
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout background_loginLayout = new javax.swing.GroupLayout(background_login);
        background_login.setLayout(background_loginLayout);
        background_loginLayout.setHorizontalGroup(
            background_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_loginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(info_icon)
                .addGap(14, 14, 14))
            .addGroup(background_loginLayout.createSequentialGroup()
                .addGroup(background_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NotCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(background_loginLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addGroup(background_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_jlabel)
                            .addComponent(IDField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordField)
                            .addComponent(password_jlabel)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LOGINBUTON, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(447, Short.MAX_VALUE))
        );

        background_loginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {IDField, PasswordField});

        background_loginLayout.setVerticalGroup(
            background_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_loginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(username_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(password_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(LOGINBUTON, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(NotCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(info_icon)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout parent_panelLayout = new javax.swing.GroupLayout(parent_panel);
        parent_panel.setLayout(parent_panelLayout);
        parent_panelLayout.setHorizontalGroup(
            parent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parent_panelLayout.createSequentialGroup()
                .addComponent(background_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        parent_panelLayout.setVerticalGroup(
            parent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parent_panelLayout.createSequentialGroup()
                .addComponent(background_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parent_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(parent_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINBUTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINBUTONActionPerformed
        logohu();

    }//GEN-LAST:event_LOGINBUTONActionPerformed
    //KJO
    //private void setFullScreen() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        //this.setSize(xsize, ysize);

   // }

    //KJO
    private void setFormInMiddle() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }
    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        //logohu();
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void info_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_info_iconMouseClicked
        JOptionPane.showMessageDialog(this, "Ju lutem mbushni hapsirat e zbrazta me të dhënat e juaja për kyqje.");
    }//GEN-LAST:event_info_iconMouseClicked

    private void jTextArea1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextArea1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1CaretPositionChanged

    private void IDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDFieldActionPerformed

    public void logohu() {
        try {
            KlientiMainForm k;
            PunetoriMenaxherMainForm m;
            PunetoriMainForm p;

            String id_userit = IDField.getText().replaceAll("\\s", "");
            String passwordi_userit = PasswordField.getText().replaceAll("\\s", "");

            int id = 0;
            boolean ekzistonUseri = false;

            List<Users> listaUsers = ur.findAll();
            List<Klienti> listaKlienteve = kr.findAll();
            List<Punetori> listaPunetoreve = pr.findAll();

            try {
                for (int i = 0; i < listaUsers.size(); i++) {
                    if (listaUsers.get(i).getUIdlog().equals(id_userit)) {
                        if (listaUsers.get(i).getUPassword().equals(passwordi_userit)) {
                            id = listaUsers.get(i).getUId();
                        }
                        ekzistonUseri = true;
                    }
                }
            } catch (Exception e) {

            }

            if (ekzistonUseri == true) {

                for (int i = 0; i < listaKlienteve.size(); i++) {
                    if (listaKlienteve.get(i).getKlientiLogIn().getUId() == id) {
                        String emriKlientit = listaKlienteve.get(i).getEmri();
                        String mbiemriKlientit = listaKlienteve.get(i).getMbiemri();

                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        String koha = dtf.format(now);

                        k = new KlientiMainForm();
                        k.setVisible(true);
                        gui.view.KlientiMainForm.emriKlientitJlabel.setText(emriKlientit + " " + mbiemriKlientit);
                        gui.view.KlientiMainForm.kohaKyqjesField.setText(koha);

                        this.dispose();
                    }
                }
                try {
                    for (int j = 0; j < listaPunetoreve.size(); j++) {
                        if (listaPunetoreve.get(j).getPunetoriLogIn().getUId() == id) {
                            if (listaPunetoreve.get(j).getPozita().getEmri().equals("menaxher")) {
                                Integer usrId = listaPunetoreve.get(j).getPunetoriLogIn().getUId();
                                String emriPunetorit = listaPunetoreve.get(j).getEmri();
                                String mbiemriPunetorit = listaPunetoreve.get(j).getMbiemri();
                                String pozitaPunetorit = listaPunetoreve.get(j).getPozita().toString();
                                Pozitat pozitaObject = listaPunetoreve.get(j).getPozita();
                                int idPunetorit = listaPunetoreve.get(j).getPId();
                                int moshaPunetorit = listaPunetoreve.get(j).getMosha();
                                char gjinia = listaPunetoreve.get(j).getGjinia();
                                String adresaPunetorit = listaPunetoreve.get(j).getAdresa();

                                String userNamePunetori = id_userit;
                                String passworditPunetorit = passwordi_userit;

                                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                                LocalDateTime now = LocalDateTime.now();
                                String koha = dtf.format(now);

                                m = new PunetoriMenaxherMainForm();
                                m.setVisible(true);
                                gui.view.PunetoriMenaxherMainForm.emriPunetoritJlabel.setText(emriPunetorit + " " + mbiemriPunetorit);
                                gui.view.PunetoriMenaxherMainForm.pozitaPunetoritJlabel.setText(pozitaPunetorit);
                                gui.view.PunetoriMenaxherMainForm.kohaKyqjesField.setText(koha);

                                gui.view.PunetoriMenaxherMainForm.idPunetoritSave = idPunetorit;

                                gui.view.PunetoriMenaxherMainForm.usernameId = userNamePunetori;
                                gui.view.PunetoriMenaxherMainForm.passwordUsr = passworditPunetorit;

                                gui.view.PunetoriMenaxherMainForm.u = usrId.toString();

                                this.dispose();

                            } else if (listaPunetoreve.get(j).getPozita().getEmri().equals("Administrat")) {
                                String emriPunetorit = listaPunetoreve.get(j).getEmri();
                                String mbiemriPunetorit = listaPunetoreve.get(j).getMbiemri();
                                String pozitaPunetorit = listaPunetoreve.get(j).getPozita().toString();

                                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                                LocalDateTime now = LocalDateTime.now();
                                String koha = dtf.format(now);

                                p = new PunetoriMainForm();
                                p.setVisible(true);
                                gui.view.PunetoriMainForm.emriPunetoritJlabel.setText(emriPunetorit + " " + mbiemriPunetorit);
                                gui.view.PunetoriMainForm.pozitaPunetoritJlabel.setText(pozitaPunetorit);
                                gui.view.PunetoriMainForm.kohaKyqjesField.setText(koha);
                                this.dispose();
                            }

                        }
                    }
                } catch (Exception e) {

                }

            } else {
                String passwordiusername_Gabim = "ID ose Passwordi janë gabim, ju lutem provoni përseri.!";
                NotCorrect.setText(passwordiusername_Gabim);
                NotCorrect.setVisible(true);

                int delay = 6000; //milliseconds
                ActionListener taskPerformer = (ActionEvent evt) -> {
                    NotCorrect.setVisible(false);
                };
                new Timer(delay, taskPerformer).start();
            }

        } catch (KlientiException | PunetoriException | UsersException ex) {

        }
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDField;
    private javax.swing.JButton LOGINBUTON;
    private javax.swing.JLabel NotCorrect;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel background_login;
    private javax.swing.JLabel info_icon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel parent_panel;
    private javax.swing.JLabel password_jlabel;
    private javax.swing.JLabel username_jlabel;
    // End of variables declaration//GEN-END:variables
}
