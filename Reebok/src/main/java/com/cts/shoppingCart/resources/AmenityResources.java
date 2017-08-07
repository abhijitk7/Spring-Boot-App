package com.cts.shoppingCart.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.shoppingCart.model.Amenity;
import com.cts.shoppingCart.services.StaticDataSerivice;

@RestController
@RequestMapping("/data/amenities")
public class AmenityResources {
	
	@Autowired
	private StaticDataSerivice service;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Amenity>> findAmenities(){
		return new ResponseEntity<List<Amenity>>(this.service.findAmenities(),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public ResponseEntity<Amenity> findAmenityByName(@PathVariable final String name){
		return new ResponseEntity<Amenity>(this.service.findAmenityByName(name),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public ResponseEntity<Amenity> findAmenityById(@PathVariable final Long id){
		return new ResponseEntity<Amenity>(this.service.findAmenityById(id),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update/{id}/{name}", method = RequestMethod.POST)
	public ResponseEntity<Void> updateAmenityById(@PathVariable final Long id,@PathVariable final String name){
		return new ResponseEntity<>(this.service.updateAmenityById(id, name));
	}

}
