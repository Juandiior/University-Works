import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){
        long maxnum, num1, num2, temp;
        num1=0;
        num2=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero maximo de la serie fibonacci");
        maxnum = sc.nextInt();
        for(int i = 1;num1 <= maxnum; i++){
            System.out.println(num1);
            temp=num1;
            num1=num2;
            num2=temp+num2;
         }

    }
    
}
