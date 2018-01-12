/**
 * 
 */
package com.agh.repositories;

import org.springframework.data.repository.CrudRepository;
import com.agh.domain.Category;

/**
 * @author aghilas
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
