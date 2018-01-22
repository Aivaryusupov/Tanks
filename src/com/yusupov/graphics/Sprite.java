package com.yusupov.graphics;

import com.yusupov.utils.Utils;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * 22.01.2018
 * Sprite
 *
 * @author Aivar Yusupov
 * @version v0.1
 */
public class Sprite {

    private SpriteSheet sheet;
    private float scale;
    private BufferedImage image;

    public Sprite(SpriteSheet sheet, float scale) {
        this.sheet = sheet;
        this.scale = scale;
        image = sheet.getSprite(0);
        image = Utils.resize(image, (int)(image.getWidth() * scale), (int) (image.getHeight() * scale));
    }

    public void render(Graphics2D g, float x, float y) {

        g.drawImage(image, (int) x, (int) y, null);
    }
}
