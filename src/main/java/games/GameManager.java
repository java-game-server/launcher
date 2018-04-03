package games;

public class GameManager
{
	private boolean gameRunning;
	private static GameManager instance;

	private GameManager() { }

	public static GameManager getInstance()
	{
		if(instance == null)
			return new GameManager();
		return instance;
	}

	public Process launchGame(GameExecutable gameExecutable)
	{
		gameRunning = true;
		return gameExecutable.execute();
	}

	public boolean isGameRunning()
	{
		return gameRunning;
	}
}
