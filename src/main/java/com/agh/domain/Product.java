package com.agh.domain;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author aghilas
 *
 */
@Entity
@Table(name="CAT_PRODUCT")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotNull
    private String displayName;
	
	@ManyToMany(fetch = FetchType.LAZY,  cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "childProducts")
    private Set<Category> parentCategories = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
    private Set<Sku> skus = new HashSet<>();

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the parentCategories
	 */
	public Set<Category> getParentCategories() {
		return parentCategories;
	}

	/**
	 * @param parentCategories the parentCategories to set
	 */
	public void setParentCategories(Set<Category> parentCategories) {
		this.parentCategories = parentCategories;
	}

	/**
	 * @return the skus
	 */
	public Set<Sku> getSkus() {
		return skus;
	}

	/**
	 * @param skus the skus to set
	 */
	public void setSkus(Set<Sku> skus) {
		this.skus = skus;
	}
	
}
