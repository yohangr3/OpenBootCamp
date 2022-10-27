package com.example;

/*+
    Sobrecarga de métodos permite duplicar un método siempre y cuando tengan diferente número/tipó de parámetros
 */
public class Sobrecarga {

    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 30;
        int numero3 = 40;
        System.out.println(suma(numero1, numero2, numero3));
        System.out.println(suma(numero1, numero2));
    }
    

    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static int suma(int numero1, int  numero2, int numero3) {
        return numero1 + numero2  + numero3;
    }

}
