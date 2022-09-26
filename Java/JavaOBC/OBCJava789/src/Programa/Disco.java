package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class Disco {
    private String tituloDisco;
    private int anio;
    private ArrayList canciones;

    public Disco() {
    }

    public Disco(String tituloDisco, int anio, ArrayList canciones) {
        this.tituloDisco = tituloDisco;
        this.anio = anio;
        this.canciones = canciones;
    }

    public String getTituloDisco() {
        return tituloDisco;
    }

    public void setTituloDisco(String tituloDisco) {
        this.tituloDisco = tituloDisco;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ArrayList getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "tituloDisco='" + tituloDisco + '\'' +
                ", anio=" + anio +
                ", canciones=" + canciones +
                '}';
    }

    public void crearDisco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el nombre del disco: ");
        this.setTituloDisco(leer.next());
        System.out.print("Ingrese el año en que se editó el disco: ");
        this.setAnio(leer.nextInt());
        canciones = new ArrayList();
        String cancion;
        System.out.println("Ingrese la cantidad de canciones que contendrá el disco");
        int cantidadCanciones = leer.nextInt();
        System.out.println("Ahora ingrese los titulos de las canciones");
        for (int i = 1; i <= cantidadCanciones; i++) {
            System.out.print("Cancion " + i + ": ");
            cancion = leer.next();
            canciones.add(cancion);
        }
    }
}
