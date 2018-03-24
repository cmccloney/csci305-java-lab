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
public class Outcome {
    private String outcome;
    private String round;
    
    public Outcome(String o, String r){
        outcome = o;
        round = r;
    }
    
    public String getOutcome(){
        return outcome;
    }
    
    public String getRound(){
        return round;
    }
}
