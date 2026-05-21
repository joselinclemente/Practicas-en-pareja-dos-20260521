import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[12];
        int suma = 0;
        double promedio;

        System.out.println("Ingrese 12 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            suma += numeros[i];
        }

        promedio = (double) suma / numeros.length;

        System.out.println("\nEl promedio es: " + promedio);
    }
}