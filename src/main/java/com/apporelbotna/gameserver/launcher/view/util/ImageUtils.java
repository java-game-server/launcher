package com.apporelbotna.gameserver.launcher.view.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

public class ImageUtils
{
	private ImageUtils()
	{
		throw new UnsupportedOperationException("ImageUtils should not be instantiated!");
	}

	public static Image scale(Image image, int width, int height)
	{
		BufferedImage resizedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = resizedImg.createGraphics();

		g2.setRenderingHint(
				RenderingHints.KEY_INTERPOLATION,
				RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		
		g2.drawImage(image, 0, 0, width, height, null);
		g2.dispose();

		return resizedImg;
	}
	
	public static Image scaleToFit(Image image, JComponent component)
	{
		return scale(image, component.getWidth(), component.getHeight());
	}
}
