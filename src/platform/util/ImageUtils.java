package platform.util;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.filters.Canvas;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtils {
	private static BufferedImage resizeImage(BufferedImage image, int width, int height) throws IOException {
		return Thumbnails.of(image)
				.size(width, height)
				.addFilter(new Canvas(width, height, Positions.CENTER, Color.white))
				.asBufferedImage();
	}

	public static ByteArrayOutputStream minifyImageWidth(BufferedImage image, Integer width, Integer height) throws IOException {
		ByteArrayOutputStream outputStreams = null;
		outputStreams = new ByteArrayOutputStream();
		int originalWidth = image.getWidth();
		boolean fitExact = height == null ? false : true;
		BufferedImage newImage;
		newImage = image;
		outputStreams = new ByteArrayOutputStream();
		if (fitExact && height != null && height > 0) {
			newImage = resizeImage(image, width, height);
		} else if (originalWidth > width) {
			newImage = Scalr.resize(image, Scalr.Mode.FIT_TO_WIDTH, width);
		}
		ImageIO.write(newImage, Field.MINIFIED_IMAGE_FILE_TYPE, outputStreams);
		return outputStreams;
	}
}
