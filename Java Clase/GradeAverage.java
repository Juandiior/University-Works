import java.util.*;
public class GradeAverage {
    public static void main(String[] args) {
        
        // Definimos el Booleano continuar para guardar el valor por si falla el codigo
        boolean continuar;
        
        // Con este Do-While reinciamos el codigo, cosa la cual si falla empieze de nuevo desde el principio
        do{
            continuar = false;
            try {
                
                //Dentro del try definimos los valores para que en el siguiente intento se reinicien todos los valores almacenados

                Scanner scanner = new Scanner(System.in);
                double[] notes = new double[3];
                String[] names = new String[3];
                double[] finalnote = new double[3];

                //Empezamos con un for para ingresar el nombre de los estudiantes 
                for(int cont = 0; cont < names.length ; cont++){
                
                double prom = 0;
                double sum = 0;
                System.out.println("Ingrese el nombre del estudiante numero "+ (cont+1));
                names[cont] = scanner.next();

                //Con el segundo for ingresamos todas las notas del estudiante 
                for(int cont1 =0; cont1 <notes.length ; cont1++){

                    System.out.println("Ingrese la nota " + (cont1+1) + " del estudiante " +names[cont]);
                    notes[cont1]=scanner.nextDouble();
                    sum = sum+notes[cont1];
                            
                }

                //Aqui sacamos el promedio de las notas y las guardamos en un nuevo vector
                prom=sum/notes.length;
                finalnote[cont] = prom;

              }
              //Con este for imprimimos el nombre del estudiante y el promedio de sus notas
              for(int cont=0;cont<names.length;cont++){
                System.out.println("El promedio de notas del estudiante "+ names[cont] +" es " + finalnote[cont]);
              }
              scanner.close();
            }
             
            //Con el catch notificamos la falla del codigo y con el Boolean "continuar = true" hacemos que el codigo se reinicie con el while que esta debajo de este
            catch (Exception e) {
               System.out.println("-------------- Error, por favor intente de nuevo ------------");
               continuar = true;
            }


        } while(continuar);
    }
    
}
