/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Dino
 */
public class ShowType {
    private String description;
    private double price;
    private int ageRequirement;
    private ArrayList<Show> show;
    
    
    public int getAgeRequirement() {
        return ageRequirement;
    }

    public void setAgeRequirement(int ageRequirement) {
        this.ageRequirement = ageRequirement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Show> getShow() {
        return show;
    }

    public void setShow(ArrayList<Show> show) {
        this.show = show;
    }

    public ShowType(String description, double price, int ageRequirement) {
        show = new ArrayList<>();
        this.description = description;
        this.price = price;
        this.ageRequirement = ageRequirement;
    }
    
    
}
