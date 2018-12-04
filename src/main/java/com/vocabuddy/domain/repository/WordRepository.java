package com.vocabuddy.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vocabuddy.domain.entity.Word;

public interface WordRepository extends MongoRepository<Word, String>{

}
