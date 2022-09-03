package poo.herencia;

import poo.clases.SmartDevice;

public class SmartPhone extends SmartDevice {
    public String tipoPantalla;
    public int ram;
    public int catidadCamaras;
    public boolean jackAuriculares;

    public SmartPhone() {
    }

    public SmartPhone(String fabricante, String modelo, int numeroSerie, String color, String procesador, String tipoPantalla, int ram, int catidadCamaras, boolean jackAuriculares) {
        super(fabricante, modelo, numeroSerie, color, procesador);
        this.tipoPantalla = tipoPantalla;
        this.ram = ram;
        this.catidadCamaras = catidadCamaras;
        this.jackAuriculares = jackAuriculares;
    }
}
