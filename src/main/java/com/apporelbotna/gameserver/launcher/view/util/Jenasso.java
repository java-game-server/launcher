package com.apporelbotna.gameserver.launcher.view.util;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An utility class to download images from the Internet and place them into a JLabel with the
 * desired transformations, all in one line.
 *
 * @author Jendoliver
 * @see http://square.github.io/picasso/	(Original idea for Android)
 *
 */
public class Jenasso
{
	private static final Logger logger = LoggerFactory.getLogger(Jenasso.class);

	private Jenasso()
	{

	}

	public static class JenassoBuilderUrl
	{
		private URL url;

		private JenassoBuilderUrl(URL url)
		{
			this.url = url;
		}

		/**
		 * Tells Jenasso where to load the image into. You will still need to call <b>please()</b>
		 * on the returned JenassoBuilderEndpoint for Jenasso to make your desires true.
		 *
		 * @param label The JLabel in which to load the image
		 * @return A JenassoBuilderEndpoint, which allows the user either to terminate the build
		 * or to add some transformations to the image before finishing
		 */
		public JenassoBuilderEndpoint loadInto(JLabel label)
		{
			try
			{
				return new JenassoBuilderEndpoint(ImageIO.read(url), label);
			}
			catch (IOException e)
			{
				logger.error(e.getMessage());
			}
			return null;
		}
	}

	public static class JenassoBuilderEndpoint
	{
		private Image image;
		private JLabel label;

		private JenassoBuilderEndpoint(Image image, JLabel label)
		{
			this.image = image;
			this.label = label;
		}

		/**
		 * Returns an instance of JenassoBuilderTransforms, which allows the user to transform the
		 * image before finally placing it into the label
		 *
		 * @return A builder which image transform methods
		 */
		public JenassoBuilderTransforms and()
		{
			return new JenassoBuilderTransforms(this);
		}

		/**
		 * <b>Executes the previously given instructions (terminal operation)</b>
		 *
		 * <i>You have to be polite with Jenasso if you want it to execute your desires</i>
		 */
		public void please()
		{
			label.setIcon(new ImageIcon(image));
		}
	}

	public static class JenassoBuilderTransforms
	{
		private JenassoBuilderEndpoint endpoint;

		private JenassoBuilderTransforms(JenassoBuilderEndpoint endpoint)
		{
			this.endpoint = endpoint;
		}

		/**
		 * Scales the image so it fits all the label
		 *
		 * @return The calling JenassoBuilderEndpoint, which allows to call <b>please()</b> to
		 * terminate the building
		 */
		public JenassoBuilderEndpoint scaleToFit()
		{
			endpoint.image = ImageUtils.scaleToFit(endpoint.image, endpoint.label);
			return endpoint;
		}
	}

	/**
	 * Entry point for Jenasso to start managing your images
	 *
	 * @param url The URL object pointing to your desired image
	 * @return A JenassoBuilderUrl instance, which will allow the user to define where to put
	 * the image
	 */
	public static JenassoBuilderUrl from(URL url)
	{
		return new JenassoBuilderUrl(url);
	}

	/**
	 * Entry point for Jenasso to start managing your images
	 *
	 * @param url The URL String referencing to your desired image
	 * @return A JenassoBuilderUrl instance, which will allow the user to define where to put
	 * the image
	 */
	public static JenassoBuilderUrl from(String url)
	{
		try
		{
			return from(new URL(url));
		}
		catch (MalformedURLException e)
		{
			logger.error(e.getMessage());
		}
		return null;
	}
}
