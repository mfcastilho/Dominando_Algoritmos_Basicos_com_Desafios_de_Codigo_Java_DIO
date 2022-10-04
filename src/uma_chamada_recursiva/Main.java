package uma_chamada_recursiva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int soma = 0;

        for (var i = N; i > 0; i--){

            soma += N;
            N = N - 1;
//
        }

        System.out.println(soma);
    }
}
