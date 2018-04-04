package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JScrollPane;

public class GameListPanel extends JScrollPane
{
	private static final long serialVersionUID = -5410155912413042664L;

	public GameListPanel()
	{
		init();
	}

	private void init()
	{
		setBounds(10, 11, 274, 822);
		setLayout(new GridLayout(3, 0));
		setBackground(Color.DARK_GRAY);
	}
}
