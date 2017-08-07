package com.cts.shoppingCart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

	@Override
	public Amenity findAmenityByName(final String name) {
		return repo.findAmenityByAmenityName(name);
	}

	@Override
	public Amenity findAmenityById(final Long id) {
		return repo.findAmenityByAmenityId(id);
	}

	@Override
	public HttpStatus updateAmenityById(final Long id,final String name) {
		
		Amenity amenity=repo.findOne(id);
		if(amenity!=null && amenity.getAmenityId()>0){
			try{
				amenity.setAmenityName(name);
				repo.saveAndFlush(amenity);
				return HttpStatus.OK;
			}catch(Exception e){
				return HttpStatus.INTERNAL_SERVER_ERROR;
			}
			
		}else{
			return HttpStatus.NOT_FOUND;
		}
		
	}

}
