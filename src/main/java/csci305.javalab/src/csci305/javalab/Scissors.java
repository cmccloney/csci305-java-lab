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
public class Scissors extends Element{
    
    public Scissors(String name){
        super(name);
    }
    
    public String compareTo(Element e){
        Outcome o = new Outcome("Unknown", "Tie");
        if(e.getName() == "Rock"){
            o = new Outcome("Rock crushes Scissors", "Loss");
        }else if(e.getName() == "Lizard"){
            o = new Outcome("Scissors decapitate Lizard", "Win");
        }else if(e.getName() == "Paper"){
            o = new Outcome("Scissors cut Paper", "Win");
        }else if(e.getName() == "Spock"){
            o = new Outcome("Spock smashes Scissors", "Loss");
        }else{
            o = new Outcome("Scissors equals Scissors", "Tie");
        }
        String result = o.getOutcome() + " -- " + o.getRound();
        return result;
    }
}
