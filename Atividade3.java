import java.util.Scanner;
public class Atividade3 {
    
        public static void main(String []args){
            double SB, desc = 0, SL = 0;
            Scanner mn = new Scanner (System.in);
            System.out.println("Qual o seu salário bruto? ");
            SB = mn.nextDouble();
            System.out.printf("Você digitou R$ %.2f \n ",SB);
            
            if(SB<1499.15)
                System.out.printf("Para essa faixa de salários, não há descontos, logo seu salário líquido será de R$ %.2f \n : ",SB);
                else { if(1499.15<=SB && SB<=2246.75){
                    SL = (SB -(SB*0.075)) - 112.43;    
                }  
                 if (2246.76<=SB && SB<=2995.70){
                    SL = (SB -(SB*0.15)) - 280.94;
                  }
                 if (2995.71<=SB && SB<=3743.19){
                    SL = (SB -(SB*0.225)) - 505.62;
                  }
                 else if (SB>3743.19){
                    SL = (SB -(SB*0.275)) - 692.78;
                  }
                  desc = SB - SL;
                  System.out.printf(" Seu salário líquido será R$ %.2f \n : ",SL);
                  System.out.printf("...e seu desconto será de R$ %.2f \n : ",desc);
                 
                 
            
             }
            
            }
}

   

