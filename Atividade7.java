
package atividade.pkg7;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        int l=0,c,a,b,soma=0;
        Scanner rawr = new Scanner (System.in);
        int tabela [][] = new int [4][4];
        int vetor [] = new int [4];
       
        while (l<4){
            c=0;
            while (c<4){
            System.out.println("Digite o elemento linha "+l+", coluna "+c+":");
            tabela [l][c] = rawr.nextInt ();
            c++;
            }
            l++;
        }
        
        for (a=0;a<4;a++){
            for (b=0;b<4;b++){
            vetor [a] = vetor[a] + tabela [a][b];
            }
        System.out.println("A soma da linha "+a+" é:"+vetor[a]);
        }
        
        for (a=0;a<4;a++){
        soma=soma+vetor[a];  
        }
        
        System.out.println("A soma da matriz é:"+soma);
    }    
}
