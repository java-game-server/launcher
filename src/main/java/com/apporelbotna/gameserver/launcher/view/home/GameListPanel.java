package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.ScrollPaneLayout;

import com.apporelbotna.gameserver.launcher.view.home.GameItemPanel.OnGameSelectedListener;
import com.apporelbotna.gameserver.stubs.Game;

public class GameListPanel extends JPanel
{
	private static final long serialVersionUID = -5410155912413042664L;

	public GameListPanel()
	{
		init();
	}

	private void init()
	{
		setBounds(10, 11, 274, 822);
		// setLayout(new GridLayout(3, 0));
		setLayout(new ScrollPaneLayout());
		setBackground(Color.DARK_GRAY);
	}

	public void refreshGameList(OnGameSelectedListener listener)
	{
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "ohoo"),
				listener), 0);
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "ohoo"),
				listener), 0);
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "ohoo"),
				listener), 0);

		// GameDAO gameDAO = new GameDAO();
		// for (Game game : gameDAO.findAllGamesByUser(AuthenticatedUser.getInstance().getUser()))
		// add(new GameItemPanel(game), 0);
		// revalidate();
		// repaint();
	}
}
