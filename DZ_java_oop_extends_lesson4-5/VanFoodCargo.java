package ru.javabegin.oop;

public class VanFoodCargo extends Van{
    private static final int CAST_ONE_DAY = 6000;//стоимость аренды одного вагона 1500 рублей на 1 день.
    private static final int LIFTING_CAPACITY_OF_DAY = 120; //грузоподьемность вагона 140т.
    public static final String typeСargo = "продукты";

    public VanFoodCargo (){
        super(CAST_ONE_DAY, LIFTING_CAPACITY_OF_DAY, typeСargo);
    }
}
