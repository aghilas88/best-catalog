package com.agh.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agh.domain.Category;
import com.agh.services.ICategoryService;

//@RestController @RequestMapping(value ="/categories")
public class CategoryController {
	
//	@Resource
//	private ICategoryService categoryService;
//	
//	/**
//	 * @return
//	 */
//	@RequestMapping(method = RequestMethod.GET)
//	public Collection<Category> getAllCategories() {
// 	  	return this.categoryService.getAllCategoris();
//	}
//	
//	/**
//	 * @param id
//	 * @return
//	 */
//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public Category getCatalogById(@PathVariable(value = "id") Long id) {
//   		return this.categoryService.getCategoryById(id);
//	}
//	
//	/**
//	 * @param category
//	 * @return
//	 */
//	@RequestMapping(method = RequestMethod.POST)
//	public Category createCategory(@RequestBody Category category) {
// 		return this.categoryService.createCategory(category);	
//	}
//	
//	/**
//	 * @param id
//	 * @param category
//	 * @return
//	 */
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public Category updatecategory(@PathVariable(value = "id") Long id, @RequestBody Category category) {
//		category.setId(id);
// 		return this.categoryService.updateCategory(category);
// 	}
//	
//	/**
//	 * @return the categoryService
//	 */
//	public ICategoryService getCategoryService() {
//		return categoryService;
//	}
//
//	/**
//	 * @param categoryService the categoryService to set
//	 */
//	public void setCategoryService(ICategoryService categoryService) {
//		this.categoryService = categoryService;
//	}
	
}
