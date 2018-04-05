package com.apporelbotna.gameserver.launcher.view.util;

import java.net.MalformedURLException;
import java.net.URL;

// TODO finish
public class JhenImageLoader
{
	private static class ImageLoaderBuilderUrl
	{
		private URL url;

		public ImageLoaderBuilderUrl(URL url)
		{
			this.url = url;
		}
	}

	public static ImageLoaderBuilderUrl from(URL url)
	{
		return new ImageLoaderBuilderUrl(url);
	}

	public static ImageLoaderBuilderUrl from(String url)
	{
		try
		{
			return from(new URL(url));
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
