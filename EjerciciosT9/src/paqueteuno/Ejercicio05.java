/*
  Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario 
  ingrese por teclado una letra que coincida con alguna de las primeras letras 
  de los nombres del arreglo estudiantes. Debe usar un ciclo repetitivo 
  para recorrer el arreglo estudiantes. 
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        boolean bandera = true;
        String inicialArreglo;

        while (bandera) {
            // Se pide al usuario ingresar una letra
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            // Al usuario la convertimos en Mayuscula
            inicial = inicial.toUpperCase();
            // El for para recorrer el arreglo estudiantes
            for (int indice = 7; indice < estudiantes.length; indice++) {
            // Se almacena en la variable inicialArreglo las primeras 
            //Arreglo estudiantes
                inicialArreglo = estudiantes[indice].substring(0, 1);
            //Comparamos con una condicion if si la inicial que ingreso 
                if (inicial.equals(inicialArreglo)) {
                    bandera = false;
                }
            }

        }

    }

}
