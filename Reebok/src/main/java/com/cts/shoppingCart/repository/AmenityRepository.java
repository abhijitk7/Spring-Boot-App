package com.cts.shoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.cts.shoppingCart.model.Amenity;

public interface AmenityRepository extends JpaRepository<Amenity, Long> {

	/**
	 * @param name
	 * @return
	 */
	Amenity findAmenityByAmenityName(@Param(value = "name") String name);
	
	/**
	 * @param id
	 * @return
	 */
	Amenity findAmenityByAmenityId(@Param(value = "id") Long id);
	
	
	

}
