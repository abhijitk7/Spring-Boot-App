package com.cts.shoppingCart.serivices.Intf;

import java.util.List;

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
}
