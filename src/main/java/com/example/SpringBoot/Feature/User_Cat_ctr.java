package com.example.SpringBoot.Feature;

import com.example.SpringBoot.model.Redisdata;
import com.example.SpringBoot.model.Redisuserdata;
import com.example.SpringBoot.model.redisdata2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User_Cat_ctr implements  Features {


    @Override
    public List<Double> calculate(List<redisdata2> hotels, HashMap<String, HashMap<String , Redisuserdata>> hoteluserdata, String hoteids[], String userid) {
//            HashMap<String, Double> result = new HashMap<>();
        List<Double> l=new ArrayList<>();
        for(redisdata2 hotel : hotels) {
            double user_cat_ctr = Double.parseDouble(hotel.getUsercatclick())/ Double.parseDouble(hotel.getUsercatimp());
            l.add(user_cat_ctr);
        }
        return l;
    }
}
