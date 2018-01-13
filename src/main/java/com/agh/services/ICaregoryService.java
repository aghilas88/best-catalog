package com.agh.services;

import java.util.Collection;

import com.agh.domain.Category;

/**
 * @author aghilas
 *
 */
public interface ICaregoryService {
	
	Collection<Category> getAllCategoris();
	
	Category getCategoryById(Long id);
	
	Category createCategory(Category category);
	
	Category updateCategory(Category category);
	
	void deleteCategory(Long id);
	
}
