package com.apporelbotna.gameserver.launcher.view.access;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.apporelbotna.gameserver.launcher.view.ChangeablePanel;
import com.apporelbotna.gameserver.persistencewsclient.GameDAO;
import com.apporelbotna.gameserver.stubs.User;

public class RegisterPanel extends ChangeablePanel
{
	private static final long serialVersionUID = 7250306526637629515L;
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel background;
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
	private JLabel errorFieldLabel;

	private OnPanelChangeListener listener;

	private GameDAO gameDAO = new GameDAO();

	public RegisterPanel()
	{
		super();
		background = new javax.swing.JLabel();
		init();
	}

	@Override
	public void setOnPanelChangeListener(OnPanelChangeListener listener)
	{
		this.listener = listener;
	}

	private void init()
	{
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

		setPreferredSize(new java.awt.Dimension(1253, 883));
		setLayout(null);

		emailRegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
		emailRegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
		emailRegisterLabel.setText("email");
		add(emailRegisterLabel);
		emailRegisterLabel.setBounds(12, 360, 1229, 30);

		emailRegisterField.setFont(new java.awt.Font("Blackoak Std", 0, 13)); // NOI18N
		emailRegisterField.setHorizontalAlignment(SwingConstants.CENTER);
		emailRegisterField.setToolTipText("Type Username");

		add(emailRegisterField);
		emailRegisterField.setBounds(506, 390, 240, 30);

		usernameRegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
		usernameRegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
		usernameRegisterLabel.setText("alias");
		add(usernameRegisterLabel);
		usernameRegisterLabel.setBounds(12, 440, 1229, 30);

		usernameRegisterField.setFont(new java.awt.Font("Blackoak Std", 0, 13)); // NOI18N
		usernameRegisterField.setHorizontalAlignment(SwingConstants.CENTER);
		usernameRegisterField.setToolTipText("Type Username");

		add(usernameRegisterField);
		usernameRegisterField.setBounds(506, 470, 240, 30);

		passwordRegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
		passwordRegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
		passwordRegisterLabel.setText("password");
		add(passwordRegisterLabel);
		passwordRegisterLabel.setBounds(12, 520, 1229, 40);

		passwordRegisterField.setHorizontalAlignment(SwingConstants.CENTER);

		add(passwordRegisterField);
		passwordRegisterField.setBounds(506, 560, 240, 30);

		password2RegisterLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
		password2RegisterLabel.setForeground(new java.awt.Color(240, 240, 240));
		password2RegisterLabel.setText("repeat password");
		add(password2RegisterLabel);
		password2RegisterLabel.setBounds(12, 600, 1229, 40);

		password2RegisterField.setHorizontalAlignment(SwingConstants.CENTER);

		add(password2RegisterField);
		password2RegisterField.setBounds(506, 640, 240, 30);

		registerRegisterBtn.setBackground(new java.awt.Color(0, 0, 0));
		registerRegisterBtn.setFont(new java.awt.Font("Blackoak Std", 1, 16)); // NOI18N
		registerRegisterBtn.setText("OkeyOkey");
		add(registerRegisterBtn);
		registerRegisterBtn.setBounds(506, 700, 240, 40);

		registerLoginBtn.setText("Back to Login");
		registerLoginBtn.setFont(new Font("Blackoak Std", Font.BOLD, 16));
		registerLoginBtn.setBackground(Color.BLACK);
		registerLoginBtn.setBounds(470, 790, 317, 30);
		add(registerLoginBtn);

		errorFieldLabel.setFont(new java.awt.Font("Blackoak Std", 0, 16)); // NOI18N
		errorFieldLabel.setForeground(Color.RED);
		errorFieldLabel.setText("");
		add(errorFieldLabel, 0);
		errorFieldLabel.setBounds(12, 750, 1229, 30);

		background.setIcon(new ImageIcon(RegisterPanel.class
				.getResource("/com/apporelbotna/gameserver/launcher/resources/Register.png"))); // NOI18N
		add(background);
		background.setBounds(0, 0, 1253, 883);

		registerLoginBtn.addActionListener(a -> {
			listener.onPanelChange(new LoginPanel());
		});

		registerRegisterBtn.addActionListener(a -> {
			if (emailRegisterField.getText().isEmpty() || usernameRegisterField.getText().isEmpty()
					|| passwordRegisterField.getPassword().length == 0
					|| password2RegisterField.getPassword().length == 0)
			{
				errorFieldLabel.setText("Fill all the fields");
			}
			else if (!(new String(passwordRegisterField.getPassword())
					.equals(new String(password2RegisterField.getPassword()))))
			{
				errorFieldLabel.setText("The passwords does not match");
				passwordRegisterField.setText("");
				password2RegisterField.setText("");
			}
			else
			{
				User newUser = gameDAO.getUserInformation(emailRegisterField.getText());
				if (newUser != null)
				{
					errorFieldLabel.setText("This email is already used");
					passwordRegisterField.setText("");
					password2RegisterField.setText("");
				}
				else
				{
					if (gameDAO.createUser(
							new User(emailRegisterField.getText(), usernameRegisterField.getText()),
							String.valueOf(passwordRegisterField.getPassword())))
					{
						listener.onPanelChange(new LoginPanel());
					}
					else
					{
						errorFieldLabel.setText("Database error, user can not be created");
					}
				}
			}
		});
	}
}
