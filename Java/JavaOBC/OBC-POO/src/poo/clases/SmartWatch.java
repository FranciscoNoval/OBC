package poo.clases;

public class SmartWatch extends SmartDevice{
    protected String correaColor;
    protected boolean gps;

    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String modelo, int numeroSerie, String color, String procesador, String correaColor, boolean gps) {
        super(fabricante, modelo, numeroSerie, color, procesador);
        this.correaColor = correaColor;
        this.gps = gps;
    }
}
