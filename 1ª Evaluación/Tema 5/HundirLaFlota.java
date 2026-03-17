public class HundirLaFlota{

    /*Objetivo del ejercicio
    Desarrollar en Java una versión simplificada del juego Hundir la Flota, utilizando matrices,
    funciones y estructuras de control.
    Descripción general del juego
    El programa simula una partida entre el jugador y el ordenador.
    ● El tablero es una matriz bidimensional de tamaño fijo.
    ● El ordenador coloca varios barcos en posiciones aleatorias.
    ● El jugador intenta hundir todos los barcos introduciendo coordenadas.
    ● El juego termina cuando todos los barcos han sido hundidos.
    Tablero
    ● Tamaño: 10 filas x 10 columnas
    ● Tipo: String[][]
    ● Símbolos:
    ○ ~ → Agua (posición no descubierta)
    ○ B → Barco (solo visible internamente)
    ○ X → Barco tocado
    ○ O → Disparo al agua
    Barcos
    ● El ordenador colocará:
    ○ 5 barcos
    ● Cada barco ocupa una sola casilla.
    ● No pueden superponerse.
    Funcionamiento del juego
    1. Se crea el tablero vacío (todo agua).
    2. El ordenador coloca los barcos aleatoriamente.
    3. Mientras queden barcos sin hundir:
    ○ Se muestra el tablero sin revelar los barcos.
    ○ El jugador introduce:
    ■ Fila (0–9)
    ■ Columna (0–9)
    ○ El programa comprueba:
    ■ Barco → se marca como X y se informa “¡Tocado!”
    ■ Agua → se marca como O y se informa “Agua”
    ■ Casilla repetida → se avisa al jugador
    4. Cuando todos los barcos están hundidos:
    ○ Se muestra el tablero final completo
    ○ Se informa del número de intentos usados
    Requisitos técnicos
    El programa debe:
    ● Usar matrices bidimensionales
    ● Usar funciones para estructurar el código
    Funciones mínimas recomendadas
    Se deben crear funciones como:
    ● Inicializar el tablero
    ● Mostrar el tablero por pantalla
    ● Colocar barcos aleatoriamente
    ● Comprobar un disparo
    ● Comprobar si quedan barcos sin hundir
    (El nombre y parámetros de las funciones quedan a elección del alumno)
    Validaciones obligatorias
    ● Las coordenadas deben estar dentro del tablero
    ● No se puede disparar dos veces a la misma casilla
    ● El programa no debe cerrarse por errores de entrada
    Ampliaciones opcionales (para subir nota)
    ● Contador de disparos
    ● Dificultad (tablero más grande o más barcos)
    ● Modo dos jugadores (dos tableros)
    ● Mostrar letras para columnas (A–J)
    Entrega
    ● Archivo .java
    ● Código comentado
    ● Uso correcto de funciones
    ● Claridad y orden en el código */



    //Esta función crea el tablero
    public static String[][] creartablero(){
        String[][] tablero = new String[10][10];
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = "~";
            }
        }return tablero;
    }


    //Esta función muestra el tablero 
    public static void mostrartablero(String[][] tablero){
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                System.out.println(tablero[i][j]);
            }
        }
    }

    

    //Esta función genera coordenadas aleatorias
    public static int[] generarcoordenadas(int fila, int columna){
        int[] coordenadas = new int[2];
        coordenadas[0] = fila;
        coordenadas[1] = columna;
        return coordenadas;
    }


    //Esta función coloca a los barcos de forma aleatoria en el tablero
    public static void colocarbarcos(String[][] tablero){
        int fila = (int) (Math.random() * 10);
        int columna = (int) (Math.random() * 10);
        if (tablero[fila][columna] == "B") {
            colocarbarcos(tablero);
        } else {
            tablero[fila][columna] = "B";
        }
    }


    //Esta función comprueba si hay barcos sin hundir
    public static boolean haybarcos(String[][] tablero){
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                if (tablero[i][j] == "B") {
                    return true;
                }
            }
        }
        return false;
    }
    

    //Esta función determina si se ha acertado o no
    public static void barcotocado(String[][] tablero){
        int fila = (int) (Math.random() * 10);
        int columna = (int) (Math.random() * 10);
        if (tablero[fila][columna] == "B") {
            tablero[fila][columna] = "X";
            System.out.println("Barco tocado");
        }else if (tablero[fila][columna] == "X"){
            barcotocado(tablero);
            System.out.println("Barco tocado");
        }else if (tablero[fila][columna] == "O"){
            barcotocado(tablero);
            System.out.println("Agua");
        }else if (tablero[fila][columna] == "~"){
            tablero[fila][columna] = "O";
            System.out.println("Agua");
        }
    }   

    

    public static void main(String[] args) throws Exception{
        
    }
}