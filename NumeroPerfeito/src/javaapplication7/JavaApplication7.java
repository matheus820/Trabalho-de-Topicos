package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void numero_Perfeito() {

        Scanner cap = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = cap.nextInt();
        int calculo = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                calculo = calculo + i;
            }
        }
        if (calculo == numero) {
            System.out.println("O numero digitado é perfito");

        } else {
            System.out.println("O numero digitado não é perfeito");
        }
    }

    public static void main(String[] args) {
        numero_Perfeito();
    }

}
