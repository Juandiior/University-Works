import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejemtry {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner (System.in);
        
        try{
            System.out.println("Ingrese su edad");
            age = sc.nextInt();
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
        
    }
    
    
}
