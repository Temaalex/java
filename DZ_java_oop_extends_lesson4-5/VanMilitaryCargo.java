package ru.javabegin.oop;

public class VanMilitaryCargo extends Van{
    private static final int CAST_ONE_DAY = 5000;//стоимость аренды одного вагона 1500 рублей на 1 день.
    private static final int LIFTING_CAPACITY_OF_DAY = 120; //грузоподьемность вагона 140т.
    private static final String typeСargo = "вооружение";

    public VanMilitaryCargo (){
        super(CAST_ONE_DAY, LIFTING_CAPACITY_OF_DAY, typeСargo);
    }
}
