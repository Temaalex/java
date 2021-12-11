package ru.javabegin.oop;



public class Van {

    private static int CAST_ONE_DAY;//стоимость аренды одного вагона на 1 день.
    private static  int LIFTING_CAPACITY_OF_DAY; //грузоподьемность вагона.
    public String typeСargo;

    public Van(int CAST_ONE_DAY, int LIFTING_CAPACITY_OF_DAY, String typeСargo) {
        this.CAST_ONE_DAY = CAST_ONE_DAY;
        this.LIFTING_CAPACITY_OF_DAY = LIFTING_CAPACITY_OF_DAY;
        this.typeСargo = typeСargo;
    }

    public void calculateCargo(int weight, String type, int day){
        if(type == typeСargo){

            int numberOfVan;
            if (weight <= LIFTING_CAPACITY_OF_DAY) {
                numberOfVan = 1;
            } else {
                numberOfVan = weight / LIFTING_CAPACITY_OF_DAY;
            }

            int cast = day * numberOfVan * CAST_ONE_DAY;

            System.out.println("С учетом массы груза " + weight + " кг и типа груза "+"„"+typeСargo+"“"+", Вам понадобиться " + numberOfVan + " вагон(ов).");
            System.out.println("Стоимость аренды на " + day + " дней составит " + cast + " рублей.");
        } else{
            System.out.println("Выберете тип груза: "+typeСargo);
        }

    }
}
