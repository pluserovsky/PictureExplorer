/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_filemanagerwithimageseditor.plugins;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Luk
 */
public class RotateImage extends InverseColors {
    double radians = 3.1416;
    public String rotateImage(String imageName) {
        inputFile = null;

        try {
            inputFile = ImageIO.read(new File(imageName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        AffineTransform transform = new AffineTransform();
    transform.rotate(radians, inputFile.getWidth()/2, inputFile.getHeight()/2);
    AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);
    inputFile = op.filter(inputFile, null);

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
