/**
 * 
 */
package com.agh.repositories;

import org.springframework.data.repository.CrudRepository;
import com.agh.domain.Sku;

/**
 * @author aghilas
 *
 */
public interface SkuRepository extends CrudRepository<Sku, Long> {

}
