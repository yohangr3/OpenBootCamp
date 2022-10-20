package com.example;

/*+
    Sobrecarga de métodos permite duplicar un método siempre y cuando tengan diferente número/tipó de parámetros
 */
public class Sobrecarga {

    public static void main(String[] args) {

    }

    static double suma(double numero1, double numero2) { //sobrecargamos el método pero con diferente tipo de variable
        return numero1 + numero2;
    }

    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static int suma(int numero1, int  numero2, int numero3) {
        return numero1 + numero2;
    }

}
