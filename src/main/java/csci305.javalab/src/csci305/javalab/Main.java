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
public class Main {
    
    
    public static void main(String args[]){
        /*Element rock = new Rock("Rock");
        Element paper = new Paper("Paper");
        System.out.println(rock.compareTo(paper));
        System.out.println(paper.compareTo(rock));
        System.out.println(rock.compareTo(rock));
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
        p4move = p4.play(result);*/
        
        System.out.println("Welcome to Rock, Paper, Scissors, "
                + "Lizard, Spock, implemented by Conner McCloney");
        System.out.println();
        System.out.println("Please choose two players:");
        System.out.println("   (1) Human");
        System.out.println("   (2) StupidBot");
        System.out.println("   (3) RandomBot");
        System.out.println("   (4) IterativeBot");
        System.out.println("   (5) LastPlayBot");
        System.out.println("   (6) MyBot");
        System.out.println();
        System.out.print("Select player 1: ");
        Scanner s = new Scanner(System.in);
        int temp1 = s.nextInt();
        System.out.print("Select player 2: ");
        int temp2 = s.nextInt();
        System.out.println();
        Player p1 = player(temp1);
        Player p2 = player(temp2);
        System.out.println(p1.getName() + " vs " + p2.getName() + ". Go!");
        System.out.println();
        int p1wins = 0;
        int p2wins = 0;
        Element p1move;
        Element p2move;
        String result = "";
        for(int i = 1; i < 6; i++){
            System.out.println("Round " + i + ":");
            if(p2.getName().equals("LastPlayBot")){
                if(i > 1){
                    p1move = p2.play(result);
                }else{
                    p1move = p2.play();
                }
                p2move = p1.play();
                System.out.println("  Player 1 chose " + p2move.getName());
                System.out.println("  Player 2 chose " + p1move.getName());
            }else{
                if(i > 1 && p1.getName().equals("LastPlayBot")){
                    p1move = p1.play(result);
                }else{
                    p1move = p1.play();
                }
                System.out.println("  Player 1 chose " + p1move.getName());
                p2move = p2.play();
                System.out.println("  Player 2 chose " + p2move.getName());
            }
            result = p1move.compareTo(p2move);
            String[] str = result.split("\\s+");
            System.out.println("  " + str[0] + " " + str[1] + " " + str[2]);
            if(str[4].equals("Win")){
                if(p2.getName().equals("LastPlayBot")){
                    System.out.println("  Player 2 won the round");
                    p2wins++;
                }else{
                    System.out.println("  Player 1 won the round");
                    p1wins++;
                }
                System.out.println();
            }else if(str[4].equals("Loss")){
                if(p2.getName().equals("LastPlayBot")){
                    System.out.println("  Player 1 won the round");
                    p1wins++;
                }else{
                    System.out.println("  Player 2 won the round");
                    p2wins++;
                }
                System.out.println();
            }else{
                System.out.println("  Round was a tie");
                System.out.println();
            }
        }
        System.out.println("The score is " + p1wins + " to " + p2wins + ".");
        if(p1wins > p2wins){
            System.out.println("Player 1 won the game");
        }else if(p1wins < p2wins){
            System.out.println("Player 2 won the game");
        }else{
            System.out.println("Game was a draw");
        }
    }
    
    public static Player player(int choice){
        Player e = new Human("Blank");
        switch(choice){
            case 1:
                e = new Human("Human");
                break;
            case 2:
                e = new StupidBot("StupidBot");
                break;
            case 3:
                e = new RandomBot("RandomBot");
                break;
            case 4:
                e = new IterativeBot("IterativeBot");
                break;
            case 5:
                e = new LastPlayBot("LastPlayBot");
                break;
            case 6:
                e = new MyBot("MyBot");
                break;
        }
        return e;
    }
}
