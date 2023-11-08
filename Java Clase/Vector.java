import java.util.*;

public class Vector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] vector0 = new String[3];
        double[] vector1 = new double[3];
       
        for(int i = 0 ;i < vector1.length; i++){
            System.out.println("Ingrese el nombre del estudiante " + (i+1));
            vector0[i] = sc.next();
            System.out.println("Ingrese la nota del estudiante " + (i+1));
            vector1[i] = sc.nextDouble();

        }

        for(int i = 0 ;i < vector1.length; i++){
            System.out.println("El estudiante " + vector0[i] + " tiene una nota de "+vector1[i]);
            
        }
    }
    
}
