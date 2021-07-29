package com.udp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.udp.models.SchProfileOne;

@Repository
public interface ProfileRepo extends MongoRepository<SchProfileOne, String> {

	public List<SchProfileOne> findAll();

}
