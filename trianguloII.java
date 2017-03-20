package aula;

import java.util.Scanner;

public class trianguloII {
    
    public static void main(String[] args) {
         Scanner leitor = new Scanner (System.in); 

          System.out.println("Qual é o valor do cateto I");

       double cateto1 = leitor.nextDouble();   

          System.out.println("Qual é o valor do cateto II"); 

       double cateto2 = leitor.nextDouble();   

       double hipotenusa = Math.sqrt(cateto1*cateto1+cateto2*cateto2); 

          System.out.println("O perímetro é "+ (cateto1+cateto2+hipotenusa));
    }
}
