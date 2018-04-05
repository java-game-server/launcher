package com.apporelbotna.gameserver.launcher.properties;

import java.util.ResourceBundle;

public final class ApplicationProperties
{
	private static String version;
	private static String name;

	private ApplicationProperties()
	{
		throw new UnsupportedOperationException("ApplicationProperties must not be instantiated!");
	}

	static
	{
		ResourceBundle bundle = ResourceBundle
				.getBundle("com.apporelbotna.gameserver.launcher.properties.application");

		version = bundle.getString("version");
		name = bundle.getString("name");
	}

	public static String getVersion()
	{
		return version;
	}

	public static String getName()
	{
		return name;
	}
}
