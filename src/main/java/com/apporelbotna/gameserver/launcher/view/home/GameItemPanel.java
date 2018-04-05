package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import com.apporelbotna.gameserver.launcher.view.util.ImageUtils;
import com.apporelbotna.gameserver.stubs.Game;

public class GameItemPanel extends JPanel
{
	private static final long serialVersionUID = -7787888816232211277L;
	
	public static final int HEIGHT = 93;

	interface OnGameSelectedListener
	{
		void onGameSelected(Game game);
	}

	private Game game;
	private OnGameSelectedListener onGameSelectedListener;

	public GameItemPanel(Game game)
	{
		this(game, null);
	}

	public GameItemPanel(Game game, OnGameSelectedListener onGameSelectedListener)
	{
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.game = game;
		this.onGameSelectedListener = onGameSelectedListener;
		init();
	}

	private void init()
	{
		setBackground(Color.DARK_GRAY);
		setLayout(null);

		JLabel gameImg = new JLabel();
		gameImg.setForeground(Color.WHITE);
		gameImg.setBounds(0, 0, 94, HEIGHT);
		
		// TODO sacar getImgUrlAsImage a Game (stubs)
		try
		{
			BufferedImage image = ImageIO.read(new URL(
					"https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg"));
			gameImg.setIcon(new ImageIcon(ImageUtils.scaleToFit(image, gameImg)));
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		// extract me
		
		add(gameImg);

		JLabel gameName = new JLabel(game.getName());
		gameName.setForeground(Color.WHITE);
		gameName.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 21));
		gameName.setBounds(104, 19, 122, 49);
		add(gameName);

		setVisible(true);

		this.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				onGameSelectedListener.onGameSelected(game);
			}

			@Override
			public void mouseEntered(MouseEvent e)
			{
				setBackground(Color.LIGHT_GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				setBackground(Color.DARK_GRAY);
			}
		});
	}
}
