package com.agh.repositories;

import org.springframework.data.repository.CrudRepository;
import com.agh.domain.Product;

/**
 * @author aghilas
 *
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
