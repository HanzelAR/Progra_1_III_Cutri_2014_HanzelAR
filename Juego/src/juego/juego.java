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
public class juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opc = 0;
        int menu1 = 0;

        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        clsJuego juego = new clsJuego();
        String jugador1 = "";
        String jugador2 = "";
        char continuar = ' ';
        do {
            System.out.println("Seleccione una opcion del menu " + '\n'
                    + "1. Seleccionar el nombre del jugador número 1" + '\n'
                    + "2. Seleccionar el nombre del jugador número 2" + '\n'
                    + "3. Iniciar juego" + '\n'
                    + "4. Salir");
            opc = Integer.parseInt(teclado.nextLine());

            switch (opc) {
                case 1:

                    System.out.println("Ingrese el nombre del jugador 1");
                    juego.setJugador1(teclado.nextLine());

                case 2:
                    System.out.println("Ingrese el nombre del jugador 2");
                    juego.setJugador2(teclado.nextLine());
                case 3:
                    System.out.println('\n' + "Matriz vacia " + '\n');
                    juego.cargarMatriz();
                    juego.jugar();

                    System.out.println("Ingrese la opcion que desee " + '\n'
                            + "2.Reiniciar " + '\n'
                            + "3.Colocar ficha" + '\n'
                            + "4.Validar 4 en linea" + '\n'
                            + "5.Ganador" + '\n'
                            + "6.Perdedor" + '\n'
                            + "7.Estadistica" + '\n'
                            + "8.Salir" + '\n'
                    );
                    menu1 = Integer.parseInt(teclado.nextLine());
                    switch (menu1) {
                        case 1:

                            break;
                        case 2:
                            juego.reiniciar();
                            break;
                        case 3:

                            break;
                        case 4:
                            //Validar 4 en line
                           // juego.validarJugador1();
                            //juego.validarJugador2();
                        case 5:

                            //Ganador 
                            
                            //todavia no sirve bien
                            
                            if (juego.getGn() == 1) {
                          System.out.println("El ganador es " + jugador1);

                            } else {
                                System.out.println("El ganador es " + jugador2);
                            }

                            break;
                        case 6:
                            //Perdedor
                            if (juego.getPr()== 2) {
                                System.out.println("El ganador es " + jugador1);

                            } else {
                                System.out.println("El ganador es " + jugador2);
                            }
                            break;
                        case 7:

                            //Estadistica
                            
                            
                            break;

                        case 8:
                            System.out.println("Gracias por su atencion");
                            System.exit(0);
                            break;

                    }

                    break;
                case 4:
                    System.out.println("Gracias por su atencion");
                    System.exit(0);
                    break;
            }

            System.out.println("Ingrese s para continuar ");
            continuar = teclado.nextLine().charAt(0);
        } while (continuar == 's' || continuar == 'S');
    }

}
