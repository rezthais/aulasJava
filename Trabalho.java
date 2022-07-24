package com.mycompany.trabalho;

import java.util.Scanner;

public class Trabalho {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        String nome;
        double nota1, nota2, nota3;
        double media;
        int faltas;

        /**Inserindo o nome*/
        System.out.print("Informe o nome do(a) aluno(a): ");
        nome = ler.nextLine();

        /**Entrada da primeira nota */
        System.out.print("Digite a primeira nota: ");
        nota1 = ler.nextDouble();

        /**Estrutura de repetiç?o para gerar nota inválida de acordo com 
         * a necessidade*/
        if ((nota1 > 10) || (nota1 <= 0)) {
                    for (int o = 0; (nota1 > 10) || (nota1 <= 0); o++) {
                        System.out.println("NOTA INVÁLIDA. Digite uma nota válida:"
                        );
                        nota1 = ler.nextDouble();
                    }
        }

        /**Entrada da segunda nota */
        System.out.print("Digite a segunda nota: ");
        nota2 = ler.nextDouble();

        /**Estrutura de repetiç?o para gerar nota inválida de acordo com 
         * a necessidade*/
        if ((nota2 > 10) || (nota2 <= 0)) {
                    for (int o = 0; (nota2 > 10) || (nota2 <= 0); o++) {
                        System.out.println("NOTA INVÁLIDA. Digite uma nota válida:"
                        );
                        nota2 = ler.nextDouble();
                    }
        }

        /**Entrada da terceira nota: */
        System.out.print("Digite a terceira nota: ");
        nota3 = ler.nextDouble();

        /**Estrutura de repetiç?o para gerar nota inválida de acordo com 
         * a necessidade*/
        if ((nota3 > 10) || (nota3 <= 0)) {
                    for (int o = 0; (nota3 > 10) || (nota3 <= 0); o++) {
                        System.out.println("NOTA INVÁLIDA. Digite uma nota válida:"
                        );
                        nota3 = ler.nextDouble();
                    }
        }

        /**Necessário colocar quantidade de faltas, pois acima de cinco será 
         * reprovado*/
        System.out.print("Digite a quantidade de faltas do(a) aluno(a): ");
        faltas = ler.nextInt();

        /**A nota da média será a soma dos três módulos*/
        media = nota1 + nota2 + nota3;
    
        /**Estrutura de definiç?o da aprovaç?o, prova final e reprovaç?o*/       
        if ((faltas > 5)||(media > 18)) {
            System.out.println("O(A) aluno(a) " + nome + " tem " + faltas + 
                    " faltas e obteve média "  + media + ". Está reprovado(a)!");
        } else {
            if ((media >= 15)&&(media <= 17)){
            System.out.println("O(A) aluno(a) " + nome + " tem " + faltas + 
                    " faltas e obteve média "  + media + ". Está de recuperaç?o!");
        } else {
                System.out.println("O(A) aluno(a) " + nome + " tem " + faltas + 
                    " faltas e obteve média "  + media + ". Está aprovado(a)!");
        }        
        }  
        
    }
}
