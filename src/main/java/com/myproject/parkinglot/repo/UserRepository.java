package com.myproject.parkinglot.repo;

import com.myproject.parkinglot.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;


@Repository
public interface UserRepository extends MongoRepository<User, UUID> {
}
