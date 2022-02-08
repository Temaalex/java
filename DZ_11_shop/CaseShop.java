package ru.javabegin.oop;

import java.util.*;

public class CaseShop {
        Map<Integer, Product> dataShop = new HashMap<>();

        //Метод поиска по артикулу
        public Product lookForBarcode (int x){
            System.out.println("Поиск по артикулу ("+x+"):"+ dataShop.get(x));
            return dataShop.get(x);
        }

        //Сортировка по наименованию
       public void sortName (){
           TreeSet<Product> sortName = new TreeSet<>();
           for (Map.Entry<Integer, Product> i : dataShop.entrySet()) {
               sortName.add(i.getValue());
       }
           System.out.println("Сортировка по наименованию:" + sortName);

    }


}
