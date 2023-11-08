import java.util.Scanner;

public class MultConSum {
    public static void main(String[] args){
        int multiplying, multiplier, cont, result;
        cont=0;
        result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el multiplicando");
        multiplying = sc.nextInt();
        System.out.println("Ingrese el multiplicador");
        multiplier = sc.nextInt();

        while(cont!=multiplier){
            result=result+multiplying;
            cont++;
                
        }
        System.out.println("El resultado " + result);
    }
    
}
