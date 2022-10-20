package com.example;

import static com.example.Funciones.getPriece;

public class EjercicioIva {

    public static void main(String[] args) {

        double iva = 0.19;
        double precio = 500;
        double precioIva = getPriece( iva , precio);
        System.out.println(precioIva);

    }

    static double getPriece(double iva , double precio) {
        return (((precio * iva) + precio));
    }
}
