package com.peer.deliver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peer.deliver.dao.PeerDeliveryRepository;
import com.peer.deliver.model.PeerDelivery;

@Service
public class PeerDeliveryService {
	
	@Autowired
	private PeerDeliveryRepository peerDeliveryRepo;
	
	public PeerDelivery acceptDelivery(PeerDelivery peerDel) {
		/**
		 * This operation adds a traveler unique id value into the shipments collection shipments id
		 */
		return peerDeliveryRepo.save(peerDel);
	}

}
