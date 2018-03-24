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
public class Main {
    
    
    public static void main(String args[]){
        /*Element rock = new Rock("Rock");
        Element paper = new Paper("Paper");
        System.out.println(rock.compareTo(paper));
        System.out.println(paper.compareTo(rock));
        System.out.println(rock.compareTo(rock));*/
        
        Player p1 = new StupidBot("StupidBot");
        Player p2 = new RandomBot("RandomBot");
        Player p3 = new IterativeBot("IterativeBot");
        Player p4 = new LastPlayBot("LastPlayBot");
        Element p1move = p1.play();
        Element p2move = p2.play();
        Element p3move = p3.play();
        Element p4move = p4.play();
        System.out.println(p4move.compareTo(p1move));
        String result = p4move.compareTo(p1move);
        p4move = p4.play(result);
        System.out.println(p4move.compareTo(p2move));
        result = p4move.compareTo(p2move);
        p4move = p4.play(result);
        System.out.println(p4move.compareTo(p3move));
        result = p4move.compareTo(p3move);
        p4move = p4.play(result);
        
    }
}
