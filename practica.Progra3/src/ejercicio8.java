import  java.util.Scanner;
import  java.util.Random;



public class ejercicio8 {

    static int filas = 8;
    static int columnas = 8;
    static int minas = 10;
    static int[][] matriz = new int[filas][columnas];
    static boolean[][] descubrierto = new boolean[filas][columnas];

    public static void main(String[] args) {
        iniciarMatriz();
        colocarminas();
        Jugar();
    }

    public static void iniciarMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = 0;
                descubrierto[i][j] = false;
            }

        }
    }

    public static void colocarminas() {
        Random random = new Random();
        int Minascolocadas = 0;


        while (Minascolocadas < minas) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);
            if (matriz[fila][columna] != -1) {
                matriz[fila][columna] = -1;
                Minascolocadas++;

                for (int i = Math.max(0, fila - 1); i <= Math.min(filas - 1, fila + 1); i++) {
                    for (int j = Math.max(0, columna - 1); j <= Math.min(columnas - 1, columna + 1); j++) {
                        if (matriz[i][j] != -1) {
                            matriz[i][j]++;
                        }

                    }

                }
            }
        }
    }

    public static void imprimirMatriz(boolean revelartodo) {
        System.out.println("Estados del tablero");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (revelartodo || descubrierto[i][j]) {
                    if (matriz[i][j] == -1) {
                        System.out.print("*  ");
                    } else if (matriz[i][j] == 0) {
                        System.out.print(" . ");
                    } else {
                        System.out.print(matriz[i][j] + "  ");


                    }

                } else {
                    System.out.print("?  ");
                }
            }
                System.out.println();

            }
        }

        public static void Jugar () {
            Scanner scanner = new Scanner(System.in);
            boolean jugando = true;
            while (jugando) {
                imprimirMatriz(false);
                System.out.println("ingrese un numero de una fila o columna: ");
                int fila = scanner.nextInt();
                int columna = scanner.nextInt();
                if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
                    System.out.println("esas cordenadas o numeros estan fuera del rango intentelo de nuevo");
                    continue;
                }
                if (matriz[fila][columna] == -1) {
                    System.out.println("BooM pisante una mina  !!!  fin");
                    imprimirMatriz(true);
                    jugando = false;

                } else {
                    DescrubirCelda(fila, columna);
                    if (todasCeldasDescubriertas()) {
                        System.out.println("FELIZIDADES");
                        imprimirMatriz(true);
                        jugando = false;
                    }
                }
            }
            scanner.close();

        }

        public static void DescrubirCelda ( int fila, int columna){
            if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas || descubrierto[fila][columna]) {
                return;
            }
            descubrierto[fila][columna] = true;
            if (matriz[fila][columna] == 0) {
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        DescrubirCelda(fila + i, columna + j);

                    }


                }

            }
        }

        public static boolean todasCeldasDescubriertas () {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz[i][j] != -1 && !descubrierto[i][j]) {
                        return false;
                    }
                }

            }
            return true;
        }
    }













