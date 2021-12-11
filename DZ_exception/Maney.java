package ru.javabegin.oop;

public class Maney {
    public void getManey(int maney) throws NewException {
        if (maney > 1000){
            System.out.println("Все хорошо, делайте заказ");
        } else {
            throw new NewException();
        }
    }
}
