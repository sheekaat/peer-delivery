package com.peer.deliver.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.peer.deliver.model.PeerDelivery;

public interface PeerDeliveryRepository extends MongoRepository<PeerDelivery, Integer>{

}
