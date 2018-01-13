/**
 * 
 */
package com.agh.services;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.stereotype.Service;

import com.agh.domain.Catalog;
import com.agh.repositories.CatalogRepository;

/**
 * @author aghilas
 *
 */
@Service(value = "catalogService")
public class CatalogServiceImpl implements ICatalogService {

	@Resource
	private CatalogRepository catalogRepository;
	
	/* (non-Javadoc)
	 * @see com.agh.services.ICatalogService#getAllCatalogs()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Catalog> getAllCatalogs() {
		return IteratorUtils.toList(getCatalogRepository().findAll().iterator());
	}

	/* (non-Javadoc)
	 * @see com.agh.services.ICatalogService#getCatalogById(java.lang.Long)
	 */
	@Override
	public Catalog getCatalogById(Long id) {
		return getCatalogRepository().findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.agh.services.ICatalogService#createCatalog(com.agh.domain.Catalog)
	 */
	@Override
	public Catalog createCatalog(Catalog catalog) {
		return getCatalogRepository().save(catalog);
	}

	/* (non-Javadoc)
	 * @see com.agh.services.ICatalogService#updateCatalog(com.agh.domain.Catalog)
	 */
	@Override
	public Catalog updateCatalog(Catalog catalog) {
		return getCatalogRepository().save(catalog);
	}

	/* (non-Javadoc)
	 * @see com.agh.services.ICatalogService#deleteCatalog(java.lang.Long)
	 */
	@Override
	public void deleteCatalog(Long id) {
		getCatalogRepository().delete(id);
	}

	/**
	 * @return the catalogRepository
	 */
	public CatalogRepository getCatalogRepository() {
		return catalogRepository;
	}

	/**
	 * @param catalogRepository the catalogRepository to set
	 */
	public void setCatalogRepository(CatalogRepository catalogRepository) {
		this.catalogRepository = catalogRepository;
	}

}
