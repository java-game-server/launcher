package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import com.apporelbotna.gameserver.stubs.AuthenticatedUser;
import com.apporelbotna.gameserver.stubs.Token;
import com.apporelbotna.gameserver.stubs.User;

public class Entry extends JFrame
{
	private static final long serialVersionUID = -4370492171907517451L;

	private HomeMainPanel homeMainPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		AuthenticatedUser.create(new User("jenduliva"), new Token("1111"));
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					Entry frame = new Entry();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Entry()
	{
		homeMainPanel = new HomeMainPanel();
		homeMainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		homeMainPanel.setLayout(new BorderLayout(0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 883);
		add(homeMainPanel);
	}

}
