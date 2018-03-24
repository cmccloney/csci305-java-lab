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
public class Spock extends Element{
    
    public Spock(String name){
        super(name);
    }
    
    public String compareTo(Element e){
        Outcome o = new Outcome("Unknown", "Tie");
        if(e.getName() == "Scissors"){
            o = new Outcome("Spock smashes Scissors", "Win");
        }else if(e.getName() == "Lizard"){
            o = new Outcome("Lizard poisons Spock", "Loss");
        }else if(e.getName() == "Paper"){
            o = new Outcome("Paper disproves Spock", "Loss");
        }else if(e.getName() == "Rock"){
            o = new Outcome("Spock vaporizes Rock", "Win");
        }else{
            o = new Outcome("Spock equals Spock", "Tie");
        }
        String result = o.getOutcome() + " -- " + o.getRound();
        return result;
    }
}
