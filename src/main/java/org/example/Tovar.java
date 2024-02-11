package org.example;

public class Tovar{
    private String name;
    private int proce;
    private int rating;
    public Tovar(String name, int proce, int rating) {
        this.name = name;
        this.proce = proce;
        this.rating = rating;
    }


    @Override
    public String toString() {
        return name + ", цена:" +
                proce + ", рейтинг:" +
                rating + " ";
    }
}