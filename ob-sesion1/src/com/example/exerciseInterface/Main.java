package com.example.exerciseInterface;

public class Main {

    static CocheCRUD coche;

    public static void main(String[] args) {

        coche.save(new Coche());
        coche.delete();
        coche.findAll();
    }
}
