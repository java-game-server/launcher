/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apporelbotna.gameserver.launcher.view;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author magne
 */
public class RegisterJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterJFrame
     */
    public RegisterJFrame() {
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

        registerJPanel = new javax.swing.JPanel();
        emailRegisterLabel = new javax.swing.JLabel();
        emailRegisterField = new javax.swing.JTextField();
        usernameRegisterLabel = new javax.swing.JLabel();
        usernameRegisterField = new javax.swing.JTextField();
        passwordRegisterLabel = new javax.swing.JLabel();
        passwordRegisterField = new javax.swing.JPasswordField();
        password2RegisterLabel = new javax.swing.JLabel();
        password2RegisterField = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerJPanel.setPreferredSize(new java.awt.Dimension(1600, 900));
        registerJPanel.setLayout(null);

        emailRegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        emailRegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
        emailRegisterLabel.setText("email");
        registerJPanel.add(emailRegisterLabel);
        emailRegisterLabel.setBounds(740, 410, 109, 30);

        emailRegisterField.setFont(new java.awt.Font("Blackoak Std", 0, 13)); // NOI18N
        emailRegisterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailRegisterField.setToolTipText("Type Username");
        emailRegisterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailRegisterFieldActionPerformed(evt);
            }
        });
        registerJPanel.add(emailRegisterField);
        emailRegisterField.setBounds(680, 440, 240, 30);

        usernameRegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        usernameRegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
        usernameRegisterLabel.setText("alias");
        registerJPanel.add(usernameRegisterLabel);
        usernameRegisterLabel.setBounds(750, 490, 120, 30);

        usernameRegisterField.setFont(new java.awt.Font("Blackoak Std", 0, 13)); // NOI18N
        usernameRegisterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameRegisterField.setToolTipText("Type Username");
        usernameRegisterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameRegisterFieldActionPerformed(evt);
            }
        });
        registerJPanel.add(usernameRegisterField);
        usernameRegisterField.setBounds(680, 520, 240, 30);

        passwordRegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        passwordRegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
        passwordRegisterLabel.setText("password");
        registerJPanel.add(passwordRegisterLabel);
        passwordRegisterLabel.setBounds(710, 570, 190, 40);

        passwordRegisterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordRegisterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordRegisterFieldActionPerformed(evt);
            }
        });
        registerJPanel.add(passwordRegisterField);
        passwordRegisterField.setBounds(680, 610, 240, 30);

        password2RegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        password2RegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
        password2RegisterLabel.setText("repeat password");
        registerJPanel.add(password2RegisterLabel);
        password2RegisterLabel.setBounds(650, 650, 330, 40);

        password2RegisterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password2RegisterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password2RegisterFieldActionPerformed(evt);
            }
        });
        registerJPanel.add(password2RegisterField);
        password2RegisterField.setBounds(680, 690, 240, 30);

        registerBtn.setBackground(new java.awt.Color(0, 0, 0));
        registerBtn.setFont(new java.awt.Font("Blackoak Std", 1, 16)); // NOI18N
        registerBtn.setText("OkeyOkey");
        registerJPanel.add(registerBtn);
        registerBtn.setBounds(680, 750, 240, 40);
        
        loginBtn = new JButton();
        loginBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		LoginJFrame loginJFrame = new LoginJFrame();
        		loginJFrame.setVisible(true);
        		registerJPanel.setVisible(false);
        	}
        });
        loginBtn.setText("Back to Login");
        loginBtn.setFont(new Font("Blackoak Std", Font.BOLD, 16));
        loginBtn.setBackground(Color.BLACK);
        loginBtn.setBounds(653, 845, 300, 30);
        registerJPanel.add(loginBtn);

        background.setIcon(new ImageIcon(RegisterJFrame.class.getResource("/com/apporelbotna/gameserver/launcher/resources/Register.png"))); // NOI18N
        registerJPanel.add(background);
        background.setBounds(0, 0, 1600, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordRegisterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordRegisterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordRegisterFieldActionPerformed

    private void emailRegisterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailRegisterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailRegisterFieldActionPerformed

    private void usernameRegisterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameRegisterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameRegisterFieldActionPerformed

    private void password2RegisterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password2RegisterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password2RegisterFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField emailRegisterField;
    private javax.swing.JLabel emailRegisterLabel;
    private javax.swing.JPanel registerJPanel;
    private javax.swing.JPasswordField password2RegisterField;
    private javax.swing.JLabel password2RegisterLabel;
    private javax.swing.JPasswordField passwordRegisterField;
    private javax.swing.JLabel passwordRegisterLabel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameRegisterField;
    private javax.swing.JLabel usernameRegisterLabel;
    private JButton loginBtn;
}
