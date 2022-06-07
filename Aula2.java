package aula2;

import java.util.Scanner;

/** Criar um programa que calcule a média de 03 números inteiros*/

public class Aula2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /**ao invés de int pode adicionar double*/
        int num1, num2, num3;
        double media;
        
        /**Entrada do primeiro número*/
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        /**se adicionar double o nextInt deve ser nextDouble*/
        
        /**Entrada do segundo número*/
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        
        /**Entrada do terceiro número*/
        System.out.print("Digite o terceiro número: ");
        num3 = entrada.nextInt();
        
        /**Cálculo da média. nexDouble aceita números com vírgula*/
        media = (num1 + num2 + num3) / 3;
        
        System.out.println("O resultado da média é: " + media);
    }
    
}
