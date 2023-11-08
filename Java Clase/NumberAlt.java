import java.util.Random;
public class NumberAlt {
    public static void main(String[] args) {
        int sum=0;
        int[] number = new int[5];
         Random rand = new Random();
        for (int i=0;i<number.length;i++){
            number[i] = rand.nextInt(10);
            System.out.println(number[i]);
        }

        for(int i = 0; i<number.length;i++){
            sum+= number[i];
        }

        System.out.println("El promedio de los numeros aleatorios "+ sum/number.length);
    }
    
}
