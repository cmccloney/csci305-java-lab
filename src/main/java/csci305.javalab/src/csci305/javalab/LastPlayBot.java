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
public class LastPlayBot extends Player{
    
    public LastPlayBot(String name){
        super(name);
    }
    
    public Element play(){
        Element e = new Rock("Rock");
        return e;
    }
    
    public Element play(String result){ //assuming LPB.compareTo...
        String[] str = result.split("\\s+");
        String lastMove;
        if(str[4].equals("Win")){
            lastMove = str[2];
        }else{
            lastMove = str[0];
        }
        Element e = new Rock("Blank");
        switch(lastMove){
            case "Rock":
                e = new Rock("Rock");
                break;
            case "Paper":
                e = new Paper("Paper");
                break;
            case "Scissors":
                e = new Scissors("Scissors");
                break;
            case "Lizard":
                e = new Lizard("Lizard");
                break;
            case "Spock":
                e = new Spock("Spock");
                break;
        }
        return e;
    }
}
