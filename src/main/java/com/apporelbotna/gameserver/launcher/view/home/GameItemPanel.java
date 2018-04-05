package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import com.apporelbotna.gameserver.launcher.view.util.Jenasso;
import com.apporelbotna.gameserver.stubs.Game;

public class GameItemPanel extends JPanel
{
	private static final long serialVersionUID = -7787888816232211277L;

	public static final int WIDTH = 243;
	public static final int HEIGHT = 90;

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

	/**
	 * @wbp.parser.constructor
	 */
	public GameItemPanel(Game game, OnGameSelectedListener onGameSelectedListener)
	{
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
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
		gameImg.setBounds(0, 0, 94, 93);

		Jenasso.from(game.getImgUri()).loadInto(gameImg).and().scaleToFit().please();
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
