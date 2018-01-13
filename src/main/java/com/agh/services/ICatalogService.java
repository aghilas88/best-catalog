/**
 * 
 */
package com.agh.services;

import java.util.Collection;

import com.agh.domain.Catalog;

/**
 * @author aghilas
 *
 */
public interface ICatalogService {
	
	Collection<Catalog> getAllCatalogs();
	
	Catalog getCatalogById(Long id);
	
	Catalog createCatalog(Catalog catalog);
	
	Catalog updateCatalog(Catalog catalog);
	
	void deleteCatalog(Long id);
	
}
