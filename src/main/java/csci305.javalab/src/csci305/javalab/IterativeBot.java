/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci305.javalab;

/**
 *
 * @author cmccl_000
 */
public class IterativeBot extends Player{
    int choice = -1;
    
    public IterativeBot(String name){
        super(name);
    }
    
    public Element play(){
        Element e = new Rock("Blank");
        choice = ((choice + 1) % 5) + 1;
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
    
    public Element play(String s){
        Element e = new Rock("Don't be here");
        return e;
    }
}
