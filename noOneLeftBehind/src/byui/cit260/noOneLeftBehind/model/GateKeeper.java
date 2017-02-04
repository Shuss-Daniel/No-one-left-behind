/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Needs to be the same packagea
//package byui.cit260.dsTest.model;

package byui.cit260.noOneLeftBehind.model;

import byui.cit260.noOneLeftBehind.control.*;
import java.io.Serializable;

/**
 *
 * @author DS
 */
public class GateKeeper implements Serializable{
    
// class instance variables
    private boolean hasSolved;
    
// default constructor

    public GateKeeper() {
    }

// Getters and Setters
    public boolean isHasSolved() {
        return hasSolved;
    }

    public void setHasSolved(boolean hasSolved) {
        this.hasSolved = hasSolved;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.hasSolved ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "GateKeeper{" + "hasSolved=" + hasSolved + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GateKeeper other = (GateKeeper) obj;
        if (this.hasSolved != other.hasSolved) {
            return false;
        }
        return true;
    }
    
    public boolean givePuzzle(){
        GatePuzzle newPuzzle = new GatePuzzle();
        boolean check = newPuzzle.checkGatePuzzle(10, 70, 1000, 30);
        if(check){
            System.out.println("Correct!!");
            return true;
        }
        else {
            System.out.println("You fail");
            return false;
        }
    }
    
}
