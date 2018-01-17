package com.agh.controllers;

import java.util.*;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agh.domain.*;
import com.agh.services.*;

//@RestController @RequestMapping(value ="/catalogs") 
public class CatalogController {
	
	@Resource
	private ICatalogService catalogService;
//	@Resource
//	private ICategoryService categoryService;
//	@Resource
//	private IProductService ProductService;
//	@Resource
//	private ISkuService SkuService;

//	/**
//	 * @return all catalogs
//	 */
//	@RequestMapping(method = RequestMethod.GET)
//	public Collection<Catalog> getAllCatalogs() {
// 	  	return this.catalogService.getAllCatalogs();	
//	}
//	
//	/**
//	 * @param id
//	 * @return
//	 */
//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public Catalog getCatalogById(@PathVariable(value = "id") Long id) {
//   		return this.catalogService.getCatalogById(id);
//	}
//	
//	/**
//	 * create catalog
//	 * @param catalog
//	 * @return
//	 */
//	@RequestMapping(method = RequestMethod.POST)
//	public Catalog createCatalog(@RequestBody Catalog catalog) {
// 		return this.catalogService.createCatalog(catalog);	
//	}
//	
//	/**
//	 * @param id
//	 * @param catalog
//	 * @return
//	 */
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public Catalog updateCatalog(@PathVariable(value = "id") Long id, @RequestBody Catalog catalog) {
//		catalog.setId(id);
// 		return this.catalogService.updateCatalog(catalog);
// 	}
//	
//	/**
//	 * @param id
//	 * @return
//	 */
//	@RequestMapping(value = "/{id}/categories", method = RequestMethod.GET)
//	public Collection<Category> getCategoriesByCatalogId(@PathVariable(value = "id") Long id) {
//		Catalog catalog = this.catalogService.getCatalogById(id);
//		return catalog.getRootCategories();
//	}
	
//	@RequestMapping(value = "/{id}/categories", method = RequestMethod.POST)
//	public Catalog addCategoriesToCatalog(@PathVariable(value = "id") Long id, Collection<Category> categories) {
//		Catalog catalog = this.catalogService.getCatalogById(id);
//		Set<Category> newSet = new HashSet();
//		newSet.addAll(catalog.getRootCategories());
//		newSet.addAll(categories);
//		catalog.setRootCategories(newSet);
//		this.catalogService.updateCatalog(catalog);
//		return catalog;
//	}
	
//
//	/**
//	 * @return the catalogService
//	 */
//	public ICatalogService getCatalogService() {
//		return catalogService;
//	}
//
//	/**
//	 * @param catalogService the catalogService to set
//	 */
//	public void setCatalogService(ICatalogService catalogService) {
//		this.catalogService = catalogService;
//	}

}
