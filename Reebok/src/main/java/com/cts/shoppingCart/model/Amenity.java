package com.cts.shoppingCart.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * The persistent class for the tbl_sms_amenities database table.
 *
 */
@Entity
@Table(name = "tbl_sms_amenities")
public class Amenity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "amenity_id")
	private Long amenityId;

	private Long active;

	@Column(name = "amenity_name")
	private String amenityName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update_date")
	private Date lastUpdateDate;

	@Version
	private Long version;
	

	public Amenity() {
	}

	/**
	 * @return the amenityId
	 */
	public Long  getAmenityId() {
		return amenityId;
	}

	/**
	 * @param amenityId the amenityId to set
	 */
	public void setAmenityId(Long amenityId) {
		this.amenityId = amenityId;
	}

	/**
	 * @return the active
	 */
	public Long getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Long active) {
		this.active = active;
	}

	/**
	 * @return the amenityName
	 */
	public String getAmenityName() {
		return amenityName;
	}

	/**
	 * @param amenityName the amenityName to set
	 */
	public void setAmenityName(String amenityName) {
		this.amenityName = amenityName;
	}

	/**
	 * @return the lastUpdateDate
	 */
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * @param lastUpdateDate the lastUpdateDate to set
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * @return the version
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(Long version) {
		this.version = version;
	}
	
	
}