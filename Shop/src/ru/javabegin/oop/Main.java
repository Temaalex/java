/*Техлид поставил перед нами задачу:
        + необходимо написать некоторое хранилище товаров, к которому предъявляются некоторые требования...

        + 1) Как правило, товар должен молниеносно искаться по артикулу, так как именно его считывает сканер кассира
        + 2) Необходимо создать метод ежемесячного отчета остатков, с сортировкой товаров по наименованию

        Подумайте, какую лучше конструкцию использовать для обеспечения необходимого функционала. Можно использовать любые сущности Java Collection Framework
        Подумайте, должно ли хранилище товаров выводить отчет или только предоставлять его для дальнейшей работы

        DoD: ссылка на репозиторий с коммит-месседжем "каркас"*/
package ru.javabegin.oop;

import static javax.swing.UIManager.put;

public class Main {

    public static void main(String[] args) {
        //Перечень продуктов и количество
 //       CaseShop caseShop = new CaseShop();
//        caseShop.dataShop.put(1, new Product("Хлеб", 10));
//        caseShop.dataShop.put(2, new Product("Водка", 1553));
//        caseShop.dataShop.put(3, new Product("Бренди", 1500));

        CaseShop caseShop = new CaseShop();
        caseShop.dataShop.put(1, new ProductBuilder()
                    .setProduct("Хлеб")
                    .setQuantity(10)
                    .build());
        caseShop.dataShop.put(1, new ProductBuilder()
                    .setProduct("Водка")
                    .setQuantity(1553)
                    .build());
        caseShop.dataShop.put(1, new ProductBuilder()
                    .setProduct("Бренди")
                    .setQuantity(1500)
                    .build());



        //Получаем перечень продуктов
        System.out.println("Получаем перечень продуктов: "+caseShop.dataShop);

        //Поиск по артикулу
        caseShop.lookForBarcode(2);

        //Сортировка по наименованию
        caseShop.sortName();
    }
}
