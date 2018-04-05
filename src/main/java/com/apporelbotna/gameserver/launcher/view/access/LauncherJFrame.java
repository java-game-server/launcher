/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apporelbotna.gameserver.launcher.view.access;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

/**
 *
 * @author magner
 */
public class LauncherJFrame extends javax.swing.JFrame {


    public LauncherJFrame() {
    	launcherJPanel = new javax.swing.JPanel();
    	background = new javax.swing.JLabel();
        initLoginComponents();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LauncherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LauncherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LauncherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LauncherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	LauncherJFrame launcherJFrame = new LauncherJFrame();
                launcherJFrame.setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initLoginComponents() {

        emailLabel = new javax.swing.JLabel();
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        wrongLoginLabel = new javax.swing.JLabel();
        wrongLoginLabel.setHorizontalAlignment(SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        launcherJPanel.setPreferredSize(new java.awt.Dimension(1253, 883));
        launcherJPanel.setLayout(null);
        
        emailLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(240, 240, 240));
        emailLabel.setText("email");
        launcherJPanel.add(emailLabel);
        emailLabel.setBounds(12, 450, 1229, 30);

        emailField.setFont(new java.awt.Font("Blackoak Std", 0, 13)); // NOI18N
        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailField.setToolTipText("Type Username");
        launcherJPanel.add(emailField);
        emailField.setBounds(506, 482, 240, 30);

        passwordLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(240, 240, 240));
        passwordLabel.setText("Password");
        launcherJPanel.add(passwordLabel);
        passwordLabel.setBounds(12, 550, 1229, 30);

        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        launcherJPanel.add(passwordField);
        passwordField.setBounds(506, 590, 240, 30);

        loginBtn.setBackground(new java.awt.Color(0, 0, 0));
        loginBtn.setFont(new java.awt.Font("Blackoak Std", 1, 16)); // NOI18N
        loginBtn.setText("OkeyOkey");
        launcherJPanel.add(loginBtn);
        loginBtn.setBounds(506, 680, 240, 40);
        
        registerBtn.setBackground(new java.awt.Color(0, 0, 0));
        registerBtn.setText("\u00A1Register here!");
        registerBtn.setFont(new Font("Blackoak Std", Font.BOLD, 16));
        registerBtn.setBackground(Color.BLACK);
        registerBtn.setBounds(470, 840, 317, 30);
        launcherJPanel.add(registerBtn);
        
        wrongLoginLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        wrongLoginLabel.setForeground(Color.RED);
        wrongLoginLabel.setText("Wrong email/password");

        background.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        background.setIcon(new ImageIcon(LauncherJFrame.class.getResource("/com/apporelbotna/gameserver/launcher/resources/Login.png"))); // NOI18N
        background.setToolTipText("");
        launcherJPanel.add(background);
        background.setBounds(0, 0, 1253, 883);
        
        registerBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		launcherJPanel.removeAll();
        		initRegisterComponents();
        	}
        });
        loginBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		launcherJPanel.add(wrongLoginLabel , 0);
        		wrongLoginLabel.setBounds(12, 637, 1229, 30);
        		emailField.setText("");
        		passwordField.setText("");
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(launcherJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(launcherJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        launcherJPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }
    
    private void initRegisterComponents() {

        emailRegisterLabel = new javax.swing.JLabel();
        emailRegisterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailRegisterField = new javax.swing.JTextField();
        usernameRegisterLabel = new javax.swing.JLabel();
        usernameRegisterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        usernameRegisterField = new javax.swing.JTextField();
        passwordRegisterLabel = new javax.swing.JLabel();
        passwordRegisterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passwordRegisterField = new javax.swing.JPasswordField();
        password2RegisterLabel = new javax.swing.JLabel();
        password2RegisterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        password2RegisterField = new javax.swing.JPasswordField();
        registerRegisterBtn = new javax.swing.JButton();
        registerLoginBtn = new javax.swing.JButton();
        errorFieldLabel = new javax.swing.JLabel();
        errorFieldLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        launcherJPanel.setPreferredSize(new java.awt.Dimension(1253, 883));
        launcherJPanel.setLayout(null);

        emailRegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        emailRegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
        emailRegisterLabel.setText("email");
        launcherJPanel.add(emailRegisterLabel);
        emailRegisterLabel.setBounds(12, 410, 1229, 30);

        emailRegisterField.setFont(new java.awt.Font("Blackoak Std", 0, 13)); // NOI18N
        emailRegisterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailRegisterField.setToolTipText("Type Username");

        launcherJPanel.add(emailRegisterField);
        emailRegisterField.setBounds(506, 440, 240, 30);

        usernameRegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        usernameRegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
        usernameRegisterLabel.setText("alias");
        launcherJPanel.add(usernameRegisterLabel);
        usernameRegisterLabel.setBounds(12, 490, 1229, 30);

        usernameRegisterField.setFont(new java.awt.Font("Blackoak Std", 0, 13)); // NOI18N
        usernameRegisterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameRegisterField.setToolTipText("Type Username");

        launcherJPanel.add(usernameRegisterField);
        usernameRegisterField.setBounds(506, 520, 240, 30);

        passwordRegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        passwordRegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
        passwordRegisterLabel.setText("password");
        launcherJPanel.add(passwordRegisterLabel);
        passwordRegisterLabel.setBounds(12, 570, 1229, 40);

        passwordRegisterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        launcherJPanel.add(passwordRegisterField);
        passwordRegisterField.setBounds(506, 610, 240, 30);

        password2RegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        password2RegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
        password2RegisterLabel.setText("repeat password");
        launcherJPanel.add(password2RegisterLabel);
        password2RegisterLabel.setBounds(12, 650, 1229, 40);

        password2RegisterField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        launcherJPanel.add(password2RegisterField);
        password2RegisterField.setBounds(506, 690, 240, 30);

        registerRegisterBtn.setBackground(new java.awt.Color(0, 0, 0));
        registerRegisterBtn.setFont(new java.awt.Font("Blackoak Std", 1, 16)); // NOI18N
        registerRegisterBtn.setText("OkeyOkey");
        launcherJPanel.add(registerRegisterBtn);
        registerRegisterBtn.setBounds(506, 750, 240, 40);
        
        registerLoginBtn.setText("Back to Login");
        registerLoginBtn.setFont(new Font("Blackoak Std", Font.BOLD, 16));
        registerLoginBtn.setBackground(Color.BLACK);
        registerLoginBtn.setBounds(470, 840, 317, 30);
        launcherJPanel.add(registerLoginBtn);
        
        errorFieldLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
        errorFieldLabel.setForeground(Color.RED);
        
        registerLoginBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		launcherJPanel.removeAll();
        		initLoginComponents();
        	}
        });
        
        registerRegisterBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(emailRegisterField.getText().isEmpty()||usernameRegisterField.getText().isEmpty()||passwordRegisterField.getText().isEmpty()||password2RegisterField.getText().isEmpty()) {
        			errorFieldLabel.setText("Fill all the fields");
        			launcherJPanel.add(errorFieldLabel , 0);
        			errorFieldLabel.setBounds(12, 800, 1229, 30);
        		}
        		else if(!(new String(passwordRegisterField.getPassword()).equals(new String(password2RegisterField.getPassword())))) {
        			errorFieldLabel.setText("The passwords does not match");
        			launcherJPanel.add(errorFieldLabel , 0);
    				errorFieldLabel.setBounds(12, 800, 1229, 30);
    				passwordRegisterField.setText("");
    				password2RegisterField.setText("");
    			}
        		else {
        			errorFieldLabel.setText("");
        		}
        	}
        });

        background.setIcon(new ImageIcon(LauncherJFrame.class.getResource("/com/apporelbotna/gameserver/launcher/resources/Register.png"))); // NOI18N
        launcherJPanel.add(background);
        background.setBounds(0, 0, 1253, 883);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(launcherJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(launcherJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel launcherJPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    
    private javax.swing.JTextField emailRegisterField;
    private javax.swing.JLabel emailRegisterLabel;
    private javax.swing.JPasswordField password2RegisterField;
    private javax.swing.JLabel password2RegisterLabel;
    private javax.swing.JPasswordField passwordRegisterField;
    private javax.swing.JLabel passwordRegisterLabel;
    private javax.swing.JButton registerRegisterBtn;
    private javax.swing.JTextField usernameRegisterField;
    private javax.swing.JLabel usernameRegisterLabel;
    private JButton registerLoginBtn;
    private JLabel wrongLoginLabel;
    private JLabel errorFieldLabel;
}
