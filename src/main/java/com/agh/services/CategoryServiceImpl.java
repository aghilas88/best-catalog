/**
 * 
 */
package com.agh.services;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.stereotype.Service;

import com.agh.domain.Category;
import com.agh.repositories.CategoryRepository;

/**
 * @author aghilas
 *
 */
@Service(value = "categoryService")
public class CategoryServiceImpl implements ICategoryService {
	
	@Resource
	private CategoryRepository categoryRepository;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Category> getAllCategoris() {
		return IteratorUtils.toList(getCategoryRepository().findAll().iterator());
	}

	@Override
	public Category getCategoryById(Long id) {
		return getCategoryRepository().findOne(id);
	}

	@Override
	public Category createCategory(Category category) {
		return getCategoryRepository().save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return getCategoryRepository().save(category);
	}

	@Override
	public void deleteCategory(Long id) {
		getCategoryRepository().delete(id);
		
	}

	/**
	 * @return the categoryRepository
	 */
	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}

	/**
	 * @param categoryRepository the categoryRepository to set
	 */
	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

}
