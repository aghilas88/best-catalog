package com.agh.services;

import java.util.Collection;

import com.agh.domain.Product;

/**
 * @author aghilas
 *
 */
public interface IProductService {
	
	Collection<Product> getAllProducts();
	
	Product getProductById(Long id);
	
	Product createProduct(Product product);
	
	Product updateProduct(Product product);
	
}
