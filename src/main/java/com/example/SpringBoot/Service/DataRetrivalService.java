package com.example.SpringBoot.Service;

import com.example.SpringBoot.model.Redisdata;
import com.example.SpringBoot.model.Redisuserdata;
import com.example.SpringBoot.model.Repository.DataRepository;
import com.example.SpringBoot.model.Repository.redisrepo;
import com.example.SpringBoot.model.Repository.redisrepo1;
import com.example.SpringBoot.model.redisdata2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DataRetrivalService {

    @Autowired
    DataRepository dataRepository;


    @Autowired
    redisrepo redisrepository;

    @Autowired
    redisrepo1 redisrepository1;




    public List<redisdata2> retrival(String hotelids[]) {
        List<redisdata2> hoteldata = new ArrayList<>();
        for (String id : hotelids) {
            Optional<redisdata2> retOpt = redisrepository.findById(id);
            redisdata2 ret = retOpt.orElse(null);
            if (ret != null)
                hoteldata.add(ret);
            else {
                redisdata2 obj = new redisdata2(dataRepository.findById(id));
                redisrepository.save(obj);
                hoteldata.add(obj);
            }
        }
        return hoteldata;
    }


//    public List<Redisdata> userretrival(String hotelids[]) {
//        List<Redisdata> hoteldata = new ArrayList<>();
//        for (String id : hotelids) {
//            Optional<Redisdata> retOpt = redisrepository1.findById(id);
//            Redisdata ret = retOpt.orElse(null);
//            if(ret != null)
//                hoteldata.add(ret);
//
//        }
//        return hoteldata;
//
//    }

    public HashMap<String, HashMap<String, Redisuserdata>> userretrivalmap(String[] hotelids) {
        HashMap<String,HashMap<String,Redisuserdata>> hoteldata = new HashMap<>();
        for (String id : hotelids) {
            Optional<Redisdata> retOpt = redisrepository1.findById(id);
            Redisdata ret = retOpt.orElse(null);
            if(ret != null)
            {
                HashMap<String, Redisuserdata> hm = new HashMap<>();
                List<Redisuserdata>list =ret.getRedisuser();
                for(Redisuserdata data:list) {
                    String uid = data.getUserid();
                    hm.put(uid, data);
                }
                hoteldata.put(id, hm);
            }

        }
        return hoteldata;

    }
}

