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
public class Rock extends Element{
    
    public Rock(String name){
        super(name);
    }
    
    public String compareTo(Element e){
        Outcome o = new Outcome("Unknown", "Tie");
        if(e.getName() == "Scissors"){
            o = new Outcome("Rock crushes Scissors", "Win");
        }else if(e.getName() == "Lizard"){
            o = new Outcome("Rock crushes Lizard", "Win");
        }else if(e.getName() == "Paper"){
            o = new Outcome("Paper covers Rock", "Loss");
        }else if(e.getName() == "Spock"){
            o = new Outcome("Spock vaporizes Rock", "Loss");
        }else{
            o = new Outcome("Rock equals Rock", "Tie");
        }
        String result = o.getOutcome() + " -- " + o.getRound();
        return result;
    }
    
}
