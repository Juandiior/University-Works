// Codigo hecho por Juan Diego Orozco Meza - Ingenieria Informatica - Universidad de Caldas
public class Medidas {

    public static void main(String[] args) {

        // unidad de medida GB, MB, KB, B 
        String unit = "L";
        // cantidad de la medida seleccionada
        double amount = 1;

        double bytesResult = 0;

        switch (unit) {
            case "GB":
                bytesResult = amount * (1024 * 1024 * 1024);
                break;
            case "MB":
                bytesResult = amount * (1024 * 1024);
                break;
            case "KB":
                bytesResult = amount * 1024;
                break;
            case "B":
                bytesResult = amount;
                break;
            default:
                System.out.println("Unidad de medida no válida.");
                return;
        }

        System.out.println(amount + " " + unit + " son " + bytesResult + " bytes.");
    }
}