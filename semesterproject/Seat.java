/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author philip
 */
public class Seat {
    private boolean available = true;
    private int seatNumber;
    private int x = 0;
    private int y = 0;
    
    public void draw(Graphics g) {
        if (available) {
            g.setColor(Color.GREEN);
            g.fillRect(getX(), getY(), 20, 20);
        } else {
            g.setColor(Color.RED);
            g.fillRect(getX(), getY(), 20, 20);
        }
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
    
    
}
