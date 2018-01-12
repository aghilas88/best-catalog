/**
 * 
 */
package com.agh.repositories;

import org.springframework.data.repository.CrudRepository;
import com.agh.domain.Catalog;

/**
 * @author aghilas
 *
 */
public interface CatalogRepository extends CrudRepository<Catalog, Long> {

}
