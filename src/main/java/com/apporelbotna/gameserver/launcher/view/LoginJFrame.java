/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apporelbotna.gameserver.launcher.view;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author magne
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    public LoginJFrame() {
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

        loginJPanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        backgroundLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginJPanel.setPreferredSize(new java.awt.Dimension(1600, 900));
        loginJPanel.setLayout(null);

        emailLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(240, 240, 240));
        emailLabel.setText("email");
        loginJPanel.add(emailLabel);
        emailLabel.setBounds(740, 450, 110, 30);

        emailField.setFont(new java.awt.Font("Blackoak Std", 0, 13)); // NOI18N
        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailField.setToolTipText("Type Username");
        loginJPanel.add(emailField);
        emailField.setBounds(680, 480, 240, 30);

        passwordLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(240, 240, 240));
        passwordLabel.setText("Password");
        loginJPanel.add(passwordLabel);
        passwordLabel.setBounds(710, 550, 190, 40);

        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginJPanel.add(passwordField);
        passwordField.setBounds(680, 590, 240, 30);

        loginBtn.setBackground(new java.awt.Color(0, 0, 0));
        loginBtn.setFont(new java.awt.Font("Blackoak Std", 1, 16)); // NOI18N
        loginBtn.setText("OkeyOkey");
        loginJPanel.add(loginBtn);
        loginBtn.setBounds(680, 680, 240, 40);
        
        JButton registerBtn = new JButton();
        
        registerBtn.setText("\u00A1Register here!");
        registerBtn.setFont(new Font("Blackoak Std", Font.BOLD, 16));
        registerBtn.setBackground(Color.BLACK);
        registerBtn.setBounds(653, 842, 317, 30);
        loginJPanel.add(registerBtn);

        backgroundLogin.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        backgroundLogin.setIcon(new ImageIcon(LoginJFrame.class.getResource("/com/apporelbotna/gameserver/launcher/resources/Login.png"))); // NOI18N
        backgroundLogin.setToolTipText("");
        loginJPanel.add(backgroundLogin);
        backgroundLogin.setBounds(0, -10, 1640, 920);
        
        registerBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		RegisterJFrame registerJFrame = new RegisterJFrame();
        		registerJFrame.setVisible(true);
        		loginJPanel.setVisible(false);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        loginJPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	LoginJFrame launcherJFrame = new LoginJFrame();
            	launcherJFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLogin;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
}
