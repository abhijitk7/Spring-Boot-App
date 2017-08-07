package com.cts.shoppingCart.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.shoppingCart.model.Amenity;
import com.cts.shoppingCart.services.StaticDataSerivice;

@RestController
@RequestMapping("/data")
public class AmenityResources {
	
	@Autowired
	private StaticDataSerivice service;
	
	@RequestMapping(value = "/amenities", method = RequestMethod.GET)
	public ResponseEntity<List<Amenity>> findAmenities(){
		return new ResponseEntity<List<Amenity>>(this.service.findAmenities(),HttpStatus.OK);
	}

}
