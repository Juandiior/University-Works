import java.util.Scanner;

public class PromStudents {
    public static void main(String[] args) {
        String[] students = new String[3];
        Scanner sc = new Scanner(System.in);
        double[] notes = new double[3];
        double[] promedio = new double[3];
        double prom = 0;
        
        for(int i=0;i < students.length; i++){
            System.out.println("Ingrese el nombre del estudiante "+ (i+1));
            students[i] = sc.next();
            
            for(int x = 0; x < notes.length ; x++){
                prom=0;
                System.out.println("Ingrese las notas del estudiante " +students[i]);
                notes[x] = sc.nextDouble();
                prom+=notes[x];
            }
            for(int x=0;x< promedio.length;x++){
                promedio[x]=prom/notes.length;
            }
            System.out.println("El promedio de las notas del estudiante " + students[i] + " Es " + prom);
            

        }

    }
    
}
