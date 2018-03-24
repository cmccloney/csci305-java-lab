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
public class Lizard extends Element{
    
    public Lizard(String name){
        super(name);
    }
    
    public String compareTo(Element e){
        Outcome o = new Outcome("Unknown", "Tie");
        if(e.getName() == "Scissors"){
            o = new Outcome("Scissors decapitate Lizard", "Loss");
        }else if(e.getName() == "Rock"){
            o = new Outcome("Rock crushes Lizard", "Loss");
        }else if(e.getName() == "Paper"){
            o = new Outcome("Lizard eats Paper", "Win");
        }else if(e.getName() == "Spock"){
            o = new Outcome("Lizard poisons Spock", "Win");
        }else{
            o = new Outcome("Lizard equals Lizard", "Tie");
        }
        String result = o.getOutcome() + " -- " + o.getRound();
        return result;
    }
}
