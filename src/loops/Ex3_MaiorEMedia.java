package loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
 /*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;

        int contador = 0;


        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (maior < numero) maior = numero;
            contador = contador + 1;
        } while (contador < 5);

        System.out.println("O maior número é " + maior);
        System.out.println("A média entre os valores é " + (soma/5));
    }
}
