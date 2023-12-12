package sanjeevni.gui;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sanjeevniapp.dao.DoctorsDao;
import sanjeevniapp.dao.PatientDao;
import sanjeevniapp.pojo.PatientsPojo;

public class AddPatient extends javax.swing.JFrame {

    private String OPD;
    private String contactNo;
   private String patid;
   private String docid;
    private String city;
    private String fname;
    private String lname;
    private String address;
    private String marital;
    private String gender;
    String msg;
    int age;
    PatientsPojo patient;
    private static int OTP = 1000+ (int)(Math.random()*999);
    java.sql.Date dt;
   

    public AddPatient() {
        initComponents();
        setLocationRelativeTo(null);
        loadDoctorId();
        geneNewPatId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtage = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtOPD = new javax.swing.JTextField();
        combomarital = new javax.swing.JComboBox<>();
        combodociid = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        docID = new javax.swing.JLabel();
        lblopd = new javax.swing.JLabel();
        lblpatientID = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        combogender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtpatientid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 251, 239));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient's Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, -1));

        txtcity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });
        jPanel2.add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, -1));

        txtlname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 150, -1));

        txtdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 150, -1));

        txtphone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 150, -1));

        txtfname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 150, -1));

        txtOPD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtOPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOPDActionPerformed(evt);
            }
        });
        jPanel2.add(txtOPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 140, -1));

        combomarital.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combomarital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Unmarried" }));
        combomarital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomaritalActionPerformed(evt);
            }
        });
        jPanel2.add(combomarital, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 150, 20));

        combodociid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combodociid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodociidActionPerformed(evt);
            }
        });
        jPanel2.add(combodociid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Address");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, 20));

        lblcity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcity.setText("City");
        jPanel2.add(lblcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("First Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 80, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 80, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Date");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 60, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Phone No.");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 70, 20));

        docID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        docID.setText("Doctor ID");
        jPanel2.add(docID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 20));

        lblopd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblopd.setText("OPD");
        jPanel2.add(lblopd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 20));

        lblpatientID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpatientID.setText("Patient ID");
        jPanel2.add(lblpatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 20));

        lblage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblage.setText("Age");
        jPanel2.add(lblage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, 20));

        combogender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        combogender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combogenderActionPerformed(evt);
            }
        });
        jPanel2.add(combogender, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 150, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Gender");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 50, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Marital Status");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 100, 20));

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 140, 60));

        txtpatientid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtpatientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 620, 260));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Sanjeevni Application ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 420, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 740, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/images/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -140, 960, 340));

        btnregister.setBackground(new java.awt.Color(0, 204, 204));
        btnregister.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 150, 30));

        btnback.setBackground(new java.awt.Color(0, 204, 204));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 60, 30));

        btnlogout.setBackground(new java.awt.Color(0, 204, 204));
        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnlogout.setText("Logout");
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/images/register Doctor.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 230, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed

    }//GEN-LAST:event_txtcityActionPerformed

    private void txtOPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOPDActionPerformed

    }//GEN-LAST:event_txtOPDActionPerformed

    private void combomaritalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomaritalActionPerformed

    }//GEN-LAST:event_combomaritalActionPerformed

    private void combodociidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodociidActionPerformed
      
    }//GEN-LAST:event_combodociidActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
if(!validateInputs() || !validContact()){
            JOptionPane.showMessageDialog(null, msg);
            return;
        }
patient.setPatient_id(txtpatientid.getText());
        patient.setOtp(OTP);
        patient.setStatus("REQUEST");
        patient.setDoc_id(combodociid.getSelectedItem().toString());
        System.out.println(patient.toString());
        JFrame op = new VerifyOtpFrame(patient);
        op.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_btnregisterActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        JFrame nextframe = new RecepOptions();
        nextframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void combogenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combogenderActionPerformed
        
    }//GEN-LAST:event_combogenderActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnregister;
    private javax.swing.JComboBox<String> combodociid;
    private javax.swing.JComboBox<String> combogender;
    private javax.swing.JComboBox<String> combomarital;
    private javax.swing.JLabel docID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblopd;
    private javax.swing.JLabel lblpatientID;
    private javax.swing.JTextField txtOPD;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtpatientid;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables

    private void loadDoctorId() {
        try{
            List<String> doclist = new ArrayList<>();
            doclist=DoctorsDao.getAllDoctorId();
        //    Set <String> empIDset = doclist.keySet();
            for(String docID : doclist)
            {
                combodociid.addItem(docID);          
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error in DB"+ex); 
            ex.printStackTrace();
        }
    }
    
    private void geneNewPatId(){
        try{
            String patID= PatientDao.getNewPatID();
            txtpatientid.setText(patID);
            Date today= new Date();     // object of util date
            SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yyyy"); 
            String datestr= sdf.format(today);          //converting util date to normal- sql format
            txtdate.setText(datestr);
            java.util.Date d1 = sdf.parse(datestr);
            long ms = d1.getTime();
            dt = new java.sql.Date(ms);
          //  patient.setPatient_id(txtpatientid.getText());
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error in DB"+ex);
            ex.printStackTrace();
        }
        catch ( ParseException px)
        {
            JOptionPane.showMessageDialog(null, "Error in Date"+px);
            px.printStackTrace();
        }
}
    
    private boolean validateInputs() {
      OPD=txtOPD.getText().trim();
      contactNo=txtphone.getText().trim();
      city =txtcity.getText().trim();
      fname =txtfname.getText().trim();
      lname =txtlname.getText().trim();
      address=txtaddress.getText().trim(); 
      marital=combomarital.getSelectedItem().toString().trim();
      gender = combogender.getSelectedItem().toString();
      
    
        try{
            age = Integer.parseInt(txtage.getText().trim());
        }
        catch(NumberFormatException ex){
            msg = "Please enter valid age!";
            return false;
        }
        
        if(city == null || lname==null || fname==null|| OPD==null|| address.isEmpty()){
            msg = "Please input all values";
            return false;
        }
        
        patient = new PatientsPojo();
        patient.setAddress(address);
        patient.setAge(age);
        patient.setCity(city);
        patient.setDate(dt);
        patient.setFirst_name(fname);
        patient.setLast_name(lname);
        patient.setGender(gender);
        patient.setM_status(marital);
    //    patient.setDoc_id(docid);
        patient.setMob_no(contactNo);
     //   patient.setPatient_id(patid);    
        patient.setOpd(OPD);
        return true;
    }
   
    private boolean validContact() {
        char[] mob = contactNo.toCharArray(); 
        for(char ch : mob){
                if(Character.isDigit(ch)==false)
                    return false; 
        }
        if(contactNo.length()==10)
            return true; 
        return false; 
    }
}