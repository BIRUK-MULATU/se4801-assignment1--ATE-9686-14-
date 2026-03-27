// Student Number: [ATE/9686/14 ]
// Student Name: BIRUK MULATU
package com.shopwave.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super("Product not found with id: " + id);
    }
}
