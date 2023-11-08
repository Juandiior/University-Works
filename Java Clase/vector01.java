public class vector01 {
    public static void main(String[] args){
        int[] number = new int[5];
        double[] valores = {1.1,1.2,2.3,9.0};
        String[] name = {"Jose","Manuel","Pacho","Habibi"};
        for (int i=0;i<valores.length;i++){
            System.out.println("Valor "+(i+1)+": "+valores[i]);
            System.out.println("Nombre "+(i+1)+": "+name[i]);
        }
    }
}
