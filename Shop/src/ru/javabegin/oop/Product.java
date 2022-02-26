package ru.javabegin.oop;

import java.util.Objects;

public class Product implements Comparable<Product>{

    public String product;
    public int quantity;

    public Product(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() { return product; }
    public void setProduct(String product) {this.product = product;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return quantity == product1.quantity && Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity);
    }
    @Override
    public int compareTo(Product o) {
        return product.compareTo(o.getProduct());
    }
}
