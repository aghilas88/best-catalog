/**
 * 
 */
package com.agh.services;

import java.util.Collection;

import com.agh.domain.Sku;

/**
 * @author aghilas
 *
 */
public interface ISkuService {
	
	Collection<Sku> getAllSkus();
	
	Sku getSkuById(Long id);
	
	Sku createSku(Sku sku);
	
	Sku updateSku(Sku sku);
	
}
