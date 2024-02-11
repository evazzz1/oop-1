package org.example;

public class User {
    private String login;
    private int password;
    private Basket bs;
    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }
    public void initializeBusket() {
        this.bs = new Basket(this.login, this.password);
    }

    public void addPurch (Tovar tvr, Category category)
    {
        this.bs.adds(tvr);
        category.delete(tvr);
    }

    public void printAllPurch()
    {
        System.out.println(login + " покупки: " + bs.purchase + "\n");
    }

}