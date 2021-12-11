package ru.javabegin.oop;


//Необходимо реализовать 5-10 классов, которые будут
//описывать объекты предметной области железнодорожной сферы.
//Классы должны иметь поля и методы. Подумайте, для каких методов нужны параметры ссылочного типа


//Возьмите программу из прошлого домашнего задания.
//Подумайте, при каком неверном использовании методы не смогут успешно завершаться.
//Создайте 2-3 своих класса исключений и выбрасывайте их при таком некорректном использовании.
//В Main продемонстрируйте их работу через try-catch.

public class Main {
    public static void main(String[] args) throws NewException {

        Maney maney = new Maney();
        maney.getManey(10000); // Меняйте цифру (maney > 1000)
        //maney.getManey(999);


        dateOrder fuel = new dateOrder();
        fuel.getDateOrder(true);
        //fuel.getDateOrder(false);


        VanAnimalCargo elephant = new VanAnimalCargo();
        elephant.calculateCargo(10, "животные", 500);
        elephant.calculateCargo(30, "продукты", 300);


//        VanLiquidСargo oil = new VanLiquidСargo();
//        oil.calculateCargo(120,"жидкий",12);
//
//        VanDryСargo coal = new VanDryСargo();
//        coal.calculateCargo(300,"сухой",100);
//
//        VanMilitaryCargo torpedoes = new VanMilitaryCargo();
//        torpedoes.calculateCargo(1000,"вооружение",50);
//
//        VanFoodCargo watermelon = new VanFoodCargo();
//        watermelon.calculateCargo(5000,"продукты", 10);
//
//        VanAnimalCargo food = new VanAnimalCargo();
//        food.getFood(0);
//        food.getFood(15);

    }
}
