package ru.javabegin.oop;

public class Maney {
    public int getManey(int maney) throws NewException {
        if (maney > 1000){
            System.out.println("Все хорошо, делайте заказ");
        } else {
            throw new NewException();
        }

        return maney;
    }
}
