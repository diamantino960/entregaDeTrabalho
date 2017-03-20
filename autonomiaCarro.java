package aula;

import java.util.Scanner;

public class autonomiaCarro {
    public static void main(String[] args) {
        
    
    Scanner leitor = new Scanner (System.in);

              double litrosConsumo;

              double km ;

          System.out.println("Quantos km seu carro percorreu?");

               km = leitor.nextDouble();

          System.out.println("Quantos litros foram necessários?");

               litrosConsumo = leitor.nextDouble();

          System.out.println("Seu carro faz "+ (km/litrosConsumo) +"km por litro");
    
}
}