public class Main {
    public static void main(String[] args) {
        // создаем массив
        double [] numbers = new double[20];
        //Перебераем массив и заполняем случайными числами
        for(int i = 0; i < numbers.length; i++) {
            double randomNumber = (double) Math.random()*100;
            numbers[i] = (int)randomNumber;
            System.out.print(numbers[i]+" ");
        }
        //Получаем сумму чисел в массиве
        System.out.println();
        double sum = 0;
        for( double num : numbers) {
            sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
        //Проверяем на четность
        String parity = sum%2==0 ? "ЧЕТНО" : "НЕЧЕТНО";
        System.out.println(parity);
    }
}
