public class NumeroDivisible {
    public static void main(String[] Args){
        int Num1=1;
        String Mensaje = "";

        if((Num1 % 3 == 0) && (Num1 % 5 == 0)){
            Mensaje ="Divisible por ambos";
        }
        if(Num1 % 3 == 0){
            Mensaje ="Es divicible solo por 3";
           
        }
        if(Num1 % 5 == 0){
            Mensaje = "Es divisible solo por 5";
          
        }
        else{
            Mensaje = "Error";
        }

        System.out.println(Mensaje);
    }
    
}
