package desafio1;

import java.util.Scanner;

public class Fibonacci{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite o termo da Sequência de Fibonacci: ");
        int num = input.nextInt();

        System.out.println();

        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;

        System.out.println("-> " + primeiro);
        System.out.println("-> " + segundo);

        for(int i = 2; i <= num; i++){

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println("-> " + proximo);
        }
    }
}