package com.optimisticchemicalmakers.mapfood.dtos;

import java.util.Date;
import java.util.Set;

public class DeliveryOrderDto {

    private String protocol;

    private String storeProtocol;

    private String requestorProtocol;

    private Float endingLatitude;

    private Float endingLongitude;

    private Date estimatedDevliveryTime;

    private Set<DeliveryItemDto> deliveryItems;

    // Constructor

    public DeliveryOrderDto() {}

    // Get Methods

	public String getProtocol() {
		return this.protocol;
	}

	public String getStoreProtocol() {
		return this.storeProtocol;
	}

	public Float getEndingLatitude() {
		return this.endingLatitude;
	}

	public Float getEndingLongitude() {
		return this.endingLongitude;
	}

	public String getRequestorProtocol() {
		return this.requestorProtocol;
	}

	public Date getEstimatedDevliveryTime() {
		return estimatedDevliveryTime;
	}

	// Set Methods

	public Set<DeliveryItemDto> getDeliveryItems() {
		return deliveryItems;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public void setStoreProtocol(String storeProtocol) {
		this.storeProtocol = storeProtocol;
	}

	public void setEndingLatitude(Float endingLatitude) {
		this.endingLatitude = endingLatitude;
	}

	public void setEndingLongitude(Float endingLongitude) {
		this.endingLongitude = endingLongitude;
	}

	public void setRequestorProtocol(String requestorProtocol) {
		this.requestorProtocol = requestorProtocol;
	}

	public void setEstimatedDevliveryTime(Date estimatedDevliveryTime) {
		this.estimatedDevliveryTime = estimatedDevliveryTime;
	}

	public void setDeliveryItems(Set<DeliveryItemDto> deliveryItems) {
		this.deliveryItems = deliveryItems;
	}
   
}
