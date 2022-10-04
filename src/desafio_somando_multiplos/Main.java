package desafio_somando_multiplos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int N = scan.nextInt();

        int soma = 0;
        int result = 0;
        int i = 0;


        while (result != N){
            result = A*i;
            i++;
            soma += result;
        }

        System.out.println(soma);

    }
}
