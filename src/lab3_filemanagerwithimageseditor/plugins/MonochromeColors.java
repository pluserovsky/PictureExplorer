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
public class MonochromeColors extends InverseColors {

    int MONO_THRESHOLD = 400;


    public String monochromeImage(String imageName) {
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
                if (col.getRed() + col.getGreen() + col.getBlue() > MONO_THRESHOLD) {
                    col = new Color(255, 255, 255);
                } else {
                    col = new Color(0, 0, 0);
                }
                inputFile.setRGB(x, y, col.getRGB());
            }
        }

        try {
            outputFile = new File("resources\\monochromed.jpg");
            ImageIO.write(inputFile, "jpg", outputFile);
            //System.out.println(outputFile.getPath());
            return outputFile.getPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
