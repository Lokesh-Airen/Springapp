package com.example.SpringBoot.model.Repository;

import com.example.SpringBoot.model.Redisdata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface redisrepo1 extends CrudRepository<Redisdata,String> {
}
