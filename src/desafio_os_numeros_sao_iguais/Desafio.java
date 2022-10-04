package desafio_os_numeros_sao_iguais;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a==b){
            System.out.println("Sao iguais!");
        }else if(a != b){
            System.out.println("Nao sao iguais!");
        }
    }
}
