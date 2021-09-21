
package atividade08;

import java.util.Scanner;

public class Atividade08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner F = new Scanner (System.in);
        
        double altura, PesoIdeal;
        String sexo; 
        
        System.out.println ("Digite sua altura:");
        altura = sc.nextDouble();
        
        System.out.println("Digite seu sexo[M/F]:");
        sexo = F.nextLine();
        
        PesoIdeal = PesoIdeal (altura, sexo);
        System.out.println("O seu peso ideal é: " +PesoIdeal);
      

    }
    
    public static double PesoIdeal (double altura, String sexo){
        double PesoIdeal;
        
        if ("M".equals(sexo)){
            PesoIdeal = 72.7*altura-58;
        }
        else {
            PesoIdeal = 62.1*altura-44.7;
        }
        
        return PesoIdeal;
    }
}
