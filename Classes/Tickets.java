/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Simon
 */
public class Tickets {

    private Costumer costumer;

    public Tickets(Costumer costumer) {
        this.costumer = costumer;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public int getTotal() {
        int sum = 0;

        return sum;
    }

//    public Tickets generateReceit() {
//        String receitContent = "";
//
//        receitContent += costumer + "kundeoplysninger \n";
//        receitContent += "--------------------------";
//        
//             Tickets receit = new Tickets(receitContent);   
//       return receit;
//    }

}
