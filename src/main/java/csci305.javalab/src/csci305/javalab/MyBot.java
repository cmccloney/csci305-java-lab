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
public class MyBot extends Player{ //tracks number of wins for each
    private int[] wins = {0,0,0,0,0}; //choice, and plays choice with
                                    //highest number of wins
    public MyBot(String name){
        super(name);
    }
    
    public Element play(){
        Element e = new Rock("Rock");
        return e;
    }
    
    public Element play(String result){
        String[] str = result.split("\\s+");
        String lastMove = str[0];
        Element e = new Rock("Blank");
        switch(lastMove){
            case "Rock":
                wins[0]++;
                break;
            case "Paper":
                wins[1]++;
                break;
            case "Scissors":
                wins[2]++;
                break;
            case "Lizard":
                wins[3]++;
                break;
            case "Spock":
                wins[4]++;
                break;
        }
        int bestChoice = 0;
        int numWins = 0;
        for(int i = 0; i < 5; i++){
            if(wins[i] >= numWins){
                bestChoice = i;
                numWins = wins[i];
            }
        }
        switch(bestChoice){
            case 0:
                e = new Rock("Rock");
                break;
            case 1:
                e = new Paper("Paper");
                break;
            case 2:
                e = new Scissors("Scissors");
                break;
            case 3:
                e = new Lizard("Lizard");
                break;
            case 4:
                e = new Spock("Spock");
                break;
        }
        return e;
    }
}
