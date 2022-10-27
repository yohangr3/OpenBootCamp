package com.example;

public class Funciones {

    public static void main(String[] args) {

        //Función sin parametros y sin tipo de retorno
        showMenu();

        //Función sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPriece();
        System.out.println(price + "\n");

        //opción 3
        //Función con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootCaamp");

        //opción 4
        //Función con parametros y con tipo de retorno
        String nombre = "Alan";
        String apellido = "Sastre";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo + "\n");

        int numero1 = 50;
        int numero2 = 200;
        int resultadoSuma = suma(numero1,numero2);
        System.out.println(resultadoSuma);



    }

    static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static String obtenerSaludo(String nombre , String apellido){
        return "Buenas tardes " + nombre + " " + apellido;
    }

    static  void imprimirSaludoBuenosDias(String name){
        System.out.println("Buenas tardes " + name + "\n");
    }


    static double getPriece(){
        return 100.99;
    }

    static void showMenu(){
        System.out.println("Bienvenidos al E-commerce de zapatillas: ");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu(){

        System.out.println("imprimiendo texto prueba");
        return "Bienvenidos al E-commerce de zapatillas:  \n  1 - Ver zapatillas --- \n";
    }
}
