// Student Number: [ATE/9686/14 ]
// Student Name: BIRUK MULATU
package com.shopwave.exception;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(Long id) {
        super("Category not found with id: " + id);
    }
}
