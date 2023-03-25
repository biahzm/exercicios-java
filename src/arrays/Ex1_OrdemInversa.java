package arrays;

public class Ex1_OrdemInversa {
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
    public static void main(String[] args) {

        int [] vetor = {5, -1, 15, 50, 8, 4};
        // a primeira posição é 0. Assim existem 5 posições e 6 números dentro desse array
        // a ordem colocada no array é a ordem que ele fica - indicar quantidade de posições antes.
        // um array é um objeto!

        int contador = 0;
        System.out.print("Vetor: ");
        while (contador < (vetor.length)){
        // leight é a propriedade que indica o tamanho do vetor -> quantos elementos cabem no vetor
            System.out.print(vetor[contador] + " ");
                contador++;
        }
        System.out.print("\nVetor inverso: ");
        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

}
}
