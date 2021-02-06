package com.facekut.repository;

import com.facekut.repository.model.Relationship;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RelationshipRepository extends MongoRepository<Relationship, String> {
}
