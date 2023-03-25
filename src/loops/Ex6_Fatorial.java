package loops;

import java.util.Scanner;

public class Ex6_Fatorial {
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int multiplicacao = 1;

    System.out.println("Digite o número para cálculo de fatorial:");
    numero = scan.nextInt();

    for (int i = numero; i >= 1; i--){
        multiplicacao = multiplicacao*i;
    }
    System.out.println(numero + "! = " + multiplicacao);
}
}
