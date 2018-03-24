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
public class StupidBot extends Player{
    public static Element myChoice = new Rock("Rock");
    
    public StupidBot(String name){
        super(name);
    }
    
    public Element play(){
        return myChoice;
    }
}
