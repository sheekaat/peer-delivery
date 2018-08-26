package com.peer.deliver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.peer.deliver.model.PeerDelivery;
import com.peer.deliver.service.PeerDeliveryService;

@RestController
public class PeerDeliveryController {
	
	@Autowired
	private PeerDeliveryService peerDelService;
	
	@PostMapping(path="/acceptDelivery", consumes="", produces="")
	public PeerDelivery acceptPeerDelivery(@RequestBody PeerDelivery peerDel) {
		return peerDelService.acceptDelivery(peerDel);
	}

}
