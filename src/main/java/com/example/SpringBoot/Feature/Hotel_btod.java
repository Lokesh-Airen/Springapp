package com.example.SpringBoot.Feature;

import com.example.SpringBoot.model.Redisdata;
import com.example.SpringBoot.model.Redisuserdata;
import com.example.SpringBoot.model.redisdata2;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Hotel_btod implements Features {

    @Override
    public List<Double> calculate(List<redisdata2> hotels, HashMap<String,HashMap<String ,Redisuserdata>> hoteluserdata, String hoteids[], String userid) {
//            HashMap<String, Double> result = new HashMap<>();
        List<Double> l=new ArrayList<>();
        for(redisdata2 hotel:hotels) {
            double hotel_btod = Double.parseDouble(hotel.getHotelbooking()) / Double.parseDouble(hotel.getHotelclick());
            l.add(hotel_btod);
        }
        return l;
    }
}
