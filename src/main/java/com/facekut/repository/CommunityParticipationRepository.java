package com.facekut.repository;

import com.facekut.repository.model.CommunityParticipation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommunityParticipationRepository extends MongoRepository<CommunityParticipation, String> {
}
