// Codigo hecho por Juan Diego Orozco Meza - Ingenieria Informatica - Universidad de Caldas
public class Festivos {

    public static void main(String[] args) {
        
        int NumberMounth = 14;
        String MounthName = "";
        int festivos = 0;

        if (NumberMounth == 1) {
            MounthName = "Enero";
            festivos = 1; 
        } else if (NumberMounth == 2) {
            MounthName = "Febrero";
            festivos = 0; 
        } else if (NumberMounth == 3) {
            MounthName = "Marzo";
            festivos = 0; 
        } else if (NumberMounth == 4) {
            MounthName = "Abril";
            festivos = 1; 
        } else if (NumberMounth == 5) {
            MounthName = "Mayo";
            festivos = 2; 
        } else if (NumberMounth == 6) {
            MounthName = "Junio";
            festivos = 1; 
        } else if (NumberMounth == 7) {
            MounthName = "Julio";
            festivos = 0; 
        } else if (NumberMounth == 8) {
            MounthName = "Agosto";
            festivos = 1; 
        } else if (NumberMounth == 9) {
            MounthName = "Septiembre";
            festivos = 0; 
        } else if (NumberMounth == 10) {
            MounthName = "Octubre";
            festivos = 2; 
        } else if (NumberMounth == 11) {
            MounthName = "Noviembre";
            festivos = 1; 
        } else if (NumberMounth == 12) {
            MounthName = "Diciembre";
            festivos = 2; 
        } else {
            System.out.println("Numero no valido");
            return;
        }

        System.out.println("El mes de " + MounthName + " tiene " + festivos + " festivos.");
    }
}



