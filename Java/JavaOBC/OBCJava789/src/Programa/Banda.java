package Programa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banda {
    private String nombreBanda;
    private String vocalista;
    private String guitarrista;
    private String bajista;
    private String baterista;
    private HashMap <Integer, Disco> discografia;

    public Banda() {
    }

    public Banda(String nombreBanda, String vocalista, String guitarrista, String bajista, String baterista, HashMap discografia) {
        this.nombreBanda = nombreBanda;
        this.vocalista = vocalista;
        this.guitarrista = guitarrista;
        this.bajista = bajista;
        this.baterista = baterista;
        this.discografia = discografia;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public String getVocalista() {
        return vocalista;
    }

    public void setVocalista(String vocalista) {
        this.vocalista = vocalista;
    }

    public String getGuitarrista() {
        return guitarrista;
    }

    public void setGuitarrista(String guitarrista) {
        this.guitarrista = guitarrista;
    }

    public String getBajista() {
        return bajista;
    }

    public void setBajista(String bajista) {
        this.bajista = bajista;
    }

    public String getBaterista() {
        return baterista;
    }

    public void setBaterista(String baterista) {
        this.baterista = baterista;
    }

    public HashMap getDiscografia() {
        return discografia;
    }

    public void setDiscografia(HashMap discografia) {
        this.discografia = discografia;
    }

    @Override
    public String toString() {
        return "Banda{" +
                "nombreBanda='" + nombreBanda + '\'' +
                ", vocalista='" + vocalista + '\'' +
                ", guitarrista='" + guitarrista + '\'' +
                ", bajista='" + bajista + '\'' +
                ", baterista='" + baterista + '\'' +
                ", discografia=" + discografia +
                '}';
    }

    public void llenarDiscografia(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        discografia = new HashMap<Integer, Disco>();
        System.out.println("Ingrese cuantos discos contendra la discografia de la banda");
        int cantidadDiscos = leer.nextInt();
        while (cantidadDiscos > 10){
            System.out.println("La cantidad de discos es demasiado grande, ingrese una cantidad menor");
            cantidadDiscos = leer.nextInt();
        }
        for (int i = 0; i < cantidadDiscos; i++){
            discografia.put(i+1, new Disco());
        }
        for (Map.Entry<Integer, Disco> elemento : discografia.entrySet()){
            System.out.println("Disco " + elemento.getKey() + ": ");
            elemento.getValue().crearDisco();
            System.out.println();
        }
    }
}
