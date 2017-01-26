/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nooneleftbehind;

import byui.cit260.noOneLeftBehind.model.*;

/**
 *
 * @author DS
 */
public class NoOneLeftBehind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Room room1 = new Room();
        savePlayer player1 = new savePlayer();
        player1.setName("BillyBob");
        player1.setScore(7);
        String playerInfo = player1.toString();
        System.out.println(playerInfo);
        
    }
    
}
