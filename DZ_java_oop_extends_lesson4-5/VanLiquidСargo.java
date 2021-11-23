package ru.javabegin.oop;

public class VanLiquidСargo extends Van{
    private static final int CAST_ONE_DAY = 3000;//стоимость аренды одного вагона 3000 рублей на 1 день.
    private static final int LIFTING_CAPACITY_OF_DAY = 120; //грузоподьемность вагона 120т.
    public static final String typeСargo = "жидкий";

    public VanLiquidСargo (){
        super(CAST_ONE_DAY, LIFTING_CAPACITY_OF_DAY, typeСargo);
    }
}

