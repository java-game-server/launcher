package games;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apporelbotna.gameserver.stubs.Token;
import com.apporelbotna.gameserver.stubs.User;

public class GameExecutable
{
	private static final Logger logger = LoggerFactory.getLogger(GameExecutable.class);

	public static final String GAME_INSTALLATION_DIR = "games/";
	protected static final String GAME_EXTENSION = ".jar";

	protected String executableName;
	private User executee;
	private Token userToken;

	public GameExecutable(String executableName, User executee, Token userToken)
	{
		this.executableName = executableName;
		this.executee = executee;
		this.userToken = userToken;
	}

	public Process execute()
	{
		String command =
				"java -jar "
			+ GAME_INSTALLATION_DIR
			+ executableName + ( ! executableName.endsWith(GAME_EXTENSION) ? GAME_EXTENSION : "")
			+ " " + executee.getEmail()
			+ " " + userToken.getTokenName();

		try
		{
			return Runtime.getRuntime().exec(command);
		}
		catch (IOException e)
		{
			logger.error(e.getMessage());
		}
		return null;
	}
}
