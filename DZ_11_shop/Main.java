/*Техлид поставил перед нами задачу:
        + необходимо написать некоторое хранилище товаров, к которому предъявляются некоторые требования...

        + 1) Как правило, товар должен молниеносно искаться по артикулу, так как именно его считывает сканер кассира
        2) Необходимо создать метод ежемесячного отчета остатков, с сортировкой товаров по наименованию

        Подумайте, какую лучше конструкцию использовать для обеспечения необходимого функционала. Можно использовать любые сущности Java Collection Framework
        Подумайте, должно ли хранилище товаров выводить отчет или только предоставлять его для дальнейшей работы

        DoD: ссылка на репозиторий с коммит-месседжем "каркас"*/
package ru.javabegin.oop;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Object> product = new HashMap<>();
        List<Product> data= new ArrayList<>();

        //Перечень продуктов и количество
        data.add(new Product("Хлеб", 10));
        data.add(new Product("Пряник", 15));
        data.add(new Product("Пиво", 9));
        data.add(new Product("Коньяк", 5));
        data.remove(2);
        data.add(new Product("Водка", 6));
        for (int i = 0; i < data.size(); i++) {product.put(i, data.get(i));}

        //Выводим перечень продуктов
        System.out.println();
        System.out.println("Перечень продуктов:");
        data.forEach(n -> System.out.println(n));

        //Поиск по артикулу(ключ) (0,1,2,3,4, итд в зависимоти от количества товаров)
        System.out.println();
        int x = 2;  //тут меняем штрихкод
        System.out.println("Поиск по артикулу ("+x+"):");
        System.out.println(product.get(x));

        //Поиск по наименованию товара
        System.out.println();
        System.out.println("Поиск по наименованию товара:");
        String food = "Хлеб";  //Тут пишем наменование товара
        if (data.contains(food) == false) {
            System.out.println(food + " есть в магазине");
        } else {
            System.out.println("Такого товара нету!");
        }

        //Сортировка товаров
        System.out.println();
        System.out.println("Сортировка по остатку:");

        Collections.sort(data, new ProdactNameComparator());
        for (Product str: data) {
            System.out.print(str);
        }
    }
}
