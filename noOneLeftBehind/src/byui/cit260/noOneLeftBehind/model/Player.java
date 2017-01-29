/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.noOneLeftBehind.model;

import java.io.Serializable;

/**
 *
 * @author Alexis
 */
public class Player implements Serializable {
    
    //member varibles
    private String _name;
    private int _bestTime;

    public Player() { }
    
    
    
    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getBestTime() {
        return _bestTime;
    }

    public void setBestTime(int _bestTime) {
        this._bestTime = _bestTime;
    } 
    
    
    
    
 


    
    
}
