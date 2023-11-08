public class ejemplo1 {
    public static void main(String[] args) {
        System.out.println("Numeros primos del 1 al 25:");

        for (int i = 2; i <= 25; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}





