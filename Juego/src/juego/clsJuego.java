/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class clsJuego {

    private char[][] matriz;
    private String jugador1 = "";
    private String jugador2 = "";
    private Scanner teclado;
    private int matrizInvisible = 0;

    private int cont = 0;
    private char continuar = ' ';
    public int rendirse = 0;
    int jugador1Columna = 0;
    int jugador2Columna = 0;
    private int gn = 0;

    public int getGn() {
        return gn;
    }

    public void setGn(int gn) {
        this.gn = gn;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }
    private int pr = 0;
    private String ganador = "";
    private String perdedor = "";

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getRendirse() {
        return rendirse;
    }

    public void setRendirse(int rendirse) {
        this.rendirse = rendirse;
    }

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public void cargarMatriz() {
        teclado = new Scanner(System.in);
        matriz = new char[6][7];
        String guarda = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                guarda = "[" + matriz[i][j] + "]";
                System.out.print(guarda);
            }
            System.out.println("");
            guarda += '\n';
        }
    }

    public void jugar() {
        teclado = new Scanner(System.in);
        int cont = 0;
//matriz=new int [6][7];
        char continuar = ' ';

        do {
            try {
                if (cont == 0) {
                    System.out.println("El turno es para " + getJugador1());
                    int pasadas = 0;

                    System.out.println("Ingrese la columna");
                    jugador1Columna = teclado.nextInt();

                    for (int i = 0; i < 6; i++) {
                        pasadas++;
                        for (int j = 0; j < 7; j++) {
                            if (pasadas == 6) {
                                if (jugador1Columna == j) {
                                    while (matriz[i][j] == 'X' || matriz[i][j] == '0') {
                                        i--;

                                    }
                                    if (i >= 0) {
                                        matriz[i][j] = 'X';
                                    }

                                }
                            }

                        }

                    }

                    cont++;

                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("[" + matriz[i][j] + "]");
                        }
                        System.out.println();

                    }
                    validarJugador1HorizontalDerecha();
                    validarJugador1HorizontalIzquierda();

                } else {

                    System.out.println("El turno es para " + getJugador2());
                    cont = 0;
                    int pasadas = 0;

                    System.out.println("Ingrese la columna");
                    jugador2Columna = teclado.nextInt();
                    for (int i = 0; i < 6; i++) {
                        pasadas++;
                        for (int j = 0; j < 7; j++) {

                            if (pasadas == 6) {
                                if (jugador2Columna == j) {
                                    while (matriz[i][j] == '0' || matriz[i][j] == 'X') {
                                        i--;

                                    }
                                    if (i >= 0) {
                                        matriz[i][j] = '0';
                                    }

                                }

                            }

                        }

                    }

                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("[" + matriz[i][j] + "]");
                        }
                        System.out.println();

                    }
                    validarJugador2HorizontalDerecha();
                    validarJugador2HorizontalIzquierda();

                }
            } catch (Exception e) {
                System.out.println("Lo lamento insuficientes columnas, ingrese en otras columnas ");
            }
            teclado = new Scanner(System.in);

            System.out.println("Ingrese s para continuar o  r para rendirse");
            continuar = teclado.nextLine().charAt(0);
            // todavia le falta no funciona bien//
            //Es para en caso de que el jugador quiera rendirse
            if (cont == 0 && continuar == 'r' || continuar == 'R') {

                System.out.println("Acaba de rendirse el jugador " + getJugador2() + "Por la tanto  el ganador es " + getJugador1());
                rendirse = 1;
                gn = 1;
                setGn(gn);
                pr = 2;
                setPr(pr);
                break;
            } else if (cont == 1 && continuar == 'r' || continuar == 'R') {
                System.out.println("Acaba de rendirse el jugador " + getJugador1() + "Por la tanto  el ganador es " + getJugador2());
                rendirse = 1;
                pr = 1;
                setPr(pr);
                gn = 2;
                setGn(gn);
                break;
            }

        } while (continuar == 's' || continuar == 'S' || continuar == 'r' || continuar == 'R');

    }
