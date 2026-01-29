public class Array2{

    /*1) Transposición y rotación de matriz
    Objetivo: Implementar funciones que roten una matriz int[][] 90° y que la transpongan.
    Entrada: int[][] A (rectangular).
    Salida: nueva int[][] rotada / traspuesta.*/
    public static void ejercicio1(){
        int[][] arraynormal = {
            {0, 7},
            {2, 9},
            {5, 1},
            {6, 3}
        };

        //Matriz rotada la definimos
        int[][] arrayrotada = new int[arraynormal[0].length][arraynormal.length];
        
        //Rellenarla
        for(int i = 0; i < arraynormal.length; i++){
            for(int j = 0; j < arraynormal[i].length; j++){
                arrayrotada[j][arraynormal.length - i - 1] = arraynormal[i][j];// Este código gira la matriz 90 grados en sentido las agujas del reloj
                //arrayrotada[arraynormal.length - j - 1][i] = arraynormal[i][j];   //Código que gira al sentido contrario de las agujas del reloj 90 grados
                //arrayrotada[arraynormal.length - j - 1][arraynormal.length - i - 1] = arraynormal[i][j];    //Girar 180 grados
            }
        }

        //Mostrarla
        for(int i = 0; i < arrayrotada.length; i++){
            for(int j = 0; j < arrayrotada[i].length; j++){
                System.out.print(arrayrotada[i][j] + " ");
            }
            System.out.println();
        }

    }


    /*2) Buscar submatriz (pattern) en matriz mayor
    Objetivo: Dado int[][] big y int[][] pattern, devolver todas las coordenadas donde pattern aparece
    exactamente.
    Entrada: big H×W, pattern h×w.
    Salida: lista de (row,col) de coincidencias */
    public static void ejercicio2(){
        
    }


    public static void main(String args[]){
        ejercicio1();
        ejercicio2();
    }
}