/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_filemanagerwithimageseditor.plugins;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Luk
 */
public class RotateImage extends InverseColors {

    public String rotateImage(String imageName) {
        inputFile = null;

        try {
            inputFile = ImageIO.read(new File(imageName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int width = inputFile.getWidth();
        int height = inputFile.getHeight();
        BufferedImage newImage = new BufferedImage(height, width, inputFile.getType());

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                newImage.setRGB(height - 1 - j, i, inputFile.getRGB(i, j));
            }
        }

       // return newImage;

        try {
            outputFile = new File("resources\\rotated.jpg");
            ImageIO.write(inputFile, "jpg", outputFile);
            return outputFile.getPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
