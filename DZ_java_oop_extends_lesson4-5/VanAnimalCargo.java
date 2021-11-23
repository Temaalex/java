package ru.javabegin.oop;

public class VanAnimalCargo extends Van{
    private static final int CAST_ONE_DAY = 6423;//стоимость аренды одного вагона 1500 рублей на 1 день.
    private static final int LIFTING_CAPACITY_OF_DAY = 160; //грузоподьемность вагона 140т.
    public static final String typeСargo = "животные";

    public VanAnimalCargo (){
            super(CAST_ONE_DAY, LIFTING_CAPACITY_OF_DAY, typeСargo);
    }
    public void getFood(int food){
        if (food <= 0){
            System.out.println("Животным нужна еда");
        } else {
            System.out.println("Вы заказали еду на "+food+" кг. Еда входит в стоимость.");
        }
    }
}
