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
public class Paper extends Element{
    
    public Paper(String name){
        super(name);
    }
    
    public String compareTo(Element e){
        Outcome o = new Outcome("Unknown", "Tie");
        if(e.getName() == "Scissors"){
            o = new Outcome("Scissors cut Paper", "Loss");
        }else if(e.getName() == "Lizard"){
            o = new Outcome("Lizard eats Paper", "Loss");
        }else if(e.getName() == "Rock"){
            o = new Outcome("Paper covers Rock", "Win");
        }else if(e.getName() == "Spock"){
            o = new Outcome("Paper disproves Spock", "Win");
        }else{
            o = new Outcome("Paper equals Paper", "Tie");
        }
        String result = o.getOutcome() + " -- " + o.getRound();
        return result;
    }
}
