package com.yusupov.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 22.01.2018
 * ResourceLoader
 *
 * @author Aivar Yusupov
 * @version v0.1
 */
public class ResourceLoader {

    public static final String PATH = "resources/";

    public static BufferedImage loadImage(String fileName) {

        BufferedImage image = null;

        try {
            image = ImageIO.read(new File(PATH + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }


        return image;

    }

}
