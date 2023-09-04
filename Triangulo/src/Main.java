import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de iteraciones: ");

        try {
            int iteraciones = scanner.nextInt();
            scanner.close();

            if (iteraciones < 0) {
                System.out.println("El número de iteraciones debe ser un número positivo.");
            } else {
                dibujarTrianguloSierpinski(iteraciones);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese un número entero válido.");
        }
    }

    public static void dibujarTrianguloSierpinski(int iteraciones) {
        for (int i = 0; i < Math.pow(2, iteraciones); i++) {
            for (int j = 0; j < Math.pow(2, iteraciones) - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}