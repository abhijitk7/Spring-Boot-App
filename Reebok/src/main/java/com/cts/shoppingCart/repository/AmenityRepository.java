package com.cts.shoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.shoppingCart.model.Amenity;

public interface AmenityRepository extends JpaRepository<Amenity, Long> {
	

}
