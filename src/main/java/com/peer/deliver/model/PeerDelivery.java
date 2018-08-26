package com.peer.deliver.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Shipments")
public class PeerDelivery {
	
	private Integer shippingId;
	private Integer requestorId;
	private Integer travelerId;
	
	public Integer getTravelerId() {
		return travelerId;
	}
	public void setTravelerId(Integer travelerId) {
		this.travelerId = travelerId;
	}
	public Integer getShippingId() {
		return shippingId;
	}
	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}
	public Integer getRequestorId() {
		return requestorId;
	}
	public void setRequestorId(Integer requestorId) {
		this.requestorId = requestorId;
	}
}
