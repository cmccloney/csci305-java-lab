/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci305.javalab;

import java.util.Scanner;

/**
 *
 * @author cmccl_000
 */
public class Human extends Player{
    
    public Human(String name){
        super(name);
    }
    
    public Element play(){
        Element e = new Rock("Blank");
        int n = 0;
        boolean valid = false;
        printChoice();
        while(valid){
            System.out.print("Enter your move: ");
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            System.out.println();
            if(n >= 1 && n <= 5){
                valid = true;
            }else{
                System.out.println("Invalid move. Please try again.");
            }
        }
        switch(n){
            case 1:
                e = new Rock("Rock");
                break;
            case 2:
                e = new Paper("Paper");
                break;
            case 3:
                e = new Scissors("Scissors");
                break;
            case 4:
                e = new Lizard("Lizard");
                break;
            case 5:
                e = new Spock("Spock");
                break;
        }
        return e;
    }
    
    public void printChoice(){
        System.out.println("(1) : Rock");
        System.out.println("(2) : Paper");
        System.out.println("(3) : Scissors");
        System.out.println("(4) : Lizard");
        System.out.println("(5) : Spock");
    }
    
    public Element play(String s){
        Element e = new Rock("Don't be here");
        return e;
    }
}
