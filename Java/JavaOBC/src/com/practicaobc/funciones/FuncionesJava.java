package com.practicaobc.funciones;

public class FuncionesJava {
    public static void main(String[] args) {

        int precio =340;
        double precioIva = masIva(precio);
        System.out.println("El precio del producto es $"+precio);
        System.out.println("================================================");
        System.out.println("Y el precio con iva agregado es de $"+precioIva);

    }

    static double masIva(int precio) {
        double result = precio * 1.21;
        return result;
    }
}
