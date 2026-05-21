import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        System.out.println("Ingrese 12 números:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Número [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = entrada.nextInt();
            }
        }

        boolean existe = false;

        for (int fila = 0; fila < 3; fila++) {

            int menorFila = matriz[fila][0];
            int columnaMenor = 0;

            for (int columna = 1; columna < 4; columna++) {
                if (matriz[fila][columna] < menorFila) {
                    menorFila = matriz[fila][columna];
                    columnaMenor = columna;
                }
            }

            boolean puntoSilla = true;

            for (int i = 0; i < 3; i++) {
                if (matriz[i][columnaMenor] > menorFila) {
                    puntoSilla = false;
                    break;
                }
            }

            if (puntoSilla) {
                System.out.println("\nExiste punto de silla: " + menorFila);
                existe = true;
            }
        }

        if (!existe) {
            System.out.println("\nNo existe punto de silla.");
        }
    }
}