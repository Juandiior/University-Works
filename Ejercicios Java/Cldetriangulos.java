import java.util.Scanner;

public class Cldetriangulos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l1, l2, l3;
        System.out.println("Ingrese los lados del triangulo uno por uno");
        l1=sc.nextInt();
       
        if(l1==0){
            System.out.println("El valor es igual a 0, no se puede resolver");
        }
        l2=sc.nextInt();
         if(l2==0){
            System.out.println("El valor es igual a 0, no se puede resolver");
        }
        l3=sc.nextInt();
         if(l3==0){
            System.out.println("El valor es igual a 0, no se puede resolver");
        }

       

        if((l1==l2) && (l1==l3)){
            System.out.println("Es un triangulo equilatero");
        }

        if(l1==l2){
            System.out.println("El tirangulo es Isoseles");
        }

        if(l2==l3){
            System.out.println("El tirangulo es Isoseles");
        }

        if(l1==l3){
            System.out.println("El tirangulo es Isoseles");
        }

        if((l1!=l2) && (l1!=l3)){
            System.out.println("El tirangulo es escaleno");
        }

    } 
    
}
