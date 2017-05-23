/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myworld;

import java.util.Scanner;

/**
 *
 * @author 011165
 */
public class MyWorld {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
        
int uitkomst = faculteitFunctie(0);
        String begeleidendeTekst = "de uitkomst van 5! = ";
        
        printFunctie(begeleidendeTekst, uitkomst);
        
        
    }
   
    
    public static int faculteitFunctie(int getal1){
        
        if (getal1 >1 ){
            return 5;
        } 
        if (getal1 <1){
        return -1;
    }
        return 1;
    }
    
    
    public static void printFunctie(String tekst,int getal){
        System.out.println(tekst+getal);
    }
    
    
}



        
    
    
    
    

    
