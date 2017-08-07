package com.cts.shoppingCart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.shoppingCart.model.Amenity;
import com.cts.shoppingCart.repository.AmenityRepository;
import com.cts.shoppingCart.serivices.Intf.IStaticDataService;

@Service
public class StaticDataSerivice implements IStaticDataService {
	
	@Autowired
	private AmenityRepository repo;

	/* (non-Javadoc)
	 * @see com.cts.shoppingCart.serivices.Intf.IStaticDataService#findAmenities()
	 */
	@Override
	public List<Amenity> findAmenities() {
		return repo.findAll();
	}

}
