package arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] consoantes = new String[6];
    int quantidadeConsoantes = 0;
    int count = 0;

    do {
        System.out.print("Digite uma letra: ");
        String letra = scan.next();

        if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i")) |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u")){
            consoantes[count] = letra;
            quantidadeConsoantes++;
        }
        count++;
    } while (count < consoantes.length);

    for (String consoante : consoantes) { //for-each para navegar dentro dos vetores e execute uma ação. Não dá acesso a posição específica dentro do array.
        if (consoante != null)
            System.out.print(consoante + " ");
    }
    System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
}
}
