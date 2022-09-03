package poo.interfaces;

public class Coche {
    String marca;
    String modelo;
    String color;
    int numeroPuertas;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, int numeroPuertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
    }
}
