/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import Exceptions.PunetoriException;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class PunetoriMenaxherMainForm extends javax.swing.JFrame {

    public static int idPunetoritSave;

    public static String u;
    public static String usernameId;
    public static String passwordUsr;

    public PunetoriMenaxherMainForm() {
        initComponents();
        setTitle("Punetori - Menaxher - Main Form");

      //  setFullScreen();//KJO
        setFormInMiddle();//KJO

        singOutIconPosition();
    }
//
//    private void setFullScreen() {
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int xsize = (int) tk.getScreenSize().getWidth();
//        int ysize = (int) tk.getScreenSize().getHeight();
//        this.setSize(xsize, ysize);
//
//    }

    private void setFormInMiddle() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        background_panel_main = new javax.swing.JPanel();
        menaxho_Punetoret_Main = new javax.swing.JButton();
        menaxho_Klientet_Main = new javax.swing.JButton();
        background_panel_upper = new javax.swing.JPanel();
        emriPunetoritJlabel = new javax.swing.JLabel();
        pozitaPunetoritJlabel = new javax.swing.JLabel();
        emriPuntorit = new javax.swing.JLabel();
        pozitaPuntorit = new javax.swing.JLabel();
        kohaKyqjes = new javax.swing.JLabel();
        kohaKyqjesField = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        logoutBtnMenaxheri = new javax.swing.JButton();
        profiliImBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        menaxho_Pozitat_Main = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1205, 605));
        setResizable(false);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setForeground(new java.awt.Color(255, 255, 255));
        desktopPane.setMaximumSize(new java.awt.Dimension(3000, 2500));
        desktopPane.setMinimumSize(new java.awt.Dimension(1205, 594));
        desktopPane.setPreferredSize(new java.awt.Dimension(3000, 2500));
        desktopPane.setRequestFocusEnabled(false);
        desktopPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                desktopPaneMouseEntered(evt);
            }
        });

        background_panel_main.setBackground(new java.awt.Color(255, 255, 255));
        background_panel_main.setMaximumSize(new java.awt.Dimension(2000, 1500));
        background_panel_main.setMinimumSize(new java.awt.Dimension(1205, 594));
        background_panel_main.setPreferredSize(new java.awt.Dimension(2000, 1500));
        background_panel_main.setVerifyInputWhenFocusTarget(false);

        menaxho_Punetoret_Main.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        menaxho_Punetoret_Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/menaxhopunetoret_vectorized.png"))); // NOI18N
        menaxho_Punetoret_Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menaxho_Punetoret_MainMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menaxho_Punetoret_MainMousePressed(evt);
            }
        });
        menaxho_Punetoret_Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menaxho_Punetoret_MainActionPerformed(evt);
            }
        });

        menaxho_Klientet_Main.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        menaxho_Klientet_Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/menaxhoKlientet_vectorized.png"))); // NOI18N
        menaxho_Klientet_Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menaxho_Klientet_MainActionPerformed(evt);
            }
        });

        background_panel_upper.setBackground(new java.awt.Color(255, 255, 255));
        background_panel_upper.setMaximumSize(new java.awt.Dimension(1204, 151));
        background_panel_upper.setMinimumSize(new java.awt.Dimension(1204, 151));
        background_panel_upper.setPreferredSize(new java.awt.Dimension(1204, 151));

        emriPunetoritJlabel.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N

        pozitaPunetoritJlabel.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N

        emriPuntorit.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        emriPuntorit.setText("emri i punëtorit:");

        pozitaPuntorit.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        pozitaPuntorit.setText("pozita e punëtorit:");

        kohaKyqjes.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        kohaKyqjes.setText("koha e kyqjes:");

        kohaKyqjesField.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(17, 17, 17));
        jSeparator1.setForeground(new java.awt.Color(17, 17, 17));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(new java.awt.Color(17, 17, 17));
        jSeparator2.setForeground(new java.awt.Color(17, 17, 17));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setOpaque(true);

        logoutBtnMenaxheri.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        logoutBtnMenaxheri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/icons8-export-48.png"))); // NOI18N
        logoutBtnMenaxheri.setText("LOG OUT");
        logoutBtnMenaxheri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnMenaxheriActionPerformed(evt);
            }
        });

        profiliImBtn.setBackground(new java.awt.Color(255, 255, 255));
        profiliImBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        profiliImBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/icons8-male-user-40.png"))); // NOI18N
        profiliImBtn.setText("PROFILI IM");
        profiliImBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profiliImBtnActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(204, 153, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("       \n\n          MANAGER DASHBOARD");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout background_panel_upperLayout = new javax.swing.GroupLayout(background_panel_upper);
        background_panel_upper.setLayout(background_panel_upperLayout);
        background_panel_upperLayout.setHorizontalGroup(
            background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_panel_upperLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pozitaPuntorit)
                    .addComponent(emriPuntorit)
                    .addComponent(kohaKyqjes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kohaKyqjesField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pozitaPunetoritJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emriPunetoritJlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtnMenaxheri, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profiliImBtn))
                .addGap(0, 317, Short.MAX_VALUE))
        );
        background_panel_upperLayout.setVerticalGroup(
            background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_panel_upperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background_panel_upperLayout.createSequentialGroup()
                        .addGroup(background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(background_panel_upperLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(background_panel_upperLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emriPunetoritJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emriPuntorit))
                                        .addGap(18, 18, 18)
                                        .addGroup(background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pozitaPuntorit)
                                            .addComponent(pozitaPunetoritJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19)
                                        .addGroup(background_panel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(kohaKyqjes)
                                            .addComponent(kohaKyqjesField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panel_upperLayout.createSequentialGroup()
                        .addComponent(logoutBtnMenaxheri, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profiliImBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        menaxho_Pozitat_Main.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        menaxho_Pozitat_Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/menaxhoPozitat_vectorized.png"))); // NOI18N
        menaxho_Pozitat_Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menaxho_Pozitat_MainActionPerformed(evt);
            }
        });

        jTextArea4.setColumns(5);
        jTextArea4.setFont(new java.awt.Font("Leelawadee UI Semilight", 3, 14)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(204, 153, 255));
        jTextArea4.setRows(1);
        jTextArea4.setText("           BEAUTY PRODUCTS \n         DISTRIBUTION SYSTEM");
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea1.setColumns(5);
        jTextArea1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 153, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setText("           \n           BPDS");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea3.setColumns(5);
        jTextArea3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(1);
        jTextArea3.setText("MANAGE EMPLOYEES");
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea5.setColumns(5);
        jTextArea5.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jTextArea5.setRows(1);
        jTextArea5.setText("  MANAGE CLIENTS");
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea6.setColumns(5);
        jTextArea6.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jTextArea6.setRows(1);
        jTextArea6.setText("MANAGE POSITIONS");
        jScrollPane6.setViewportView(jTextArea6);

        javax.swing.GroupLayout background_panel_mainLayout = new javax.swing.GroupLayout(background_panel_main);
        background_panel_main.setLayout(background_panel_mainLayout);
        background_panel_mainLayout.setHorizontalGroup(
            background_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_panel_mainLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(background_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background_panel_mainLayout.createSequentialGroup()
                        .addGroup(background_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(background_panel_upper, javax.swing.GroupLayout.DEFAULT_SIZE, 1424, Short.MAX_VALUE))
                    .addGroup(background_panel_mainLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(menaxho_Punetoret_Main, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(menaxho_Klientet_Main, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(menaxho_Pozitat_Main, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
            .addGroup(background_panel_mainLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        background_panel_mainLayout.setVerticalGroup(
            background_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panel_mainLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(background_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(background_panel_mainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(background_panel_upper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menaxho_Klientet_Main, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(menaxho_Pozitat_Main, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(menaxho_Punetoret_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(background_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background_panel_mainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(jScrollPane6)))
                    .addGroup(background_panel_mainLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        desktopPane.add(background_panel_main);
        background_panel_main.setBounds(0, -20, 1810, 1000);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singOutIconPosition() {
        logoutBtnMenaxheri.setHorizontalTextPosition(SwingConstants.LEFT);
        profiliImBtn.setHorizontalTextPosition(SwingConstants.LEFT);
        logoutBtnMenaxheri.setIconTextGap(5);
        profiliImBtn.setIconTextGap(5);

    }
    private void menaxho_Pozitat_MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menaxho_Pozitat_MainActionPerformed
        PozitaInternalForm pf = new PozitaInternalForm();
        desktopPane.add(pf);
        pf.show();
        pf.setFocusable(true);
    }//GEN-LAST:event_menaxho_Pozitat_MainActionPerformed

    private void desktopPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desktopPaneMouseEntered

    }//GEN-LAST:event_desktopPaneMouseEntered

    private void menaxho_Klientet_MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menaxho_Klientet_MainActionPerformed
        KlientiInternalForm kiform = new KlientiInternalForm();
        desktopPane.add(kiform);
        kiform.show();
        kiform.setFocusable(true);
    }//GEN-LAST:event_menaxho_Klientet_MainActionPerformed

    private void profiliImBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profiliImBtnActionPerformed
        ProfiliImMenaxher pf = new ProfiliImMenaxher();
        desktopPane.add(pf);
        pf.show();
        pf.setFocusable(true);
    }//GEN-LAST:event_profiliImBtnActionPerformed

    private void logoutBtnMenaxheriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnMenaxheriActionPerformed
        try {
            int choice;
            choice = JOptionPane.showConfirmDialog(null, "Deshironi te dilni?", "Logout", JOptionPane.INFORMATION_MESSAGE);
            if (choice == JOptionPane.YES_OPTION) {
                this.dispose();
                LogIn a = new LogIn();
                a.setVisible(true);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_logoutBtnMenaxheriActionPerformed

    private void menaxho_Punetoret_MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menaxho_Punetoret_MainActionPerformed
        try {
            PunetoriInternalForm pf = new PunetoriInternalForm();
            desktopPane.add(pf);
            pf.show();
            pf.setFocusable(true);
        } catch (PunetoriException ex) {

        }

    }//GEN-LAST:event_menaxho_Punetoret_MainActionPerformed

    private void menaxho_Punetoret_MainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menaxho_Punetoret_MainMousePressed

    }//GEN-LAST:event_menaxho_Punetoret_MainMousePressed

    private void menaxho_Punetoret_MainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menaxho_Punetoret_MainMouseEntered

    }//GEN-LAST:event_menaxho_Punetoret_MainMouseEntered

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
            java.util.logging.Logger.getLogger(PunetoriMenaxherMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PunetoriMenaxherMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PunetoriMenaxherMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PunetoriMenaxherMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PunetoriMenaxherMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_panel_main;
    private javax.swing.JPanel background_panel_upper;
    public static javax.swing.JDesktopPane desktopPane;
    public static javax.swing.JLabel emriPunetoritJlabel;
    private javax.swing.JLabel emriPuntorit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    public static javax.swing.JLabel kohaKyqjes;
    public static javax.swing.JLabel kohaKyqjesField;
    private javax.swing.JButton logoutBtnMenaxheri;
    private javax.swing.JButton menaxho_Klientet_Main;
    private javax.swing.JButton menaxho_Pozitat_Main;
    private javax.swing.JButton menaxho_Punetoret_Main;
    public static javax.swing.JLabel pozitaPunetoritJlabel;
    private javax.swing.JLabel pozitaPuntorit;
    private javax.swing.JButton profiliImBtn;
    // End of variables declaration//GEN-END:variables

}
