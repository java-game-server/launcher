package com.apporelbotna.gameserver.launcher.view.home;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.apporelbotna.gameserver.launcher.games.GameExecutable;
import com.apporelbotna.gameserver.launcher.games.GameManager;
import com.apporelbotna.gameserver.launcher.view.util.Jenasso;
import com.apporelbotna.gameserver.stubs.AuthenticatedUser;
import com.apporelbotna.gameserver.stubs.Game;

public class SelectedGamePanel extends JPanel
{
	private static final long serialVersionUID = -3406917201768807474L;
	private static final String DEFAULT_IMG_URL =
			"https://png.pngtree.com/element_pic/16/11/22/56551424a96d8b34d760f5c4fc338e07.jpg";

	private JLabel gameImg;
	private JLabel gameName;
	private JTextPane gameDescription;
	private String executableName = "PongClient";

	public SelectedGamePanel()
	{
		setBounds(294, 11, 931, 822);
		setBackground(Color.DARK_GRAY);
		setLayout(null);

		gameImg = new JLabel();
		gameImg.setBounds(10, 148, 489, 369);
		Jenasso
			.from(DEFAULT_IMG_URL) 
			.loadInto(gameImg)	
			.and().scaleToFit().please();
		add(gameImg);

		gameName = new JLabel();
		gameName.setForeground(Color.WHITE);
		gameName.setFont(new Font("Yu Gothic", Font.ITALIC, 50));
		gameName.setBounds(532, 29, 314, 108);
		add(gameName);

		gameDescription = new JTextPane();
		gameDescription.setForeground(Color.LIGHT_GRAY);
		gameDescription.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
		gameDescription.setText(
				"Lorem fistrum amatomaa ese pedazo de me cago en tus muelas se calle ustée pupita a peich ahorarr torpedo benemeritaar pecador. Va usté muy cargadoo se calle ustée benemeritaar mamaar. Va usté muy cargadoo amatomaa benemeritaar te voy a borrar el cerito a gramenawer por la gloria de mi madre quietooor te va a hasé pupitaa a wan diodeno ese hombree. Ese que llega ese hombree se calle ustée a gramenawer. Qué dise usteer ese hombree ese que llega no te digo trigo por no llamarte Rodrigor sexuarl se calle ustée condemor diodeno quietooor.");
		gameDescription.setEditable(false);
		gameDescription.setBackground(Color.DARK_GRAY);
		gameDescription.setBounds(542, 148, 293, 369);
		add(gameDescription);

		JButton btnPlay = new JButton("PLAY!");
		btnPlay.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				GameManager gameManager = GameManager.getInstance();
				if (!gameManager.isGameRunning())
				{
					// TODO No se si tiene algo que ver que GameManager tenga gameRunning false, quizas es porque lo 
					// estoy testeando sin ver las fotos de los juegos y por eso alomejor no tengo una fila con el juego seleccionado y peta, pero los parametros los pasa bien
					// aka DEBUG com.apporelbotna.gameserver.launcher.games.GameExecutable - java -jar games/PongClient.jar jan@jan.com fb57c6fdb55a44379fc8f497c87898b4
					// DEBUG com.apporelbotna.gameserver.launcher.games.GameExecutable - 1
					GameManager.getInstance().launchGame(   
							new GameExecutable(executableName, AuthenticatedUser.getInstance().getUser(),
									AuthenticatedUser.getInstance().getToken()));
				}
			}
		});
		btnPlay.setFont(new Font("Yu Gothic UI", Font.BOLD, 36));
		btnPlay.setBounds(542, 539, 293, 90);
		add(btnPlay);
	}

	public void updateGame(Game game)
	{
		gameName.setText(game.getName());
		gameDescription.setText(game.getDescription());
		executableName = game.getExecutableName();
		Jenasso
			.from(game.getImgUri())
			.loadInto(gameImg)
			.and().scaleToFit().please();
	}
}
