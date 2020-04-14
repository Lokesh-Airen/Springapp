package com.example.SpringBoot.model.Repository;
import com.example.SpringBoot.model.Data;
import com.example.SpringBoot.model.redisdata2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;

//public interface redisrepo
////{
////    Map<Object, Object> findAllhotels();
////
////    void add(redisdata2 data);
////
////    void delete(String id);
////
////
////
////}

public interface redisrepo extends CrudRepository<redisdata2, String> {}