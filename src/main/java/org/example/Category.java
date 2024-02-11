package org.example;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Tovar> spisok = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addProd (Tovar tovar)
    {
        this.spisok.add(tovar);
    }
    public void delete (Tovar tovar)
    {
        this.spisok.remove(tovar);
    }

    public void printAll(Category ct0, Category ct1)
    {
        System.out.println(this.name + ": " + spisok);
        System.out.println(ct0.name + ": " + ct0.spisok);
        System.out.println(ct1.name + ": " + ct1.spisok + "\n");
    }

    @Override
    public String toString() {
        return name + " " +
                spisok + " \n" ;
    }
}
