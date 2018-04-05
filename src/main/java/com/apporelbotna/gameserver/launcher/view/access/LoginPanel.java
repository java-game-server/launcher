package com.apporelbotna.gameserver.launcher.view.access;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.apporelbotna.gameserver.launcher.view.ChangeablePanel;
import com.apporelbotna.gameserver.launcher.view.home.HomeMainPanel;
import com.apporelbotna.gameserver.persistencewsclient.GameDAO;
import com.apporelbotna.gameserver.stubs.Token;

public class LoginPanel extends ChangeablePanel {

	private static final long serialVersionUID = 2855757463706992651L;
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private JLabel wrongLoginLabel;
    
    private OnPanelChangeListener listener;
	
    private GameDAO gameDAO = new GameDAO();
    
	public LoginPanel() {
		super();
		background = new javax.swing.JLabel();
        init();
	}
	
	@Override
	public void setOnPanelChangeListener(OnPanelChangeListener listener)
	{
		this.listener = listener;
	}
	
	 private void init() {

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

	        setPreferredSize(new java.awt.Dimension(1253, 883));
	        setLayout(null);
	        
	        emailLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
	        emailLabel.setForeground(new java.awt.Color(240, 240, 240));
	        emailLabel.setText("email");
	        add(emailLabel);
	        emailLabel.setBounds(12, 450, 1229, 30);

	        emailField.setFont(new java.awt.Font("Blackoak Std", 0, 13)); // NOI18N
	        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        emailField.setToolTipText("Type Username");
	        add(emailField);
	        emailField.setBounds(506, 482, 240, 30);

	        passwordLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
	        passwordLabel.setForeground(new java.awt.Color(240, 240, 240));
	        passwordLabel.setText("Password");
	        add(passwordLabel);
	        passwordLabel.setBounds(12, 550, 1229, 30);

	        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	        add(passwordField);
	        passwordField.setBounds(506, 590, 240, 30);

	        loginBtn.setBackground(new java.awt.Color(0, 0, 0));
	        loginBtn.setFont(new java.awt.Font("Blackoak Std", 1, 16)); // NOI18N
	        loginBtn.setText("OkeyOkey");
	        add(loginBtn);
	        loginBtn.setBounds(506, 680, 240, 40);
	        
	        registerBtn.setBackground(new java.awt.Color(0, 0, 0));
	        registerBtn.setText("\u00A1Register here!");
	        registerBtn.setFont(new Font("Blackoak Std", Font.BOLD, 16));
	        registerBtn.setBackground(Color.BLACK);
	        registerBtn.setBounds(450, 790, 350, 30);
	        add(registerBtn);
	        
	        wrongLoginLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
	        wrongLoginLabel.setForeground(Color.RED);
	        wrongLoginLabel.setText("");
	        add(wrongLoginLabel , 0);
    		wrongLoginLabel.setBounds(12, 637, 1229, 30);

	        background.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
	        background.setIcon(new ImageIcon(LauncherJFrame.class.getResource("/com/apporelbotna/gameserver/launcher/resources/Login.png"))); // NOI18N
	        background.setToolTipText("");
	        add(background);
	        background.setBounds(0, 0, 1235, 844);
	        
	        registerBtn.addActionListener(a -> {
	        	listener.onPanelChange(new RegisterPanel());
	        });
	        
	        loginBtn.addActionListener(a -> {
	        	if(emailField.getText().isEmpty() || passwordField.getPassword().length==0)
	        	{
	        		wrongLoginLabel.setText("Fill all the fields");
	        	}
	        	else
	        	{
	        		Token userToken = gameDAO.login(emailField.getText(), new String(passwordField.getPassword()));
	        		if(userToken==null)
	        		{
		        	wrongLoginLabel.setText("Wrong email/password");
		    		emailField.setText("");
		    		passwordField.setText("");
	        		}
	        		else 
	        		{
	        			listener.onPanelChange(new HomeMainPanel());
	        		}
	        	}
	        });

	        getAccessibleContext().setAccessibleName("");
	    }
}
