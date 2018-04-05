package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.apporelbotna.gameserver.stubs.Game;

public class HomeMainPanel extends JPanel implements GameItemPanel.OnGameSelectedListener
{
	private static final long serialVersionUID = 7003757130413876364L;

	private JScrollPane gameListScroll;
	private GameListPanel gameListPanel;
	private SelectedGamePanel selectedGamePanel;

	public HomeMainPanel()
	{
		gameListScroll = new JScrollPane();
		gameListPanel = new GameListPanel();
		selectedGamePanel = new SelectedGamePanel();

		gameListScroll.getViewport().add(gameListPanel);
		init();
	}

	private void init()
	{
		setBounds(100, 100, 1235, 844);
		setLayout(null);

		gameListScroll.setBounds(10, 11, 274, 822);
		add(gameListScroll);

		selectedGamePanel.setBackground(Color.DARK_GRAY);
		selectedGamePanel.setBounds(294, 11, 931, 822);
		add(selectedGamePanel);

		reloadGameList();
	}

	@Override
	public void onGameSelected(Game game)
	{
		selectedGamePanel.updateGame(game);
	}

	public void reloadGameList()
	{
		gameListPanel.reloadGameList(this);
		revalidate();
		repaint();
	}
}
