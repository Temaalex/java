package ru.javabegin.oop;


//Необходимо реализовать 5-10 классов, которые будут
//описывать объекты предметной области железнодорожной сферы.
//Классы должны иметь поля и методы. Подумайте, для каких методов нужны параметры ссылочного типа

public class Main {
    public static void main(String[] args) {
        VanLiquidСargo oil = new VanLiquidСargo();
        oil.calculateCargo(120,"жидкий",12);

        VanDryСargo coal = new VanDryСargo();
        coal.calculateCargo(300,"сухой",100);

        VanMilitaryCargo torpedoes = new VanMilitaryCargo();
        torpedoes.calculateCargo(1000,"вооружение",50);

        VanFoodCargo watermelon = new VanFoodCargo();
        watermelon.calculateCargo(5000,"продукты", 10);

        VanAnimalCargo food = new VanAnimalCargo();
        food.getFood(0);
        food.getFood(15);
        VanAnimalCargo elephant = new VanAnimalCargo();
        elephant.calculateCargo(30, "животные", 300);
        elephant.calculateCargo(30, "продукты", 300);

    }
}
