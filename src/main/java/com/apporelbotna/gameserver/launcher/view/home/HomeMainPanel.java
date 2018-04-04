package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.apporelbotna.gameserver.stubs.Game;

public class HomeMainPanel extends JPanel implements GameItemPanel.OnGameSelectedListener
{
	private static final long serialVersionUID = 7003757130413876364L;

	private JScrollPane gameListPanel;
	private SelectedGamePanel selectedGamePanel;

	public HomeMainPanel()
	{
		gameListPanel = new JScrollPane();
		selectedGamePanel = new SelectedGamePanel();
		// TODO repeat this for each game of GameDAO.findGames()
		gameListPanel.getViewport().add(new GameItemPanel(
				new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "ohoo"), this), 0);
		init();
		gameListPanel.revalidate();
		gameListPanel.repaint();
	}

	private void init()
	{
		setBounds(100, 100, 1235, 844);
		setLayout(null);

		gameListPanel.setBounds(10, 11, 274, 822);
		add(gameListPanel);

		selectedGamePanel.setBackground(Color.DARK_GRAY);
		selectedGamePanel.setBounds(294, 11, 931, 822);
		add(selectedGamePanel);
	}

	@Override
	public void onGameSelected(Game game)
	{
		selectedGamePanel.updateGame(game);
	}
}
