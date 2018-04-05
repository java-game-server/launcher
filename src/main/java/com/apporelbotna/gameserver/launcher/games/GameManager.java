package com.apporelbotna.gameserver.launcher.games;

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

	public void launchGame(GameExecutable gameExecutable)
	{
		gameRunning = true;
		gameExecutable.execute();
		gameRunning = false;
	}

	public boolean isGameRunning()
	{
		return gameRunning;
	}
}
