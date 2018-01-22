package com.yusupov.game;

import java.awt.image.BufferedImage;

/**
 * 22.01.2018
 * SpriteSheet
 *
 * @author Aivar Yusupov
 * @version v0.1
 */
public class SpriteSheet {

    private BufferedImage sheet;
    private int spriteCount;
    private int scale;
    private int spritesInWidth;

    public SpriteSheet(BufferedImage sheet, int spriteCount, int scale) {
        this.sheet = sheet;
        this.spriteCount = spriteCount;
        this.scale = scale;

        this.spritesInWidth = sheet.getWidth() / scale;
    }

    public BufferedImage getSprite(int index) {

        index = index % spriteCount;
        int x = index % spritesInWidth * scale;
        int y = index / spritesInWidth * scale;

        return sheet.getSubimage(x, y, scale, scale);
    }

}
