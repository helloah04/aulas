/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg4;

/**
 *
 * @author gabriel.bitencourt
 */
import java.util.Random;

public class Atividade4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rawr = new Random ();
      
        int Bilhete1, Bilhete2, Bilhete3;
        
        Bilhete1= rawr.nextInt(100)+1;
 
        System.out.println("O primeiro Bilhete sorteado é: " +Bilhete1);
 
        do {
     
            Bilhete2= rawr.nextInt(100)+1;
     
        } while(Bilhete1==Bilhete2);
 
        System.out.println("O segundo Bilhete sorteado é: " +Bilhete2);
 
        do {
    
            Bilhete3= rawr.nextInt(100)+1;
    
        } while (Bilhete1==Bilhete3 || Bilhete2==Bilhete3);

        System.out.println("O terceiro bilhete sorteado é: " +Bilhete3);
   
            }
}
