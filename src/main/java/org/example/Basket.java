package org.example;

import java.util.ArrayList;

public class Basket extends User{

    protected ArrayList<Tovar> purchase;

    protected Basket(String login, int password) {
        super(login, password);
        purchase = new ArrayList<>();
    }

    public void adds(Tovar tvr) {
        purchase.add(tvr);

    }

}
