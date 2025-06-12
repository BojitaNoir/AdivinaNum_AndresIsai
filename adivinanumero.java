import java.util.Random;
import java.util.Scanner;
public class adivinanumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean salir = false;

        while (!salir) {
            System.out.println("=== Menú ===");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int numeroSecreto = random.nextInt(100) + 1;
                    int intentos = 0;
                    int guess = 0;
                    System.out.println("He pensado un número entre 1 y 100. ¡Adivínalo!");
                    do {
                        System.out.print("Introduce tu número: ");
                        guess = scanner.nextInt();
                        intentos++;
                        if (guess < numeroSecreto) {
                            System.out.println("El número secreto es mayor.");
                        } else if (guess > numeroSecreto) {
                            System.out.println("El número secreto es menor.");
                        } else {
                            System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                        }
                    } while (guess != numeroSecreto);
                    break;
                case 2:
                    salir = true;
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;
                case 3:
                    System.out.println("Porque apretaste esto bro jijijijij...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige 1 o 2.");
                    break;
            }
        }
        scanner.close();
    }
}