/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci305.javalab;

/**
 *
 * @author Conner McCloney
 */
public abstract class Element {
    private String name;
    
    public Element(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public abstract String compareTo(Element e);
    
    public static void main(String args[]){
        Element rock = new Rock("Rock");
        Element paper = new Paper("Paper");
        System.out.println(rock.compareTo(paper));
        System.out.println(paper.compareTo(rock));
        System.out.println(rock.compareTo(rock));
        
        Player p1 = new StupidBot("StupidBot");
        Player p2 = new RandomBot("RandomBot");
        Element p1move = p1.play();
        Element p2move = p2.play();
        System.out.println(p1move.compareTo(p2move));
    }
}
