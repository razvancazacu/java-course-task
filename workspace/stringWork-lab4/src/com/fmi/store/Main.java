package com.fmi.store;

import com.fmi.store.model.FoodProduct;
import com.fmi.store.model.Product;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here

        Product product = new Product();
        product.setName("Product Object");
        product.setSmallDescription("This is a small description");

        FoodProduct foodProduct = new FoodProduct();
        foodProduct.setName("Food Product Object");

        System.out.println(product.getName() + "\n" + foodProduct.getName());

        Product foodProductInherited = new FoodProduct();
        foodProductInherited.setName("Food Product Object Inherited");

        Product productClone = (Product)product.clone();
        System.out.println(productClone.getName() + "\n" + productClone.getSmallDescription());

    }
}
