public class HolaMundo{
    public static void main(String[] args){
        String nombre ="Jhon Jairo";
        String apellido="Gomez";
        char Admiration = '!';
        System.out.println("Hola "+nombre+" "+apellido+Admiration);

        nombre="Camilo";
        apellido="Obando";
        String nombreCompleto=nombre.concat(apellido);
        System.out.println("Hola" +nombreCompleto+Admiration);


    }
}