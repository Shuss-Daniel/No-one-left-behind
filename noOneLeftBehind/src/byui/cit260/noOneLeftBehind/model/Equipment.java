/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.noOneLeftBehind.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MEW
 */
public class Equipment implements Serializable {
    
    //Class instance variables
    private String weapon;
    private String armor;
    private boolean equiped;
    
    //Constructor
    public Equipment() {
    }

    //To String
    @Override
    public String toString() {
        return "Equipment{" + "weapon=" + weapon + ", armor=" + armor + ", equiped=" + equiped + '}';
    }
    
    //getter and setter
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public boolean isEquiped() {
        return equiped;
    }

    public void setEquiped(boolean equiped) {
        this.equiped = equiped;
    }
    
    //boolean equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.weapon);
        hash = 11 * hash + Objects.hashCode(this.armor);
        hash = 11 * hash + (this.equiped ? 1 : 0);
        return hash;
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
        final Equipment other = (Equipment) obj;
        if (this.equiped != other.equiped) {
            return false;
        }
        if (!Objects.equals(this.weapon, other.weapon)) {
            return false;
        }
        if (!Objects.equals(this.armor, other.armor)) {
            return false;
        }
        return true;
    }
    
    
    
}
