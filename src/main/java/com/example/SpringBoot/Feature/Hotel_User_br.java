package com.example.SpringBoot.Feature;

import com.example.SpringBoot.model.Redisdata;
import com.example.SpringBoot.model.Redisuserdata;
import com.example.SpringBoot.model.Repository.DataRepository;
import com.example.SpringBoot.model.Repository.redisrepo;
import com.example.SpringBoot.model.Repository.redisrepo1;
import com.example.SpringBoot.model.redisdata2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;


@Component
public class Hotel_User_br implements Features{

//    @Autowired
//    redisrepo1 redisrepository1;


//    @Autowired
//    redisrepo redisrepository;



    public List<Double> calculate(List<redisdata2> hotels, HashMap<String, HashMap<String ,Redisuserdata>> hoteluserdata, String hotelids[], String userid) {
//            HashMap<String, Double> result = new HashMap<>();

        List<Double> l=new ArrayList<>();
//        for (String id : hotelids) {
//            Optional<Redisdata> retOpt = redisrepository1.findById(id);
//            Redisdata ret = retOpt.orElse(null);
//            if(ret != null) {
//                String uid = ret.getRedisuser().getUserid();
//                if(uid.equals(userid))
//                {
//                    double hotel_user_br = Double.parseDouble(ret.getRedisuser().getHoteluserbooking())/ Double.parseDouble(ret.getRedisuser().getHoteluserimp());
//                     l.add(hotel_user_br);
//                }
//                else {
//                    double y=0;
//                    l.add(y);
//                }
//            }
//            else
//            {
//                double t=0;
//                l.add(t);
//            }
//
//        }




        for (String id : hotelids) {
            if(hoteluserdata.containsKey(id)) {
                HashMap<String,Redisuserdata>hm = hoteluserdata.get(id);
                if(hm.containsKey(userid))
                {
                    Redisuserdata data=hm.get(userid);
                    double hotel_user_br = Double.parseDouble(data.getHoteluserbooking())/ Double.parseDouble(data.getHoteluserimp());
                    l.add(hotel_user_br);
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

