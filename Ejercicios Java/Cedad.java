//Importamos las librerias
import java.util.Scanner;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

//Metodo de ejecusion del codigo
public class Cedad {
    public static void main(String[] args){
        //Definicion de variables
        int age, year, mounth, day, actyear, actmounth, actday;
        
        //Guardamos los valores de la fecha actual en variables para operarlos 
        Calendar cald = Calendar.getInstance();
        actyear = cald.get(Calendar.YEAR);
        actmounth = cald.get(Calendar.MONTH);
        actday = cald.get(Calendar.DAY_OF_MONTH);

        System.out.println(actyear);
        System.out.println(actmounth);
        System.out.println(actday);
        
        //Iniciamos el Scanner para la lectura de telcado
        Scanner sc = new Scanner(System.in);
       
        //Preguntamos al usuario sus datos y con el if verificamos si es valida o no
        System.out.println("Ingrese su año de nacimiento");
        year = sc.nextInt();
        if(year>actyear){
            System.out.println("La Fecha es incorrecta");
            return;
        }

        System.out.println("Ingrese su mes de nacimiento");
        mounth = sc.nextInt();
        if(mounth>12){
            System.out.println("La fecha es incorrecta");
            return;
        }

        System.out.println("El dia de nacimiento");
        day = sc.nextInt();
        if(day>31){
            System.out.println("La Fecha es incorrecta");
            return;
        }

        // Aqui hacemos la operacion para saber la edad de la persona
       age = actyear-year;

       //Aqui empezamos a validar si la edad de la persona es acorde con los meses o dias se le suma o resta un año
       if(mounth>actmounth){
        age=age-1;}
        
        if(mounth==actmounth){
            if(day>actday){
            age=age-1;
        }}


        //Aqui imprimimos la edad resultante
       System.out.println("Su edad es "+ age);
    }

}
