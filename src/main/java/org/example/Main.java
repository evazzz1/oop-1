package org.example;

//2)Создать класс Категория, имеющий переменные имя и массив товаров.
// Создать несколько объектов класса Категория.
//3)Создать класс Basket, содержащий массив купленных товаров.
//4)Создать класс User, содержащий логин, пароль и объект класса Basket.
// Создать несколько объектов класса User.
//5)Вывести на консоль каталог продуктов. (все продукты магазина)
//6)Вывести на консоль покупки посетителей магазина.
// (После покупки у пользователя добавляется товар, а из магазина - удаляется)

public class Main {
    public static void main(String[] args) {

        Category ct1 = new Category("Хлебобулочные изделия:");
        Category ct2 = new Category("Молочные изделия:");
        Category ct3 = new Category("Овощи:");

        User user1 = new User("Maria", 12345);
        User user2 = new User("Igor", 54321);
        User user3 = new User("Kolya", 667887);


        Tovar hleb = new Tovar("хлеб", 20, 5);
        Tovar bulka = new Tovar("булка", 20, 5);
        Tovar baton = new Tovar("батон", 15, 4);

        Tovar moloko = new Tovar("молоко", 50, 4);
        Tovar tvorog = new Tovar("творог", 60, 1);
        Tovar slivki = new Tovar("сливки", 70, 3);

        Tovar ogyrec = new Tovar("огурцы", 13, 2);
        Tovar pomidor = new Tovar("помидоры", 25, 3);
        Tovar luk = new Tovar("лук", 5, 5);

        ct1.addProd(hleb);
        ct1.addProd(bulka);
        ct1.addProd(baton);
        ct2.addProd(moloko);
        ct2.addProd(tvorog);
        ct2.addProd(slivki);
        ct3.addProd(ogyrec);
        ct3.addProd(pomidor);
        ct3.addProd(luk);

        ct1.printAll(ct2,ct3);

        user1.initializeBusket();
        user1.addPurch(hleb,ct1);
        user1.addPurch(moloko,ct2);

        user1.printAllPurch();

        user2.initializeBusket();
        user2.addPurch(luk,ct3);
        user2.addPurch(pomidor,ct3);
        user2.printAllPurch();

        user3.initializeBusket();
        user3.addPurch(ogyrec,ct3);
        user3.addPurch(slivki,ct2);
        user3.printAllPurch();


        ct1.printAll(ct2,ct3);
    }

}