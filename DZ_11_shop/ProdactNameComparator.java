package ru.javabegin.oop;

import java.util.Comparator;

public class ProdactNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProduct().compareTo(o2.getProduct());
    }
}
