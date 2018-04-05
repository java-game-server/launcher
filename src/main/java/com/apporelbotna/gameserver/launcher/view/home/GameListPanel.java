package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

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
		setLayout(new GridLayout(0, 1));
		setBackground(Color.DARK_GRAY);
	}

	public void reloadGameList(OnGameSelectedListener listener)
	{
		removeAll();
		// TODO repeat this for each game of GameDAO.findGames()
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		add(new GameItemPanel(new Game(1, "Ponsh", "Pretty fucking amazing game", "PongGame", "https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"),
				listener));
		this.setSize(getWidth(), GameItemPanel.HEIGHT * 14);
		revalidate();
		repaint();
	}
}
