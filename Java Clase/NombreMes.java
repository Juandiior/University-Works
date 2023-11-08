// Codigo hecho por Juan Diego Orozco Meza - Ingenieria Informatica - Universidad de Caldas
public class NombreMes {

    public static void main (String[] Args){
        int Mounth = 12;
        String NameMounth = "Diciembre";
        int Days = 31;

        switch (Mounth) {
            case 1:
                 NameMounth = "Enero";
                Days = 31;
                break;
            case 2:
                NameMounth = "Febrero";
                 Days = 28;
                break;
            case 3:
                NameMounth = "Marzo";
                 Days = 31;
                break;
            case 4:
                NameMounth = "Abril";
                 Days = 30;
                break;
            case 5:
                NameMounth = "Mayo";
                 Days = 31;
                break;
            case 6:
                NameMounth = "Junio";
                 Days = 30;
                break;    
            case 7:
                NameMounth = "Julio";
                 Days = 31;
                break;
            case 8:
                NameMounth = "Agosto";
                 Days = 31;
                break;
            case 9:
                NameMounth = "Septiembre";
                 Days = 30;
                break;
            case 10:
                NameMounth = "Octubre";
                 Days = 31;
                break;
            case 11:
                NameMounth = "Noviembre";
                 Days = 30;
                break;

            default:
                break;
        }
        System.out.println("El Mounth es "+ NameMounth +" y tiene "+Days+" dias");
    }
    
}
