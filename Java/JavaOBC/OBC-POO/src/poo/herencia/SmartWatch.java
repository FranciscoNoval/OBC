package poo.herencia;

import poo.clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    public String correaColor;
    public boolean gps;

    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String modelo, int numeroSerie, String color, String procesador, String correaColor, boolean gps) {
        super(fabricante, modelo, numeroSerie, color, procesador);
        this.correaColor = correaColor;
        this.gps = gps;
    }
}
