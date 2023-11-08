public class example {
    public static void main(String[] args) {
        boolean continuar = true;
        do {
            try {
                int[] myNumbers = {1, 2, 3};
                System.out.println(myNumbers[10]);
                continuar = false; // Si no hay error, salimos del bucle
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("El índice del array está fuera de los límites. Reiniciando...");
                // Si hay un error, el bucle se repite
            } finally {
                System.out.println("Siempre se ejecuta el bloque 'finally', independientemente de si se produce una excepción o no.");
            }
        } while (continuar);
    }
}