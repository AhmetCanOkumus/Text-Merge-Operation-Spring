package com.example.yazlab2.repositories;

import com.example.yazlab2.models.Save;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveRepository extends MongoRepository<Save,String> {

}
