package Week04_Problems;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Problem2
{
    public static void main(String[] args) {
        // Input and output file paths
        File inputFile = new File("src/Week04_Problems/Resources/PSLGImage.jpeg");  // Change this to your image path
        File outputFile = new File("src/Week04_Problems/Resources/gray.jpeg"); // The grayscale image output

        try {
            // Read the original image
            BufferedImage original = ImageIO.read(inputFile);
            int width = original.getWidth();
            int height = original.getHeight();

            // Create a new BufferedImage for the grayscale image
            BufferedImage grayscale = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            // Convert each pixel to grayscale
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    int rgb = original.getRGB(x, y);

                    // Extract color components
                    int red = (rgb >> 16) & 0xFF;
                    int green = (rgb >> 8) & 0xFF;
                    int blue = rgb & 0xFF;

                    // Calculate grayscale value using luminosity formula
                    int gray = (int) (0.299 * red + 0.587 * green + 0.114 * blue);

                    // Convert grayscale value back to RGB format
                    int grayRGB = (gray << 16) | (gray << 8) | gray;

                    // Set the new pixel value
                    grayscale.setRGB(x, y, grayRGB);
                }
            }

            // Write the grayscale image to a new file
            ImageIO.write(grayscale, "jpeg", outputFile);

            System.out.println("Grayscale image saved successfully!");

        } catch (IOException e) {
            System.out.println("Error processing image: " + e.getMessage());
        }
    }
}
