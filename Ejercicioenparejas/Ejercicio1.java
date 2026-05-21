import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] frutas = new String[10];

        System.out.println("Ingrese 10 frutas:");

        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Fruta " + (i + 1) + ": ");
            frutas[i] = entrada.nextLine();
        }

        System.out.println("\nFrutas en orden inverso:");

        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }
    }
}