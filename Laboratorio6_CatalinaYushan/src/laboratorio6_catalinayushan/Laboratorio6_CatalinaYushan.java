package lab6__catalinayushan;

import java.util.Scanner;

import java.util.Random;

public class Lab6__CatalinaYushan {

    public static void main(String[] args) {
        Scanner quaxly = new Scanner(System.in); //Scanner
        int opcion = 0;
        boolean choice = true; //Menu que le muestra opciones al usuario
        System.out.println("---Bienvenido!---");
        System.out.println("1. Juego de la Vida");
        System.out.println("2. Rock, Paper, Scissor, Lizard, Spock!");
        System.out.println("3. Blink-182");
        System.out.println("4. Salir del Programa");
        
        System.out.println("Eliga una de las opciones entre 1-3: ");
        
        switch(opcion){ //Switch case que muestra que ayuda a mostrar los diferentes ejercicios
            case 1:
                NoGameNoLife();
                break;
            case 2:
                RockPaperScissorLizardSpock();
                break;
            case 3:
                Blink182();
                break;
            case 4:
                System.out.println("Bye-Bye!");
                break;
            
        }
        
    }
    public static void Blink182(){ //Metodo para Ejercicio 3
        Scanner quaxly = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas que desea (y): ");
        System.out.println("Ingrese el numero de columnas que desea (x): ");
        int fila = quaxly.nextInt();
        int columna = quaxly.nextInt();
        
        int [][] neo = new int [fila][columna];
        char [][] tiffany = new char [fila][columna];
        
        for (int i = 0; i < neo.length; i++) {
            for (int j = 0; j < neo[1].length; j++) {
                int max = 122;
                int min = 97;
                int Random = new Random().nextInt((max - min) + 1) + min;
                int morpheus = neo[i][j];
                char chosenone = (char)morpheus;
                
                neo [i][j] = Random;
            }
        }
        for (int i = 0; i < neo.length; i++) {
            for (int j = 0; j < neo[1].length; j++) {
            }
            System.out.println(neo[i][j]+"-");
            }
        System.out.print("");
        
        for (int i = 0; i < tiffany.length; i++) {
            for (int j = 0; j < tiffany[1].length; j++) {
            }
            System.out.println(tiffany[i][j]+"-");
            }
            
        }
    
    public static String RockPaperScissorsSpockLizard(String object){
        Scanner quaxly = new Scanner(System.in);
        System.out.println("Bienvenido a Piedra, Papel, Tijera, Lizard y Spock, Dr. Cooper!");
        System.out.println("Aqui estan sus opciones");
        System.out.println("0. Tijera");
        System.out.println("1. Papel");
        System.out.println("2. Piedra");
        System.out.println("3. Lizard");
        System.out.println("4. Spock");

        
        System.out.println("Puede visualizar la tabla abajo: 0 es igual a ganar, 1 es igual a perder, y 2 es igual a empate. El orden de la matrix es descendente (ex. tijera,papel...)");
        System.out.println("Escriba su opcion: ");
        int max_1 = 4
        int min_2 = 0
        int Ramdom = new Random().nextInt((max_1 - min_2) + 1) + min_2;
        
        
        int [][] gameanalysis = new int [5][5];
        
       // vertical = 0,3
       // horizontal = 3,0
       
        gameanalysis [0][0] = 2;
        gameanalysis [1][0] = 0;
        gameanalysis [2][0] = 1;
        gameanalysis [3][0] = 0;
        gameanalysis [4][0] = 1;
        gameanalysis [1][1] = 1;
        gameanalysis [2][1] = 2;
        gameanalysis [3][1] = 0;
        gameanalysis [4][1] = 1;
        gameanalysis [5][1] = 0;      
        gameanalysis [1][2] = 0;
        gameanalysis [2][2] = 1;
        gameanalysis [3][2] = 2;
        gameanalysis [4][2] = 0;
        gameanalysis [5][2] = 1;
        gameanalysis [1][3] = 1;
        gameanalysis [2][3] = 0;
        gameanalysis [3][3] = 1;
        gameanalysis [4][3] = 2;
        gameanalysis [5][3] = 0;
        gameanalysis [1][4] = 0;
        gameanalysis [2][4] = 1;
        gameanalysis [3][4] = 0;
        gameanalysis [4][4] = 1;
        gameanalysis [5][4] = 2;
        
        
        
        
    }
              
    }