package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;

import com.apporelbotna.gameserver.launcher.view.home.GameItemPanel.OnGameSelectedListener;
import com.apporelbotna.gameserver.persistencewsclient.GameDAO;
import com.apporelbotna.gameserver.stubs.AuthenticatedUser;
import com.apporelbotna.gameserver.stubs.Game;

public class GameListPanel extends JPanel
{
	private static final long serialVersionUID = -5410155912413042664L;

	private transient GameDAO gameDAO;

	public GameListPanel()
	{
		gameDAO = new GameDAO();
		init();
	}

	private void init()
	{
		setBounds(10, 11, 274, 822);
		setLayout(new GridLayout(0, 1));
		setBackground(Color.DARK_GRAY);
	}

	public void reloadGameList(OnGameSelectedListener listener)
	{
		removeAll();
		List<Game> games = gameDAO.findAllGamesByUser(AuthenticatedUser.getInstance().getUser());
		games.forEach(g -> add(new GameItemPanel(g, listener))); 
		this.setSize(getWidth(), GameItemPanel.HEIGHT * games.size());
		revalidate();
		repaint();
	}
}
