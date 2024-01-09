import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);
        char desejaContinuar = 'S'; //char nao usamos ASpas duplas.

        while (desejaContinuar == 'S' || desejaContinuar == 's' ) {
            System.out.println("Digite um numero.");
            int numero = leitorScanner.nextInt();
            if (numero == 0){
                System.out.println("o numero é zero.");
            }else{
                if (numero > 0){
                    System.out.println("o numero é maior do que zero.");
                }else {
                    System.out.println("o numero é menor do zero.");
                }
            }
            System.out.println("Deseja continuar ? S- Sim / N - Não");
            desejaContinuar = leitorScanner.next().charAt(0); //o leitor ira ler uma palavra,ira pegar a primeira letra
        }
    }

}
