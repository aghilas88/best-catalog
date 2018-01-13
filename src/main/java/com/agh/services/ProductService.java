/**
 * 
 */
package com.agh.services;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.stereotype.Service;

import com.agh.domain.Product;
import com.agh.repositories.ProductRepository;

/**
 * @author aghilas
 *
 */
@Service(value = "productService")
public class ProductService implements IProductService {
	
	@Resource
	private ProductRepository productRepository;

	/* (non-Javadoc)
	 * @see com.agh.services.IProductService#getAllProducts()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Product> getAllProducts() {
		return IteratorUtils.toList(getProductRepository().findAll().iterator());
	}

	/* (non-Javadoc)
	 * @see com.agh.services.IProductService#getProductById(java.lang.Long)
	 */
	@Override
	public Product getProductById(Long id) {
		return getProductRepository().findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.agh.services.IProductService#createProduct(com.agh.domain.Product)
	 */
	@Override
	public Product createProduct(Product product) {
		return getProductRepository().save(product);
	}

	/* (non-Javadoc)
	 * @see com.agh.services.IProductService#updateProduct(com.agh.domain.Product)
	 */
	@Override
	public Product updateProduct(Product product) {
		return getProductRepository().save(product);
	}

	/**
	 * @return the productRepository
	 */
	public ProductRepository getProductRepository() {
		return productRepository;
	}

	/**
	 * @param productRepository the productRepository to set
	 */
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

}
