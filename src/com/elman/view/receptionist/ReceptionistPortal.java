/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.view.receptionist;

/**
 *
 * @author Elman
 */
public class ReceptionistPortal extends javax.swing.JFrame {

    /**
     * Creates new form ReceptionistPortal
     */
    public ReceptionistPortal() {
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

        jButtonDocDetails = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonPatDetails = new javax.swing.JButton();
        jButtonDocDetails2 = new javax.swing.JButton();
        jButtonIndoorPatient = new javax.swing.JButton();
        jButtonIndoorPatient2 = new javax.swing.JButton();
        jButtonApp = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();

        jButtonDocDetails.setBackground(new java.awt.Color(0, 204, 255));
        jButtonDocDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDocDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/elman/view/icons/doctor.png"))); // NOI18N
        jButtonDocDetails.setText("Doctor Details");
        jButtonDocDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonDocDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDocDetailsActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 200));
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Receptionist Portal ");
        jButton1.setEnabled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonBack.setBackground(new java.awt.Color(255, 51, 51));
        jButtonBack.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonPatDetails.setBackground(new java.awt.Color(0, 204, 255));
        jButtonPatDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonPatDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/elman/view/icons/patient.png"))); // NOI18N
        jButtonPatDetails.setText("Patient Details");
        jButtonPatDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonPatDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPatDetailsActionPerformed(evt);
            }
        });

        jButtonDocDetails2.setBackground(new java.awt.Color(0, 204, 255));
        jButtonDocDetails2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonDocDetails2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/elman/view/icons/doctor.png"))); // NOI18N
        jButtonDocDetails2.setText("Doctor Details");
        jButtonDocDetails2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonDocDetails2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDocDetails2ActionPerformed(evt);
            }
        });

        jButtonIndoorPatient.setBackground(new java.awt.Color(0, 204, 255));
        jButtonIndoorPatient.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonIndoorPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/elman/view/icons/inPatient.png"))); // NOI18N
        jButtonIndoorPatient.setText("Indoor Patient");
        jButtonIndoorPatient.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonIndoorPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIndoorPatientActionPerformed(evt);
            }
        });

        jButtonIndoorPatient2.setBackground(new java.awt.Color(0, 204, 255));
        jButtonIndoorPatient2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonIndoorPatient2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/elman/view/icons/outPatient.png"))); // NOI18N
        jButtonIndoorPatient2.setText("Outdoor Patient");
        jButtonIndoorPatient2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonIndoorPatient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIndoorPatient2ActionPerformed(evt);
            }
        });

        jButtonApp.setBackground(new java.awt.Color(0, 204, 255));
        jButtonApp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/elman/view/icons/appointment.png"))); // NOI18N
        jButtonApp.setText("Appointments");
        jButtonApp.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAppActionPerformed(evt);
            }
        });

        jButtonLogOut.setBackground(new java.awt.Color(204, 0, 0));
        jButtonLogOut.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogOut.setText("Logout");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonIndoorPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                .addComponent(jButtonPatDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonIndoorPatient2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDocDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                            .addComponent(jButtonApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDocDetails2)
                    .addComponent(jButtonPatDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIndoorPatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonIndoorPatient2))
                    .addComponent(jButtonApp, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonDocDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDocDetailsActionPerformed

    }//GEN-LAST:event_jButtonDocDetailsActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new LoginReceptionist().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonDocDetails2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDocDetails2ActionPerformed

    }//GEN-LAST:event_jButtonDocDetails2ActionPerformed

    private void jButtonIndoorPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIndoorPatientActionPerformed

    }//GEN-LAST:event_jButtonIndoorPatientActionPerformed

    private void jButtonIndoorPatient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIndoorPatient2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIndoorPatient2ActionPerformed

    private void jButtonAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAppActionPerformed

    }//GEN-LAST:event_jButtonAppActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        new LoginReceptionist().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonPatDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPatDetailsActionPerformed
       new PatientDetailsReceptionist().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonPatDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(ReceptionistPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonApp;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDocDetails;
    private javax.swing.JButton jButtonDocDetails2;
    private javax.swing.JButton jButtonIndoorPatient;
    private javax.swing.JButton jButtonIndoorPatient2;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonPatDetails;
    // End of variables declaration//GEN-END:variables
}
