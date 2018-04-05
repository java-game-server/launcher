package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.apporelbotna.gameserver.stubs.AuthenticatedUser;
import com.apporelbotna.gameserver.stubs.Token;
import com.apporelbotna.gameserver.stubs.User;

public class Entry extends JFrame
{
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		AuthenticatedUser.create(new User("jenduliva"), new Token("1111"));
		EventQueue.invokeLater(() -> {
			try
			{
				Entry frame = new Entry();
				frame.setVisible(true);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

		});
	}

	/**
	 * Create the frame.
	 */
	public Entry()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 883);
		contentPane = new HomeMainPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
