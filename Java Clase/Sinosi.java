public class Sinosi {
    public static void main(String[] args){
        int year = 2005;
        int mounth = 7;
        int day = 3;

        int ActYear = 2023;
        int ActMounth = 10;
        int ActDay = 18;

        int edad = ActYear - year;

        if(mounth>ActMounth){
            edad--;
        }
        else{
            if(mounth==ActMounth){
                if(day>ActDay){
                    edad--;
                }
            }
        }
        System.out.println("Su edad es "+edad);
    }
    
}
