/*
 * Gabriel Hurtado.
 * May 8th, 2018
 * Squares, this is a program that is used to diplay the square (num^2)
 * of certain umbers (from 0 to 9) 
 */

package squares1;
import java.util.*;
/**
 *
 * @author gahur1962
 */
public class Squares1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        /** An Array list declaring used Integers. */  
         
        ArrayList <Integer> numbers= new ArrayList();
        Collections.addAll(numbers,0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        // For loop for the initial values, without printing the initial numbers. 
        for (int i : numbers){
           // System.out.println(i); Printing a line of the
           //initial numbers (not required) 
        }
        
        // Another for loop, used to print tyhe line of the 
        //initial numbers and their squares
         for (int i = 0; i < numbers.size(); i++) {
             System.out.println("Numbers: " + i + " Square: " + i * i); 
             
    }
    }
        
        
    
    
}
