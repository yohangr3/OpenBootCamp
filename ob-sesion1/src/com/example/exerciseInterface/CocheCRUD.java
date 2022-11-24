package com.example.exerciseInterface;

import java.util.List;

public interface CocheCRUD {

    void save(Coche coche); //método abstracto

    List<Coche> findAll();

    void delete();
}
