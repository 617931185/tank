package com.mist.tank;

import java.awt.*;

public class Tank {
    private int x,y;
    private Dir dir;
    private static final int SPEED = 10;

    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public void paint(Graphics g) {
        g.fillRect(x,y,50,50);
        switch (getDir()) {
            case UP:
                y -= 10;
                break;
            case DOWN:
                y += 10;
                break;
            case LEFT:
                x -= 10;
                break;
            case RIGHT:
                x += 10;
                break;
            default:
                break;
        }
    }
}
