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
}
