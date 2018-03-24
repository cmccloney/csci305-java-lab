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
public abstract class Player {
    private String name;
    
    public Player(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public abstract Element play();
}
