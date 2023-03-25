package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumero;
        int numero;
        int pares = 0, impares = 0;
        int contador = 0;


        System.out.println("Quantos números deseja digitar? R: ");
        quantidadeNumero = scan.nextInt();

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) pares++;
            else impares++;

            contador++;
        } while (contador < quantidadeNumero);

        System.out.println("O número de pares é " + pares);
        System.out.println("O número de impares é " + impares);
    }
}
