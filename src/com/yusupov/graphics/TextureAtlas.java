package com.yusupov.graphics;

import com.yusupov.utils.ResourceLoader;

import java.awt.image.BufferedImage;

/**
 * 22.01.2018
 * TextureAtlas
 *
 * @author Aivar Yusupov
 * @version v0.1
 */
public class TextureAtlas {

    BufferedImage image;

    public TextureAtlas(String imageName) {
        image = ResourceLoader.loadImage(imageName);
    }

    public BufferedImage cut(int x, int y, int w, int h) {
        return image.getSubimage(x, y, w, h);
    }

}
