package fizzbuzz;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();


        if(N%3 == 0 && N%5 == 0){
            System.out.println("FizzBuzz");
        }else if (N%3 == 0){
            System.out.println("Fizz");
        }else if (N%5 == 0){
            System.out.println("Buzz");
        }
    }
}
