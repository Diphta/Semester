/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

/**
 *
 * @author philip
 */
public class Hall {
    
    private final String name;
    final Seat[][] seats;
    private int x0 = 0;
    private int y0 = 0;
    private int seatCounter = 0;


    public Hall(String name, int numberRows, int numberSeats) {
        this.name = name;
        this.seats = new Seat[numberRows][numberSeats];
    }

    public void fillSeatsSal1() {
        for (int x = 0; x < seats.length; x++) {
            for (int y = 0; y < seats[x].length; y++) {
                Seat st = new Seat(x0 + 10, y0 + 10);
                seats[x][y] = st;
                seatCounter++;
                if (seatCounter >= 20) {
                    seatCounter = 0;
                     y0 += 20;
                     x0 = 0;
                } else {
                x0 += 20;
            }
        }
    }
}
    public void fillSeatsSal2() {
        for (int x = 0; x < seats.length; x++) {
            for (int y = 0; y < seats[x].length; y++) {
                Seat st = new Seat(x0 + 10, y0 + 10);
                seats[x][y] = st;
                seatCounter++;
                if (seatCounter >= 12) {
                    seatCounter = 0;
                     y0 += 20;
                     x0 = 0;
                } else {
                x0 += 20;
            }
        }
    }
}
    public void fillSeatsSal3() {
        for (int x = 0; x < seats.length; x++) {
            for (int y = 0; y < seats[x].length; y++) {
                Seat st = new Seat(x0 + 10, y0 + 10);
                seats[x][y] = st;
                seatCounter++;
                if (seatCounter >= 6) {
                    seatCounter = 0;
                     y0 += 20;
                     x0 = 0;
                } else {
                x0 += 20;
            }
        }
    }
}
}
