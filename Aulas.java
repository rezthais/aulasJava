package aulas;

import java.util.Scanner;

public class Aulas {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        int soma;
        
        System.out.print("Digite o primeiro numero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Digite o primeiro numero: ");
        num2 = entrada.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("O resultado da soma é: " + soma);
        
    }
    
}
