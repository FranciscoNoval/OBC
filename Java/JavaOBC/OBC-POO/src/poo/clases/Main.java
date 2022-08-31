package poo.clases;

public class Main {
    public static void main(String[] args) {

        // Crea un objeto de la clase SmartPhone
        SmartPhone telefono1 = new SmartPhone("Apple", "Iphone 13 Pro Max", 23455689, "Rose Gold", "A15 Bionic", "Oled", 6, 3, false);

        // Crea un objeto de la clase SmartWatch
        SmartWatch reloj1 = new SmartWatch("Samsung", "Galaxy Watch4", 345678, "Negro", "Dual Core", "Super Amoled",true);

        System.out.println("Este es el telefono creado");
        System.out.println("===========================");
        System.out.println("La marca del telefono es: "+telefono1.fabricante);
        System.out.println("El modelo del telefono es: "+telefono1.modelo);
        System.out.println("El número de serie del telefono es: "+telefono1.numeroSerie);
        System.out.println("El color del telefono es: "+telefono1.color);
        System.out.println("El procesador del telefono es: "+telefono1.procesador);
        System.out.println("La pantalla del telefono es: "+telefono1.tipoPantalla);
        System.out.println("La cantidad de memoria ram del telefono es: "+telefono1.ram);
        System.out.println("La cantidad de cámaras del telefono es: "+telefono1.catidadCamaras);
        System.out.println("EL telefono tiene jack de auriculares?: "+telefono1.jackAuriculares);
        System.out.println();
        System.out.println("Este es el reloj creado");
        System.out.println("===========================");
        System.out.println("El fabricante del reloj es: "+reloj1.fabricante);
        System.out.println("El modelo del reloj es: "+reloj1.modelo);
        System.out.println("El número de serie del reloj es: "+reloj1.numeroSerie);
        System.out.println("El color del reloj es: "+reloj1.color);
        System.out.println("El procesador del reloj es: "+reloj1.procesador);
        System.out.println("El color de la correa del reloj es: "+reloj1.correaColor);
        System.out.println("El reloj tiene GPS?: "+reloj1.gps);




    }
}
