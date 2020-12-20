/*
 Dado el arreglo; determinar cuantos elementos están arriba de la media 
 aritmética y cuantos están por debajo de la medía aritmética.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        int suma = 0;
        double media = 0;
        for (int indice = 0; indice < arreglo.length; indice++) {
            suma = suma + arreglo[indice];
        }
        media = (double) suma / arreglo.length;
        for (int indice = 0; indice < arreglo.length; indice++) {
            if (arreglo[indice] > media) {
                elementosArribaMedia = elementosArribaMedia + 1;
            } else {
                elementosAbajoMedia = elementosAbajoMedia + 1;

            }
        }
        System.out.printf("Elementos arriba de la media aritmetica: %s\n"
                + "Elementos por debajo de la media aritmetica: %s\n",
                elementosArribaMedia, elementosAbajoMedia);

    }
}
