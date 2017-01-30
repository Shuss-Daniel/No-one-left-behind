/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.noOneLeftBehind.control;


//These two should not be here
//import byui.cit260.dsTest.model.Floor;
//import byui.cit260.dsTest.model.GateKeeper;


//These should be here
import byui.cit260.noOneLeftBehind.model.*;
import byui.cit260.noOneLeftBehind.view.*;




/**
 *
 * @author DS
 */
public class NoOneLeftBehind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// Create an instance of each class

        //Room instance
        Room room1 = new Room();
        
        //savePlayer instance
        savePlayer player1 = new savePlayer();
        player1.setName("BillyBob");
        player1.setScore(7);
        String playerInfo = player1.toString();
        
        //Game instance
        Game game1 = new Game();
        game1.setName("My First Game");
        String gameInfo = game1.toString();
        
        //Creature instance
        Creature indiana = new Creature();
        indiana.setBaseArmor(2);
        indiana.setBaseAttack(5);
        indiana.setHitPoints(100);
        indiana.addInventory("Dull Sword", 5);
        indiana.addInventory("Rusty Shield", 2);
        String creatInfo = indiana.toString();
        
        //Map instance
        Map newMap = new Map();
        newMap.setActiveFloor(1);
        newMap.setActiveRoom(2);
        String mapInfo = newMap.toString();
        
        //GateKeeper instance
        GateKeeper gateKeeper = new GateKeeper();
        gateKeeper.setHasSolved(true);
        
        //Floor instance
        Floor floor3 = new Floor();
        floor3.setRoomNumber(3);
        
        

       //Out put instances of each class
        System.out.println(playerInfo);
        System.out.println(gameInfo);
        System.out.println(creatInfo);
        System.out.println(mapInfo);
        System.out.println(floor3);
        System.out.println(gateKeeper);
        
        
        
    }
    
}
