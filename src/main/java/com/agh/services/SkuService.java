/**
 * 
 */
package com.agh.services;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.stereotype.Service;

import com.agh.domain.Sku;
import com.agh.repositories.SkuRepository;

/**
 * @author aghilas
 *
 */
@Service(value = "skuService")
public class SkuService implements ISkuService {
	
	@Resource
	private SkuRepository skuRepository;

	/* (non-Javadoc)
	 * @see com.agh.services.ISkuService#getAllSkus()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Sku> getAllSkus() {
		return IteratorUtils.toList(getSkuRepository().findAll().iterator());
	}

	/* (non-Javadoc)
	 * @see com.agh.services.ISkuService#getSkuById(java.lang.Long)
	 */
	@Override
	public Sku getSkuById(Long id) {
		return getSkuRepository().findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.agh.services.ISkuService#createSku(com.agh.domain.Sku)
	 */
	@Override
	public Sku createSku(Sku sku) {
		return getSkuRepository().save(sku);
	}

	/* (non-Javadoc)
	 * @see com.agh.services.ISkuService#updateSku(com.agh.domain.Sku)
	 */
	@Override
	public Sku updateSku(Sku sku) {
		return getSkuRepository().save(sku);
	}

	/**
	 * @return the skuRepository
	 */
	public SkuRepository getSkuRepository() {
		return skuRepository;
	}

	/**
	 * @param skuRepository the skuRepository to set
	 */
	public void setSkuRepository(SkuRepository skuRepository) {
		this.skuRepository = skuRepository;
	}

}
