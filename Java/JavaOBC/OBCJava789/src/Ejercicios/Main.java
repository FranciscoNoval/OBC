package Ejercicios;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    /**
     * Función que invierte el texto ingresado
     * @param texto
     * @return
     */
    public static String reverse(String texto) {
        String textoAlReverso = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoAlReverso = textoAlReverso.concat(String.valueOf(texto.charAt(i)));
        }
        return textoAlReverso.toUpperCase();
    }

    /**
     * Función que captura el error de dividir un numero por cero
     * @param a
     * @param b
     * @return
     * @throws ArithmeticException
     */
    public static int dividePorCero(int a, int b) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        ;
        return resultado;
    }

    /**
     * Función que copia un fichero en otro
     * @param fileIn
     * @return
     */
    public static PrintStream copiarFichero(String fileIn) {
        PrintStream fileOut = null;
        try {
            InputStream fichero = new FileInputStream(fileIn);
            byte[] datosFichero = fichero.readAllBytes();
            in.close();
            fileOut = new PrintStream("ficheros/ficheroCopia.rtf");
            fileOut.write(datosFichero);
            out.close();
        } catch (Exception e) {
            System.out.println("Hubo algun problema en la copia del archivo: " + e.getMessage());
        }
        return fileOut;
    }



    public static void main(String[] args) {
        Scanner leer = new Scanner(in);

        //Devolvemos un texto al revés.......................
        System.out.println("****** Reverso de un texto ******");
        System.out.print("Ingrese un texto: ");
        String texto = leer.nextLine();
        System.out.println("El texto ingresado al reverso es: " + reverse(texto));
        System.out.println();

        //1. Creamos un array unidimensional y lo recorremos mostrando sus valores.
        System.out.println("****** Array Unidimensional ******");
        int arrayUni[] = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < arrayUni.length; i++) {
            System.out.print("[" + arrayUni[i] + "]");
        }
        System.out.println();
        System.out.println();

        //2. Creamos un array bidimensional y lo recorremos mostrando sus valores.
        System.out.println("****** Array Bidimensional ******");
        int arrayBi[][] = new int[][]{
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.println("En i: " + i + " y j: " + j + ", el valor es: " + arrayBi[i][j]);
            }
        }
        System.out.println();

        //3. Crea un "Vector", añádimos 5 elementos. Elimina el 2do y 3ro y muestramos el resultado.
        System.out.println("****** Vectores ******");
        Vector<String> vectorDeNombres = new Vector();
        vectorDeNombres.add("Hernesto");
        vectorDeNombres.add("Fabian");
        vectorDeNombres.add("Laura");
        vectorDeNombres.add("Miguel");
        vectorDeNombres.add("Juana");

        vectorDeNombres.remove(1);
        vectorDeNombres.remove(2);

        System.out.println("Datos del vector: " + vectorDeNombres);
        System.out.println();

        //4. Indica cuál es el problema de utilizar un Vector con la
        // capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo:

        //Respuesta: Los vectores por defecto tienen capacidad para 10 elementos. Cuando se rebasa ese límite
        //por debajo se genera un nuevo array de el doble de elementos (20 elementos)
        // y se copian todos los datos al nuevo array.
        //Si tenemos que añadir 1000 elementos el trabajo computacional de crear nuevos arrays mas grandes
        // e ir copiando los datos seria muy elevado y nos podria llevar relentar el ordenador que estemos utilizando.

        //5. Crea un "ArrayList", añádimos 4 elementos. Lo copiamos en una LinkedList y recorremos ambos mostrando el valor.
        System.out.println("****** ArrayList y LinkedList ******");
        ArrayList<String> nombresDePerros = new ArrayList<>();
        nombresDePerros.add("Toby");
        nombresDePerros.add("Sasha");
        nombresDePerros.add("Batuke");
        nombresDePerros.add("Perlita");

        System.out.println("Este es el ArrayList");
        for (String nombre : nombresDePerros) {
            System.out.println(nombre);
        }
        System.out.println();

        LinkedList<String> nombresDePerros2 = new LinkedList<>(nombresDePerros);

        System.out.println("Este es el LinkedList");
        for (int i = 0; i < nombresDePerros2.size(); i++) {
            System.out.println(nombresDePerros2.get(i));
        }
        System.out.println();

        //6. Crea un ArrayList de tipo int con elementos 1..10, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final.
        System.out.println("****** ArrayList: Borrar los numeros pares ******");
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }
        System.out.println(numeros);
        System.out.println();

        //7. Crea una función DividePorCero. Debe generar una excepción ("throws") a su llamante del tipo
        // ArithmeticException que será capturada por su llamante . Mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".
        System.out.println("****** Excepciones ******");

        try {
            dividePorCero(6, 0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse!!!");
        } finally {
            System.out.println("* Demo de código *");
        }

        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        //Copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        System.out.println("****** Entrada / Salida ******");
        try {
            copiarFichero("/Users/fmnoval/Documents/Programacion/OpenBootCamp/OBC/Java/JavaOBC/OBCJava789/" +
                    "ficheros/ficheroOriginal.rtf");
            System.out.println("La copia del fichero pudo efectuarse con exito");
        } catch (Exception e) {
            System.out.println("Hubo algun problema en la copia del archivo: " + e.getMessage());
        }
    }
}

