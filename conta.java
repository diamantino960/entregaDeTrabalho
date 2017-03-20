package aula;

import java.util.Scanner;

public class conta {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double valorAssinatura = 23.32;
        System.out.println("Quantos minutos foram gastos em ligações locais?");
        double min = leitor.nextDouble();         
        double ligacoesLocais = (0.09*min);
        System.out.println("Quantos minutos foram gastos em ligações interurbanas?");
        double min1 = leitor.nextDouble();
        double ligacoesInterurb = (0.26*min);
        System.out.println("Quantos minutos foram gastos em ligaçoes internacionais?");
        double min2 = leitor.nextDouble();
        double ligacoesInternac = (0.86*min);
        System.out.println("O valor total de ligações locais é R$"+ligacoesLocais);
        System.out.println("O valor total de ligações interurbanas é R$"+ligacoesInterurb);
        System.out.println("O valor total de ligações internacionais é R$"+ligacoesInternac);
        System.out.println("O valor total é R$"+(valorAssinatura+ligacoesInternac+ligacoesInterurb+ligacoesLocais)+"(junto à assinatura)");
        
   
    }
    
}
    
    

