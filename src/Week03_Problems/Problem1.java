package Week03_Problems;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Problem1
{
    public static void main(String[] args)
    {
        // Load File into memory
        File f = new File("src/Week03_Problems/Resources/PSLGImage.jpeg");

        // Create BufferedImage to host file
        try
        {
            BufferedImage i = ImageIO.read(f);

            // Get the width and height params for the original image
            int width = i.getWidth();
            int height = i.getHeight();

            // Create a buffered image object that is the original image but with the height and width reversed
            BufferedImage r = new BufferedImage(height,width,i.getType());

            // Iterate through each pixel
            for(int x = 0; x<width; x++){
                for(int y = 0; y<height; y++){
                    // Set the rgb value of every pixel in the rotated image to
                    // The pixel in the original with the same y component but with the opposite X component
                    r.setRGB(y,width-1-x,i.getRGB(x,y));
                }
            }

            File output = new File("src/Week03_Problems/Resources/output.jpeg");

            ImageIO.write(r,"jpeg",output);

        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