//Metodo para validar 4 en linea vertical, horizontal o diagonal del jugador 1
//Medio funciona con algunas fallas

    public void validarJugador1HorizontalDerecha() {
        int forinLine = 0;
        int camb = 0;
        int verificador = 1;
        gn = 1;
        pr = 1;
        int pasadas = 0;
        int sinrep = 0;
//Este ciclo recorre el ciclo de las filas 

        for (int i = 0; i < 6; i++) {
            //Este ciclo recorre el ciclo de las columnas 
            for (int j = 0; j < 7; j++) {
                camb = j;
                if (matriz[i][j] == '0') {
                    verificador=0;
                }
                while (matriz[i][j] == 'X') {
                    sinrep++;
                    if (sinrep <= 5) {
                        if (j <= 3) {
                            j++;
                            pasadas++;
                            forinLine++;
                            if (forinLine == 4 && verificador!=0) {
                                System.out.println("Felicidades el ganador es " + getJugador1());
                                ganador = getJugador1();
                                perdedor = getJugador1();
                                forinLine = 0;

                            }
                        }

                    } else {
                        break;
                    }
                }

                if (pasadas < 4) {
                    j = camb;
                    pasadas = 0;
                }

            }

        }
        verificador = 1;
        forinLine = 0;
    }

    public void validarJugador1HorizontalIzquierda() {
        int verificador = 1;
        int forinLine = 0;
        int camb = 0;
        gn = 1;
        pr = 1;
        int pasadas = 0;
        int sinrep = 0;
//Este ciclo recorre el ciclo de las filas 

        for (int i = 0; i < 6; i++) {
            //Este ciclo recorre el ciclo de las columnas 
            for (int j = 0; j < 7; j++) {
                camb = j;
                if (matriz[i][j] == '0') {
                    verificador=0;
                }

                while (matriz[i][j] == 'X') {
                    sinrep++;
                    if (sinrep <= 5) {
                        if (j >= 3) {
                            j--;
                            pasadas++;
                            forinLine++;

                            if (forinLine == 4 && verificador!= 0) {
                                System.out.println("Felicidades el ganador es " + getJugador1());
                                ganador = getJugador1();
                                perdedor = getJugador1();
                                forinLine = 0;
                                // camb = j;
                            }
                        }
                    }
                    break;
                }
                if (pasadas < 4) {
                    j = camb;
                    pasadas = 0;
                }

            }

        }
        verificador = 1;
        forinLine = 0;
    }

    public void validarJugador1verticalmente() {
        int verificador = 0;
        int forinLine = 1;
        int camb = 0;
        gn = 1;
        pr = 1;
        int pasadas = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                camb = j;
                if (matriz[i][j] == '0') {
                    verificador=0;
                }
                while (matriz[i][j] == 'X') {

                    i--;
                    pasadas++;
                    forinLine++;
                    if (forinLine == 4 && verificador!= 0) {
                        System.out.println("Felicidades el ganador es " + getJugador1());

                        ganador = getJugador1();
                        perdedor = getJugador1();
                    }

                }
                if (pasadas < 4) {
                    j = camb;
                    pasadas = 0;
                }

            }
        }
        verificador = 1;
        forinLine = 0;
    }

    public void validarJugador2HorizontalDerecha() {
        int forinLine1 = 0;
        int verificador1 = 1;
        int camb1 = 0;
        int sinrep1 = 0;
        int pasadas1 = 0;
        for (int i = 0; i < 6; i++) {
            //Este ciclo recorre el ciclo de las columnas 
            for (int j = 0; j < 7; j++) {
                camb1 = j;
                if (matriz[i][j] == 'X') {
                    verificador1=0;
                }
                while (matriz[i][j] == '0') {
                    sinrep1++;
                    if (sinrep1 <= 5) {
                        if (j <= 3) {
                            j++;
                            pasadas1++;
                            forinLine1++;
                            if (forinLine1 == 4 && verificador1!= 0) {
                                System.out.println("Felicidades el ganador es " + getJugador2());
                                ganador = getJugador1();
                                perdedor = getJugador1();
                                forinLine1 = 0;

                            }
                        }

                    } else {
                        break;
                    }
                }

                if (pasadas1 < 4) {
                    j = camb1;
                    pasadas1 = 0;
                }

            }

        }
        verificador1 = 1;
        forinLine1 = 0;
    }

    public void validarJugador2HorizontalIzquierda() {
        int forinLine1 = 0;
        int camb1 = 0;
        int verificador1 = 1;
        gn = 1;
        pr = 1;
        int pasadas1 = 0;
        int sinrep1 = 0;
//Este ciclo recorre el ciclo de las filas 

        for (int i = 0; i < 6; i++) {
            //Este ciclo recorre el ciclo de las columnas 
            for (int j = 0; j < 7; j++) {
                camb1 = j;
                if (matriz[i][j] == 'X') {
                    verificador1=0;
                }
                while (matriz[i][j] == '0') {
                    sinrep1++;
                    if (sinrep1 <= 5) {
                        if (j >= 3) {
                            j--;
                            pasadas1++;
                            forinLine1++;
                            if (forinLine1 == 4 && verificador1 != 0) {
                                System.out.println("Felicidades el ganador es " + getJugador2());
                                ganador = getJugador1();
                                perdedor = getJugador1();
                                forinLine1 = 0;
                                // camb = j;
                            }
                        }
                    }
                    break;
                }
                if (pasadas1 < 4) {
                    j = camb1;
                    pasadas1 = 0;
                }

            }

        }
        verificador1 = 1;
        forinLine1 = 0;
    }

    public void validarJugador2verticalmente() {
        int verificador1 = 1;
        int forinLine1 = 0;
        int camb1 = 0;
        gn = 1;
        pr = 1;
        int pasadas1 = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                camb1 = j;
                if (matriz[i][j] == 'X') {
                    verificador1=0;
                }
                while (matriz[i][j] == '0') {

                    i--;
                    pasadas1++;
                    forinLine1++;
                    if (forinLine1 == 4 && verificador1 != 0) {
                        System.out.println("Felicidades el ganador es " + getJugador2());
                        // camb = j;
                        ganador = getJugador1();
                        perdedor = getJugador1();
                    }

                }
                if (pasadas1 < 4) {
                    j = camb1;
                    pasadas1 = 0;
                }

            }
        }
        verificador1 = 1;
        forinLine1 = 0;
    }

//Metodo para validar 4 en linea vertical, horizontal o diagonal del jugador 2
//Medio funciona con algunas fallas
    public void validarJugador1DiagonalmenteDerecha(){
     int verificador = 1;
        int forinLine = 0;
        int camb1 = 0;
        int sinrep=0;
        int pasadas=0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                 while (matriz[i][j] == '0') {
                    sinrep++;
                    if (sinrep <= 5) {
                        
                        i--;
                            j++;
                            pasadas++;
                            forinLine++;
                            if (forinLine == 4 && verificador!= 0) {
                                System.out.println("Felicidades el ganador es " + getJugador2());
                                ganador = getJugador1();
                                perdedor = getJugador1();
                                forinLine = 0;
                                // camb = j;
                            }
                        
                    }
                    break;
                }
                if (pasadas < 4) {
                    j = camb1;
                    pasadas = 0;
                }

            }

        }
        verificador = 1;
        forinLine = 0;
                
                
            
        
    
    
    
    
    }
    
    
    
    public void reiniciar() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = ' ';
            }
        }

    }

}
