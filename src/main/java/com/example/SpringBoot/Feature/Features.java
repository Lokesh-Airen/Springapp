package com.example.SpringBoot.Feature;

import com.example.SpringBoot.model.Redisdata;
import com.example.SpringBoot.model.Redisuserdata;
import com.example.SpringBoot.model.redisdata2;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public interface Features {


    public List<Double> calculate(List<redisdata2> hotels, HashMap<String,HashMap<String, Redisuserdata>> hoteluserdata, String hoteids[], String userid);

}
