package poo.clases;

public class SmartPhone extends SmartDevice {
    protected String tipoPantalla;
    protected int ram;
    protected int catidadCamaras;
    protected boolean jackAuriculares;

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
