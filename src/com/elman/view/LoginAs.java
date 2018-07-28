/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.view;

import com.elman.view.receptionist.RegisterReceptionist;
import com.elman.view.receptionist.LoginReceptionist;
import com.elman.view.admin.LoginAdmin;

/**
 *
 * @author Gahr_bz15
 */
public class LoginAs extends javax.swing.JFrame {

    /**
     * Creates new form LoginAs
     */
    public LoginAs() {
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

        jLabel1 = new javax.swing.JLabel();
        jButtonLoginAsAdmin = new javax.swing.JButton();
        jButtonLoginAsReceptionist = new javax.swing.JButton();
        jButtonLoginAsDoctor = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jButtonRegReceptionist = new javax.swing.JButton();
        jButtonRegDoctor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(830, 600));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Management System");

        jButtonLoginAsAdmin.setBackground(new java.awt.Color(0, 204, 255));
        jButtonLoginAsAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLoginAsAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLoginAsAdmin.setText("Admin");
        jButtonLoginAsAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginAsAdminActionPerformed(evt);
            }
        });

        jButtonLoginAsReceptionist.setBackground(new java.awt.Color(0, 204, 255));
        jButtonLoginAsReceptionist.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLoginAsReceptionist.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLoginAsReceptionist.setText("Receptionist");
        jButtonLoginAsReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginAsReceptionistActionPerformed(evt);
            }
        });

        jButtonLoginAsDoctor.setBackground(new java.awt.Color(0, 204, 255));
        jButtonLoginAsDoctor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLoginAsDoctor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLoginAsDoctor.setText("Doctor");
        jButtonLoginAsDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginAsDoctorActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 204, 255));
        jButton4.setText("Login as");
        jButton4.setEnabled(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jButtonRegister.setBackground(new java.awt.Color(51, 255, 0));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setText("Register");
        jButtonRegister.setEnabled(false);
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonRegReceptionist.setBackground(new java.awt.Color(51, 204, 0));
        jButtonRegReceptionist.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonRegReceptionist.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegReceptionist.setText("Receptionist");
        jButtonRegReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegReceptionistActionPerformed(evt);
            }
        });

        jButtonRegDoctor.setBackground(new java.awt.Color(51, 204, 0));
        jButtonRegDoctor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonRegDoctor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegDoctor.setText("Doctor");
        jButtonRegDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRegReceptionist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRegDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonLoginAsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLoginAsReceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLoginAsDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonLoginAsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLoginAsReceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLoginAsDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegReceptionist))
                .addGap(170, 170, 170))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginAsAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginAsAdminActionPerformed
         new LoginAdmin().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonLoginAsAdminActionPerformed

    private void jButtonLoginAsReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginAsReceptionistActionPerformed
      new LoginReceptionist().setVisible(true);
      this.setVisible(false);
      
    }//GEN-LAST:event_jButtonLoginAsReceptionistActionPerformed

    private void jButtonLoginAsDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginAsDoctorActionPerformed
       new LoginDoctor().setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButtonLoginAsDoctorActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
      
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonRegReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegReceptionistActionPerformed
       new RegisterReceptionist().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonRegReceptionistActionPerformed

    private void jButtonRegDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegDoctorActionPerformed
       
    }//GEN-LAST:event_jButtonRegDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAs().setVisible(true);
               
            }
           
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonLoginAsAdmin;
    private javax.swing.JButton jButtonLoginAsDoctor;
    private javax.swing.JButton jButtonLoginAsReceptionist;
    private javax.swing.JButton jButtonRegDoctor;
    private javax.swing.JButton jButtonRegReceptionist;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
}