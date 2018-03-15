/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_filemanagerwithimageseditor.plugins;

/**
 *
 * @author Luk
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class InverseColors {

    BufferedImage inputFile;
    File outputFile;

    public String invertImage(String imageName) {
        inputFile = null;
        try {
            inputFile = ImageIO.read(new File(imageName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int x = 0; x < inputFile.getWidth(); x++) {
            for (int y = 0; y < inputFile.getHeight(); y++) {
                int rgba = inputFile.getRGB(x, y);
                Color col = new Color(rgba, true);
                col = new Color(255 - col.getRed(),
                        255 - col.getGreen(),
                        255 - col.getBlue());
                inputFile.setRGB(x, y, col.getRGB());
            }
        }

        try {
            outputFile = new File("resources\\inverted.jpg");
            ImageIO.write(inputFile, "jpg", outputFile);
            return outputFile.getPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
