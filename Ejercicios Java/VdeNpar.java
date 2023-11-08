import java.util.Scanner;

public class VdeNpar{
    public static void main(String[] args){
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a evaluar");
        x=sc.nextInt();
        if (x % 2 == 0 ){
            System.out.println("Su numero es par");
        }
        else{ 
            System.out.println("Su numero es impar");
        }


    }



} 