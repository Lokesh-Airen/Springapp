package com.example.SpringBoot.Feature;

import com.example.SpringBoot.model.Redisdata;
import com.example.SpringBoot.model.Redisuserdata;
import com.example.SpringBoot.model.Repository.redisrepo1;
import com.example.SpringBoot.model.redisdata2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;


@Component
public class Hotel_User_btod implements  Features{


//    @Autowired
//    redisrepo1 redisrepository1;


    @Override
    public List<Double> calculate(List<redisdata2> hotels, HashMap<String, HashMap<String , Redisuserdata>> hoteluserdata, String hotelids[], String userid) {
//            HashMap<String, Double> result = new HashMap<>();
        List<Double> l=new ArrayList<>();

        for (String id : hotelids) {
            if(hoteluserdata.containsKey(id)) {
                HashMap<String,Redisuserdata>hm = hoteluserdata.get(id);
                if(hm.containsKey(userid))
                {
                    Redisuserdata data=hm.get(userid);
                    double hotel_user_btod = Double.parseDouble(data.getHoteluserbooking())/ Double.parseDouble(data.getHoteluserclick());

                    l.add(hotel_user_btod);
                }
                else {
                    double y=0;
                    l.add(y);
                }
            }
            else
            {
                double t=0;
                l.add(t);
            }

        }

        return l;
    }
}
