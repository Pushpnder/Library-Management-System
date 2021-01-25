/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import project.ConnectionProvider;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static project.CalenderProblems.findDays;


/**
 *
 * @author pushp
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
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

        Return = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        b_id = new javax.swing.JTextField();
        s_id = new javax.swing.JTextField();
        d_due = new javax.swing.JTextField();
        fine = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        d_issue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Return.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/return book png.png"))); // NOI18N
        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        getContentPane().add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 150, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/red-x-mark-transparent-background-3.png"))); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 150, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 80, 30));

        b_id.setBackground(new java.awt.Color(204, 255, 204));
        b_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_idActionPerformed(evt);
            }
        });
        getContentPane().add(b_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 250, 30));

        s_id.setBackground(new java.awt.Color(204, 255, 204));
        s_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_idActionPerformed(evt);
            }
        });
        getContentPane().add(s_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 250, 30));

        d_due.setEditable(false);
        d_due.setBackground(new java.awt.Color(204, 255, 204));
        d_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_dueActionPerformed(evt);
            }
        });
        getContentPane().add(d_due, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 250, 30));

        fine.setEditable(false);
        fine.setBackground(new java.awt.Color(204, 255, 204));
        fine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineActionPerformed(evt);
            }
        });
        getContentPane().add(fine, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Delay Fine");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 126, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Student Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 126, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Due Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 126, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Book Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 126, -1));

        d_issue.setEditable(false);
        d_issue.setBackground(new java.awt.Color(204, 255, 204));
        d_issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_issueActionPerformed(evt);
            }
        });
        getContentPane().add(d_issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 250, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Issue Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 126, -1));

        bg.setIcon(new javax.swing.ImageIcon("F:\\Java Projects\\Icon 1\\Icon 1\\123456.png")); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
       String bookId = b_id.getText();
        String studentId = s_id.getText();
        //get todays date
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String date =formatter.format(new java.util.Date());
        //DATABASE
        try
        {Connection con = ConnectionProvider.getCon();
         Statement st = con.createStatement();
         
         //DELETE ENTRY FROM ISSUE 
         st.executeUpdate( "delete from issue where b_id='"+bookId+"'and s_id='"+studentId+"'");
         //ADD ENTRY TO RETURNED
         st.executeUpdate( "insert into returned values('"+bookId+"','"+studentId+"','"+d_issue.getText()+"','"+date+"','"+fine.getText()+"')");
         
         this.dispose();
         JOptionPane.showMessageDialog(null, "Book Returned");
         new ReturnBook().show();
         
        }
        catch(SQLException e){
        e.printStackTrace();}
       
       

        
    }//GEN-LAST:event_ReturnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_idActionPerformed

    private void s_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_idActionPerformed

    private void d_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_dueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_dueActionPerformed

    private void fineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fineActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String bookId = b_id.getText();
        String studentId = s_id.getText();
        if(bookId.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Book ID");
        }
        else if(studentId.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Student ID");
        }
        else{
        {
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from issue where b_id='"+bookId+"'and s_id='"+studentId+"'" );
                if (rs.next()){
                    d_issue.setText(rs.getString(3));
                    d_due.setText(rs.getString(4));
                    }
                 
                else{
                    JOptionPane.showMessageDialog(null,"No records ");
                }
            } catch (SQLException ex) {
               ex.printStackTrace();
            }}
        String dueDate = d_due.getText();
        //calculate fine (rs 10 per day)
        int days= findDays(dueDate);
        int totalFine= (days*10);
        if(totalFine>0)
        fine.setText(String.valueOf(totalFine));
        else
        fine.setText("0");    
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void d_issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_issueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_issueActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Return;
    private javax.swing.JTextField b_id;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField d_due;
    private javax.swing.JTextField d_issue;
    private javax.swing.JTextField fine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField s_id;
    // End of variables declaration//GEN-END:variables
}
