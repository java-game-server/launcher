package com.apporelbotna.gameserver.launcher.view.util;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

// REFACTOR
public class Jenasso
{
	public static class ImageLoaderBuilderUrl
	{
		private URL url;

		private ImageLoaderBuilderUrl(URL url)
		{
			this.url = url;
		}

		public ImageLoaderBuilderEndpoint loadInto(JLabel label)
		{
			try
			{
				return new ImageLoaderBuilderEndpoint(ImageIO.read(url), label);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return null;
		}
	}

	public static class ImageLoaderBuilderEndpoint
	{
		private Image image;
		private JLabel label;

		private ImageLoaderBuilderEndpoint(Image image, JLabel label)
		{
			this.image = image;
			this.label = label;
		}

		public ImageLoaderBuilderTransforms and()
		{
			return new ImageLoaderBuilderTransforms(this);
		}

		public void please()
		{
			label.setIcon(new ImageIcon(image));
		}
	}

	public static class ImageLoaderBuilderTransforms
	{
		private ImageLoaderBuilderEndpoint endpoint;

		private ImageLoaderBuilderTransforms(ImageLoaderBuilderEndpoint endpoint)
		{
			this.endpoint = endpoint;
		}

		public ImageLoaderBuilderEndpoint scaleToFit()
		{
			endpoint.image = ImageUtils.scaleToFit(endpoint.image, endpoint.label);
			return endpoint;
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
