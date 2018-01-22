package com.yusupov.game.level;

import com.yusupov.utils.Utils;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * 22.01.2018
 * Tile
 *
 * @author Aivar Yusupov
 * @version v0.1
 */
public class Tile {

    private BufferedImage image;
    private TileType type;

    protected Tile(BufferedImage image, int scale, TileType type) {
        this.type = type;
        this.image = Utils.resize(image, image.getWidth() * scale, image.getHeight() * scale);
    }

    protected void render(Graphics2D g, int x, int y) {
        g.drawImage(image, x, y, null);
    }

    protected TileType type() {
        return type;
    }

}
