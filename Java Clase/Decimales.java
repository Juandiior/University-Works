public class Decimales {
    public static void main(String[] args){
        double peso = 68.0;
        double altura = 1.70;

        double IndiceDeMasaCorporal = peso/Math.pow(altura, 2);
        
        System.out.println("Su IMC "+IndiceDeMasaCorporal);
    }
    
}
