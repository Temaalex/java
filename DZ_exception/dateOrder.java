package ru.javabegin.oop;

public class dateOrder{
    public void getDateOrder(boolean fuel) throws NewException {
        if (fuel == true ){
            System.out.println("Есть топливо!");
        } else {
            throw new NewException();
        }

    }
}
