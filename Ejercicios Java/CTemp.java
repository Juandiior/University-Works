//Importamos la libreria de scanner para ultilizar el teclado
import java.util.Scanner;

public class CTemp {
    // El public static funciona como metodo de inicio, sin este el codigo con se ejecuta
    public static void main(String[] args){
        //Definimos la variables a utilizar como doble para almacenar numeros decimales
        double temp, ctemp;
        //Iniciamos el scanner para ingresar los datos via teclado
        Scanner sc = new Scanner(System.in);
        //Le pedimos la variable al usuario
        System.out.println("Ingrese la temperatura en grados celsius");
        //Almacenamos la variable ingresa por el teclado
        temp=sc.nextInt();
        //con la variable ctemp almacenamos el resultado de la operacion
        ctemp=(temp*(1.8)+32);
        //Imprimimos los resultados de la conrversion
        System.out.println("La temperatura en Fahrenheit es " + ctemp);

    }

    
}
