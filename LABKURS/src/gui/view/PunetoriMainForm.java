package gui.view;

import Exceptions.FaturaException;
import Exceptions.FaturaHyreseException;
import Exceptions.KomunaException;
import Exceptions.ProduktiException;
import Exceptions.QytetiException;
import Exceptions.StokuException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PunetoriMainForm extends javax.swing.JFrame {

    public PunetoriMainForm() {
        initComponents();

        setFullScreen();//KJO
        setFormInMiddle();//KJO

    }

    //KJO
    private void setFullScreen() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);

    }

    //KJO
    private void setFormInMiddle() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        punetoriAdministrateBackground = new javax.swing.JPanel();
        ShitjetBtn = new javax.swing.JButton();
        StokuBtn = new javax.swing.JButton();
        LokacionetBtn = new javax.swing.JButton();
        ProduktetBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lg = new javax.swing.JButton();
        emriPuntorit = new javax.swing.JLabel();
        pozitaPuntorit = new javax.swing.JLabel();
        kohaKyqjes = new javax.swing.JLabel();
        emriPunetoritJlabel = new javax.swing.JLabel();
        pozitaPunetoritJlabel = new javax.swing.JLabel();
        kohaKyqjesField = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1205, 570));
        setResizable(false);

        punetoriAdministrateBackground.setBackground(new java.awt.Color(255, 255, 255));
        punetoriAdministrateBackground.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        ShitjetBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ShitjetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/shitjet_vectorized.png"))); // NOI18N
        ShitjetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShitjetBtnActionPerformed(evt);
            }
        });

        StokuBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StokuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/stoku_vectorized.png"))); // NOI18N
        StokuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StokuBtnActionPerformed(evt);
            }
        });

        LokacionetBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LokacionetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/lokacionet_vectorized_vectorized.png"))); // NOI18N
        LokacionetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LokacionetBtnActionPerformed(evt);
            }
        });

        ProduktetBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ProduktetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/produktet_vectorized.png"))); // NOI18N
        ProduktetBtn.setBorderPainted(false);
        ProduktetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProduktetBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lg.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/icons8-export-48.png"))); // NOI18N
        lg.setText("LOG OUT");
        lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgActionPerformed(evt);
            }
        });

        emriPuntorit.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        emriPuntorit.setText("Emri i punëtorit:");

        pozitaPuntorit.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        pozitaPuntorit.setText("Pozita e punëtorit:");

        kohaKyqjes.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        kohaKyqjes.setText("Koha e kyqjes:");

        emriPunetoritJlabel.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N

        pozitaPunetoritJlabel.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N

        kohaKyqjesField.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(45, 45, 45));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(new java.awt.Color(45, 45, 45));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setOpaque(true);

        jTextArea1.setColumns(5);
        jTextArea1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 153, 255));
        jTextArea1.setRows(1);
        jTextArea1.setText("         BPDS");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(4);
        jTextArea2.setFont(new java.awt.Font("Leelawadee UI Semilight", 3, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(204, 153, 255));
        jTextArea2.setText("BEAUTY PRODUCTS\nDISTRIBUTION SYSTEM");
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(5);
        jTextArea3.setFont(new java.awt.Font("Leelawadee UI Semilight", 3, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(204, 153, 255));
        jTextArea3.setRows(1);
        jTextArea3.setText("\n\nADMINISTRATOR DASHBOARD");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kohaKyqjes)
                    .addComponent(pozitaPuntorit)
                    .addComponent(emriPuntorit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(emriPunetoritJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pozitaPunetoritJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kohaKyqjesField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(lg)
                        .addGap(17, 17, 17))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emriPuntorit)
                            .addComponent(emriPunetoritJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lg, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pozitaPuntorit)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(pozitaPunetoritJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kohaKyqjes)
                            .addComponent(kohaKyqjesField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout punetoriAdministrateBackgroundLayout = new javax.swing.GroupLayout(punetoriAdministrateBackground);
        punetoriAdministrateBackground.setLayout(punetoriAdministrateBackgroundLayout);
        punetoriAdministrateBackgroundLayout.setHorizontalGroup(
            punetoriAdministrateBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(punetoriAdministrateBackgroundLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(ShitjetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(LokacionetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ProduktetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(StokuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        punetoriAdministrateBackgroundLayout.setVerticalGroup(
            punetoriAdministrateBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(punetoriAdministrateBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addGroup(punetoriAdministrateBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProduktetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LokacionetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShitjetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StokuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(punetoriAdministrateBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(punetoriAdministrateBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayer(punetoriAdministrateBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProduktetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProduktetBtnActionPerformed
        ProduktiForm pf = null;
        try {
            pf = new ProduktiForm();
        } catch (ProduktiException ex) {
            Logger.getLogger(PunetoriMainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (StokuException ex) {
            Logger.getLogger(PunetoriMainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(pf);
        pf.show();
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = pf.getSize();
        pf.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }//GEN-LAST:event_ProduktetBtnActionPerformed


    private void lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgActionPerformed
        try {
            int choice;
            choice = JOptionPane.showConfirmDialog(null, "Deshironi te dilni?", "Logout", JOptionPane.INFORMATION_MESSAGE);
            if (choice == JOptionPane.YES_OPTION) {
                dispose();
                LogIn a = new LogIn();
                a.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lgActionPerformed

    private void LokacionetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LokacionetBtnActionPerformed
        try {
            QytetiForm qf = null;

            try {
                qf = new QytetiForm();
            } catch (KomunaException ex) {
                Logger.getLogger(PunetoriMainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            jDesktopPane1.add(qf);
            qf.show();
            /*
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = qf.getSize();
            qf.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
             */
        } catch (QytetiException ex) {
        }
    }//GEN-LAST:event_LokacionetBtnActionPerformed

    private void StokuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StokuBtnActionPerformed
        StokuForm sf = new StokuForm();
        jDesktopPane1.add(sf);
        sf.show();
        /*
       Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = sf.getSize();
            sf.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
         */

    }//GEN-LAST:event_StokuBtnActionPerformed

    private void ShitjetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShitjetBtnActionPerformed
        ShitjetForm shf = new ShitjetForm();
        jDesktopPane1.add(shf);
        shf.show();
        /*
        Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = shf.getSize();
            shf.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
         */
    }//GEN-LAST:event_ShitjetBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PunetoriMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PunetoriMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PunetoriMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PunetoriMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PunetoriMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LokacionetBtn;
    private javax.swing.JButton ProduktetBtn;
    private javax.swing.JButton ShitjetBtn;
    private javax.swing.JButton StokuBtn;
    public static javax.swing.JLabel emriPunetoritJlabel;
    private javax.swing.JLabel emriPuntorit;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    public static javax.swing.JLabel kohaKyqjes;
    public static javax.swing.JLabel kohaKyqjesField;
    private javax.swing.JButton lg;
    public static javax.swing.JLabel pozitaPunetoritJlabel;
    private javax.swing.JLabel pozitaPuntorit;
    private javax.swing.JPanel punetoriAdministrateBackground;
    // End of variables declaration//GEN-END:variables

}
