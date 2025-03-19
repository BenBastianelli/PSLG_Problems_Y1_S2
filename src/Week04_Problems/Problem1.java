package Week04_Problems;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Problem1 {
    public static void main(String[] args) {
        File inputFile = new File("src/Week04_Problems/Resources/PSLGImage.jpeg");  // Change this to your image path
        File outputFile = new File("src/Week04_Problems/Resources/cropped.jpeg"); // The cropped image output

        try {
            // Read the original image
            BufferedImage original = ImageIO.read(inputFile);
            int width = original.getWidth();
            int height = original.getHeight();

            // Create a new BufferedImage for the grayscale image
            BufferedImage cropped = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);

            int croppedWidth = (width/2 - 100); // Gives 200 pixels distance from center of  X
            int croppedHeight = (height/2 - 100); // Gives 200 pixels distance from center of Y

            for(int i = 0 ; i<200; i++)
            {
                for(int j = 0; j<200; j++)
                {
                    int pixel = original.getRGB(croppedWidth+i,croppedHeight+j);
                    cropped.setRGB(i,j,pixel);
                }
            }

            // Write the grayscale image to a new file
            ImageIO.write(cropped, "jpeg", outputFile);

            System.out.println("Image Cropped Successfully!");

        }catch(IOException ioe){
            System.err.print("Error occured!");
        }
    }
}
