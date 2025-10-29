import java.util.Scanner;

public class pruebabucles {
    Scanner sc = new Scanner(System.in);

    public static void ejercicio1(){
        //while
        int contWhile = 1;
        while(contWhile<=100){
            System.out.println(contWhile);
            contWhile++;
        } 
        
        //for
        for(int contFor=1;contFor<=100;contFor++){
            System.out.println(contFor);
        }

        //do while
        int contdowhile = 1;
        do{
            System.out.println(contWhile);
            contWhile++;
        }while(contdowhile<=100);
    }





    public static void main(String[] args){
        ejercicio1();
    }



}
