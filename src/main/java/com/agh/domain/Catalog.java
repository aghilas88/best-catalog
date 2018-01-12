package com.agh.domain;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author aghilas
 *
 */
@Entity
@Table(name="CAT_CATALOG")
public class Catalog {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotNull
    private String displayName;
	
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "catalog")
    private Set<Category> rootCategories = new HashSet<>();

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
	 * @return the rootCategories
	 */
	public Set<Category> getRootCategories() {
		return rootCategories;
	}

	/**
	 * @param rootCategories the rootCategories to set
	 */
	public void setRootCategories(Set<Category> rootCategories) {
		this.rootCategories = rootCategories;
	}
    
}
