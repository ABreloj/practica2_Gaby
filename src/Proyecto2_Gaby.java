import java.util.Scanner;

public class Proyecto2_Gaby {

    private static int practica2(int x, int y) {
        while (y != 0) {
            int z = y;
            y = x % y;
            x = z;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y, z;

        System.out.println("Buscar el MCD de dos números enteros");

        System.out.println("Dime el valor de x (Que sea un numero entero por favor)");
        x = scanner.nextInt();

        System.out.println("Dime el valor de y (Que sea un numero entero y menor a x por favor)");
        y = scanner.nextInt();

        z = practica2(x, y);

        System.out.println("El MCD es: " + z);
    }
}