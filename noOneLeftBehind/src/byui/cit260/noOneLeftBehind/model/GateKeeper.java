/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dsTest.model;

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
    
}
