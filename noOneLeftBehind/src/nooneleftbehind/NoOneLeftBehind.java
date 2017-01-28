/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nooneleftbehind;

import byui.cit260.dsTest.model.Floor;
import byui.cit260.dsTest.model.GateKeeper;
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
        GateKeeper gateKeeper = new GateKeeper();
        Floor floor3 = new Floor();
        player1.setName("BillyBob");
        player1.setScore(7);
        gateKeeper.setHasSolved(true);
        floor3.setRoomNumber(true);
        String playerInfo = player1.toString();
        System.out.println(playerInfo);
        
    }
    
}
