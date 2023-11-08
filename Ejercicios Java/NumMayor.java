import java.util.Scanner;
public class NumMayor {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Ingrese el primer numero");
        num1=sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2=sc.nextInt();

        System.out.println("Ingrese el tercer numero");
        num3=sc.nextInt();

        if((num1>num2) && (num1>num3)){
            System.out.println("El primer numero es el mayor");
            return;
        }

        if(num2>num3){
            System.out.println("El segundo numero es el mayor");
        }
        else{
            System.out.println("El tercer numero es el mayor");
        }

    }
    
}
