package com.cts.shoppingCart.serivices.Intf;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.cts.shoppingCart.model.Amenity;

/**
 * @author admin
 *
 */
public interface IStaticDataService {

	/**
	 * @return
	 */
	List<Amenity> findAmenities();
	
	/**
	 * @param name
	 * @return
	 */
	Amenity findAmenityByName(final String name);
	
	/**
	 * @param id
	 * @return
	 */
	Amenity findAmenityById(final Long id);
	
	
	/**
	 * @param id
	 */
	HttpStatus updateAmenityById(final Long id,final String name);
}
