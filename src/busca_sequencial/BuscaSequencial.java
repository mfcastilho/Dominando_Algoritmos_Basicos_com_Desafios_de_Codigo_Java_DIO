package busca_sequencial;

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        System.out.println(buscaSequencial(elementos, X));

    }

    public static String buscaSequencial(int[] elementos, int X){
        for(var i = 0; i < elementos.length; i++){
            if(X == elementos[i]){
                return "Achei "+X+" na posicao "+i;
            }
        }
        return "Numero "+X+" nao encontrado!";
    }
    
}
