package ru.javabegin.oop;

public class VanDryСargo extends Van{
    private static final int CAST_ONE_DAY = 1500;//стоимость аренды одного вагона 1500 рублей на 1 день.
    private static final int LIFTING_CAPACITY_OF_DAY = 140; //грузоподьемность вагона 140т.
    public static final String typeСargo = "сухой";

    public VanDryСargo (){
        super(CAST_ONE_DAY, LIFTING_CAPACITY_OF_DAY, typeСargo);
    }
}
