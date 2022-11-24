package com.example.exerciseInterface;

import java.util.List;

public class CocheCRUDlmpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {
        System.out.println("Este método guardara un cohe");
    }

    @Override
    public List<Coche> findAll() {
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Este método elimina un coche");
    }
}
