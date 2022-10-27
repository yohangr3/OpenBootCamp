package com.example;

public class Funciones2 {

    public static void main(String[] args) {

        int resultado1 = suma(50,50);
        System.out.println(resultado1);
        int resultado2 = suma(20,50);
        System.out.println(resultado2);
        int resultado3 = suma(30,50);
        System.out.println(resultado3);
        int resultado4 = suma(40,50);
        System.out.println(resultado4);
        int resultado5 = suma(10,50);
        System.out.println(resultado5);

    }

    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
