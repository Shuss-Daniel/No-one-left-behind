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
public class Enemy implements Serializable {
    
    //Class instance varialbes
    private String skeleton;
    private String ghost;
    private String zombie;
    private String vampire;
    
    //Constructor
    public Enemy() {
    }

    // To string 
    @Override
    public String toString() {
        return "Enemy{" + "skeleton=" + skeleton + ", ghost=" + ghost + ", zombie=" + zombie + ", vampire=" + vampire + '}';
    }
    
    //getter setter

    public String getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    public String getGhost() {
        return ghost;
    }

    public void setGhost(String ghost) {
        this.ghost = ghost;
    }

    public String getZombie() {
        return zombie;
    }

    public void setZombie(String zombie) {
        this.zombie = zombie;
    }

    public String getVampire() {
        return vampire;
    }

    public void setVampire(String vampire) {
        this.vampire = vampire;
    }
    
    //equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.skeleton);
        hash = 79 * hash + Objects.hashCode(this.ghost);
        hash = 79 * hash + Objects.hashCode(this.zombie);
        hash = 79 * hash + Objects.hashCode(this.vampire);
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
        final Enemy other = (Enemy) obj;
        if (!Objects.equals(this.skeleton, other.skeleton)) {
            return false;
        }
        if (!Objects.equals(this.ghost, other.ghost)) {
            return false;
        }
        if (!Objects.equals(this.zombie, other.zombie)) {
            return false;
        }
        if (!Objects.equals(this.vampire, other.vampire)) {
            return false;
        }
        return true;
    }
    
    
}
