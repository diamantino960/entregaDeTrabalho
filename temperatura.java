package aula;

import java.util.Scanner;
public class temperatura{public static void main(String[] args) { 
    
    Scanner leitor = new Scanner(System.in); 
    double grausC;   
    double grausF;        System.out.println("Qual é a temperatura em ºF?");
    grausF = leitor.nextDouble();
    grausC = (5/9.0*(grausF - 32));
    System.out.println("A temperatura em ºC é "+grausC); 
}
    
}
