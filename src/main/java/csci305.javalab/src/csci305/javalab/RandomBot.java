/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci305.javalab;

import java.util.Random;

/**
 *
 * @author cmccl_000
 */
public class RandomBot extends Player{
    
    public RandomBot(String name){
        super(name);
    }
    
    public Element play(){
        Random r = new Random();
        int choice = r.nextInt((5 - 1) + 1) + 1;
        Element e = new Rock("Blank");
        switch(choice){
            case 1:
                e = new Rock("Rock");
                break;
            case 2:
                e = new Paper("Paper");
                break;
            case 3:
                e = new Scissors("Scissors");
                break;
            case 4:
                e = new Lizard("Lizard");
                break;
            case 5:
                e = new Spock("Spock");
                break;
        }
        return e;
    }
}
