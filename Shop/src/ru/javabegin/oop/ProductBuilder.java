package ru.javabegin.oop;

public class ProductBuilder {

    public String product;
    public int quantity;

    public Product build(){
        return new Product (product, quantity);
    }

    public String getProduct() {
        return product;
    }

    public ProductBuilder setProduct(String product) {
        this.product = product;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }
}
