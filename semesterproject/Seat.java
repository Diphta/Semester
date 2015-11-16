/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author philip
 */
public class Seat {
    private boolean available;
    private int seatNumber;
    
    public void draw(Graphics g) {
        if (available) {
            g.setColor(Color.GREEN);
            g.drawRect(10, 10, 20, 20);
        } else {
            g.setColor(Color.RED);
            g.drawRect(10, 10, 20, 20);
        }
    }
}
