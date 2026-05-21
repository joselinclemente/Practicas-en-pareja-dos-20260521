import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[][] articulos = new String[3][3];

        System.out.println("Ingrese 9 artículos:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print("Artículo [" + fila + "][" + columna + "]: ");
                articulos[fila][columna] = entrada.nextLine();
            }
        }

        System.out.println("\nMatriz con filas invertidas:");

        for (int fila = 2; fila >= 0; fila--) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(articulos[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}