import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Ingrese 9 números:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print("Número [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz Transpuesta:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz[columna][fila] + "\t");
            }
            System.out.println();
        }
    }
}git
