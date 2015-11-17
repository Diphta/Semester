/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

/**
 *
 * @author Bruger
 */
public class Costumer {
    
    private String name;
    private int phoneNumber;
    private String cardNumber; 
    private int controlDigits;

    public Costumer(String name, int phoneNumber, String cardNumber, int controlDigits) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        this.controlDigits = controlDigits;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getControlDigits() {
        return controlDigits;
    }

    public void setControlDigits(int controlDigits) {
        this.controlDigits = controlDigits;
    }
    
           
    
}
