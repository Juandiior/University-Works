import java.util.Scanner;
public class Regresiva {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Ingrese el inicio de la cuenta regresiva");
        x = sc.nextInt();
        
        while(x!=0){
            System.out.println("Faltan "  + x);
            x--;
                
        }
    }
    
}
