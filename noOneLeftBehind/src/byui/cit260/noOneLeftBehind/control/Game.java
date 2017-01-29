/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.noOneLeftBehind.control;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Alexis
 */
public class Game implements Serializable {
    
     //Private member variables
    private String name;

    //Empty constructor
    public Game() {
    }
    
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Hash code function
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }
    

    //To String function
    @Override
    public String toString() {
        return "Game{" + "name=" + name + '}';
    }

    //Equals function
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
        final Game other = (Game) obj;
        return Objects.equals(this.name, other.name);
    }



    
}
