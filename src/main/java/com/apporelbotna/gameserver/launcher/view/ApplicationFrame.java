package com.apporelbotna.gameserver.launcher.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apporelbotna.gameserver.launcher.view.access.LoginPanel;

public class ApplicationFrame extends JFrame implements ChangeablePanel.OnPanelChangeListener
{
	private static final Logger logger = LoggerFactory.getLogger(ApplicationFrame.class);
	private static final long serialVersionUID = -4370492171907517451L;

	private ChangeablePanel frameContent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			try
			{
				ApplicationFrame frame = new ApplicationFrame();
				frame.setVisible(true);
			}
			catch (Exception e)
			{
				logger.error(e.getMessage());
			}

		});
	}

	public ApplicationFrame()
	{
		frameContent = new LoginPanel();
		frameContent.setOnPanelChangeListener(this);
		frameContent.setBorder(new EmptyBorder(5, 5, 5, 5));
		frameContent.setLayout(new BorderLayout(0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1253, 883);
		add(frameContent);
	}

	@Override
	public void onPanelChange(ChangeablePanel newPanel)
	{
		remove(frameContent);
		frameContent = newPanel;
		frameContent.setOnPanelChangeListener(this);
		add(frameContent);
		revalidate();
	}
}
