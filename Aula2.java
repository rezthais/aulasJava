package aula2;

import java.util.Scanner;

/** Criar um programa que calcule a m�dia de 03 n�meros inteiros*/

public class Aula2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /**ao inv�s de int pode adicionar double*/
        int num1, num2, num3;
        double media;
        
        /**Entrada do primeiro n�mero*/
        System.out.print("Digite o primeiro n�mero: ");
        num1 = entrada.nextInt();
        /**se adicionar double o nextInt deve ser nextDouble*/
        
        /**Entrada do segundo n�mero*/
        System.out.print("Digite o segundo n�mero: ");
        num2 = entrada.nextInt();
        
        /**Entrada do terceiro n�mero*/
        System.out.print("Digite o terceiro n�mero: ");
        num3 = entrada.nextInt();
        
        /**C�lculo da m�dia. nexDouble aceita n�meros com v�rgula*/
        media = (num1 + num2 + num3) / 3;
        
        System.out.println("O resultado da m�dia �: " + media);
    }
    
}
