package com.fmi.store.services;

import com.fmi.store.model.Product;

public class ProductService {
    private static Product[] listOfProducts = new Product[4];

    private static ProductService ourInstance = new ProductService();

    public static ProductService getInstance() {
        return ourInstance;
    }

    private ProductService() {
        //  Private constructor
        listOfProducts[0] = new listOfProducts(1,"Ioana","password");
        listOfProducts[1] = new listOfProducts(2,"Adelin","password");
        listOfProducts[2] = new listOfProducts(3,"Marcu","password");
        listOfProducts[3] = new listOfProducts(4,"Doru","password");
    }

    public Product getOne(String name){
        /* TODO implement - to find user by username */
        for (Product product:
                listOfProducts) {
            if(name == product.getName()){
                return product;
            }
        }
    }
}
