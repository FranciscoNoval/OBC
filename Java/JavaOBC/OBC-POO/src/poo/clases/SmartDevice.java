package poo.clases;

public class SmartDevice {
    protected String fabricante;
    protected String modelo;
    protected int numeroSerie;
    protected String color;
    protected String procesador;

    public SmartDevice() {
    }

    public SmartDevice(String fabricante, String modelo, int numeroSerie, String color, String procesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.color = color;
        this.procesador = procesador;
    }
}
