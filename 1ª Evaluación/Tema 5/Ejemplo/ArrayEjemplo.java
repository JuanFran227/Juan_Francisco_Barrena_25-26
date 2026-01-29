public class ArrayEjemplo{
    


    public static void ejemplo(){
        int[] valores = {1,2,3,4,5};
        
        System.out.println("For normal");
        //For normal
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }

        System.out.println("For-each");
        // For-each
        for(int numero : valores){
            System.out.println(numero);
        }
    }



    public static void main(String[] args) {
        ejemplo();
    }

}

