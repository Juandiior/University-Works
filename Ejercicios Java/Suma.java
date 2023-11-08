import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        int num1, num2, suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        num2 = sc.nextInt();
        suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }
}
