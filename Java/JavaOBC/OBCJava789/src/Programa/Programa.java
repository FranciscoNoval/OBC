package Programa;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream,
 * excepciones, un HashMap y un ArrayList, LinkedList o array.
 */
public class Programa {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Banda bandaRock = new Banda();
        System.out.println("Vamos a crear una banda de rock con su discografía");
        System.out.println("==================================================");
        System.out.print("Ingrese el nombre de la banda: ");
        bandaRock.setNombreBanda(leer.nextLine());
        System.out.print("Ingrese el nombre del vocalista: ");
        bandaRock.setVocalista(leer.nextLine());
        System.out.print("Ingrese el nombre del guitarrista: ");
        bandaRock.setGuitarrista(leer.nextLine());
        System.out.print("Ingrese el nombre del bajista: ");
        bandaRock.setBajista(leer.nextLine());
        System.out.print("Ingrese el nombre del baterista: ");
        bandaRock.setBaterista(leer.nextLine());
        System.out.println("Muy bien! hemos creado la banda de Rock " + bandaRock.getNombreBanda());
        System.out.println();

        System.out.println("Ahora crearemos la discografía de la banda!");
        bandaRock.llenarDiscografia();

        try {
            PrintStream escribirFichero = new PrintStream("ficheros/bandaRock.txt");
            escribirFichero.println();
            escribirFichero.println("Estos son los datos de la banda " + bandaRock.getNombreBanda().toUpperCase());
            escribirFichero.println();
            escribirFichero.println("Sus integrantes");
            escribirFichero.println("==============================================");
            escribirFichero.println("Vocalista: " + bandaRock.getVocalista());
            escribirFichero.println("Guitarrista: " + bandaRock.getGuitarrista());
            escribirFichero.println("Bajista: " + bandaRock.getBajista());
            escribirFichero.println("Baterista: " + bandaRock.getBaterista());
            escribirFichero.println();
            escribirFichero.println("Su discografía");
            escribirFichero.println("==============================================");
            for (Object elemento : bandaRock.getDiscografia().entrySet()) {
                escribirFichero.println(elemento);

            }
        } catch (Exception e) {
            System.out.println("Hubo algun problema en la copia del archivo: " + e.getMessage());

        }

    }
}
