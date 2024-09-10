package desafio2;

import java.util.Scanner;

public class VerificadorString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(">> Entre com alguma palavra ou frase: ");
        String entradaString = input.nextLine();

        char ocorrencia = 'a';
        int cont = 0;

        for(int i = 0; i < entradaString.length(); i++){

            if(entradaString.charAt(i) == ocorrencia){
                cont++;
            }
        }

        System.out.println(">> Quantidade de ocorrências da letra 'a' é: " + cont + "\n\n");

    }

}
