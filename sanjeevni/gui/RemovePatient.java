package sanjeevni.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sanjeevni.utility.UserProfile;
import sanjeevniapp.dao.PatientDao;
import sanjeevniapp.dao.ReceptionistDao;
import sanjeevniapp.pojo.PatientsPojo;


public class RemovePatient extends javax.swing.JFrame {

    public RemovePatient() {
        initComponents();
        loadPatientId(); 
        jLabel3.setText(UserProfile.getUserName());
        setLocationRelativeTo(null) ; 
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnhome = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        lbldocid = new javax.swing.JLabel();
        jcidlist = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Sanjeevni Application ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 746, 33));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 420, 60));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(237, 251, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Remove Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhome.setText("Home");
        jPanel5.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 70, 20));

        btnlogout.setText("Logout");
        jPanel5.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hello");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 280, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 650, 40));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(0, 153, 153));
        btnback.setText("Back ");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel3.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        btnremove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnremove.setForeground(new java.awt.Color(0, 153, 153));
        btnremove.setText("Delete");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel3.add(btnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 90, -1));

        lbldocid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldocid.setText("Patient ID");
        jPanel3.add(lbldocid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jPanel3.add(jcidlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 220, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 190));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 770, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/images/HomePageBG1.jpg"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -70, 860, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        JFrame newframe = new RecepOptions();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        String recId=jcidlist.getSelectedItem().toString();
        try{
            PatientsPojo pat = new PatientsPojo();
            pat.setPatient_id(jcidlist.getSelectedItem().toString());
            boolean  result = PatientDao.removePatient(pat);
            if (result == true) {
                JOptionPane.showMessageDialog(null, "Patient successfully Removed");
                jcidlist.removeItem(recId);
            }
            else
            {
                if(jcidlist.getItemCount()==0){
                    btnremove.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "All patients removed!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Deletion Unsuccesssful");
                }
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage(), "Error in DB ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnremoveActionPerformed

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
            java.util.logging.Logger.getLogger(RemovePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemovePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemovePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemovePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemovePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnremove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcidlist;
    private javax.swing.JLabel lbldocid;
    // End of variables declaration//GEN-END:variables
private void loadPatientId() {
        try{
            List<String> patlist = new ArrayList<>();
            patlist=PatientDao.getAllPatientId();
            for(String patID : patlist)
            {
                jcidlist.addItem(patID);          
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error in DB"+ex); 
            ex.printStackTrace();
        }
    }
}
