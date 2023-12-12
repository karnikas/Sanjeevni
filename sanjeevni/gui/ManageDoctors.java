package sanjeevni.gui;

import javax.swing.JFrame;

public class ManageDoctors extends javax.swing.JFrame {

    public ManageDoctors() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnadddoc = new javax.swing.JButton();
        btnviewdoc = new javax.swing.JButton();
        btnremovedoc = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblicon = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(237, 251, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnadddoc.setBackground(new java.awt.Color(0, 204, 204));
        btnadddoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadddoc.setForeground(new java.awt.Color(255, 255, 255));
        btnadddoc.setText("Add Doctor");
        btnadddoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadddocActionPerformed(evt);
            }
        });
        jPanel3.add(btnadddoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, 40));

        btnviewdoc.setBackground(new java.awt.Color(0, 204, 204));
        btnviewdoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnviewdoc.setForeground(new java.awt.Color(255, 255, 255));
        btnviewdoc.setText("View Doctor");
        btnviewdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewdocActionPerformed(evt);
            }
        });
        jPanel3.add(btnviewdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 170, 40));

        btnremovedoc.setBackground(new java.awt.Color(0, 204, 204));
        btnremovedoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnremovedoc.setForeground(new java.awt.Color(255, 255, 255));
        btnremovedoc.setText("Remove Doctor");
        btnremovedoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremovedocActionPerformed(evt);
            }
        });
        jPanel3.add(btnremovedoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 170, 40));

        btnback.setText("Back ");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel3.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Manage Doctors");
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));
        jPanel3.add(lblicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 100));

        btnlogout.setText("Logout");
        jPanel3.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Hello, USER - KARNIKA");
        jLabel4.setOpaque(true);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 590, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 790, 190));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Sanjeevni Application ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 746, 33));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 420, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/images/HomePageBG1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -90, 910, 390));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnadddocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadddocActionPerformed
        JFrame newframe= new AddDoctor();
        newframe.setVisible(true) ;
        this.dispose();
    }//GEN-LAST:event_btnadddocActionPerformed

    private void btnviewdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdocActionPerformed
        JFrame newframe= new ViewDoctor();
        newframe.setVisible(true) ;
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewdocActionPerformed

    private void btnremovedocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremovedocActionPerformed
        JFrame newframe= new RemoveDoctor();
        newframe.setVisible(true) ;
        this.dispose();
    }//GEN-LAST:event_btnremovedocActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        JFrame newframe= new AdminOptionsFrame();
        newframe.setVisible(true) ;
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(ManageDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageDoctors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadddoc;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnremovedoc;
    private javax.swing.JButton btnviewdoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblicon;
    // End of variables declaration//GEN-END:variables
}