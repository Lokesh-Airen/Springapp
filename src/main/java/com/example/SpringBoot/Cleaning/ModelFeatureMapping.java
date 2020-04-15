package com.example.SpringBoot.Cleaning;

import com.example.SpringBoot.Feature.Feature_Factory;
import com.example.SpringBoot.Feature.Features;
import com.example.SpringBoot.Service.DataRetrivalService;
import com.example.SpringBoot.model.Redisuserdata;
import com.example.SpringBoot.model.redisdata2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ModelFeatureMapping {

    @Autowired
    DataRetrivalService dataRetrivalService;

    @Autowired
    ModelFeatureCreation modelFeatureCreation;

    @Autowired
    Feature_Factory feature_factory;


//    @PostConstruct
//    @Transactional
        public HashMap<String, List<String>> loadAll() {
        HashMap<String, List<String>> modeldata = new HashMap<>();
        System.out.println("Loading Model-feature mapping Data");
        List<String>featureslist=new ArrayList<>();
        featureslist.add("fprice");
        featureslist.add("hoteltype");
        featureslist.add("user_abp");
        featureslist.add("discount_per");
        featureslist.add("hotel_btod");
        featureslist.add("hotel_user_br");
        featureslist.add("hotel_user_ctr");
        featureslist.add("hotel_user_btod");
        featureslist.add("avg_hotel_btod");
        featureslist.add("abp_price_diff");
        featureslist.add("recom_score");
        featureslist.add("ratingcount");
        featureslist.add("hotel_placeid_ctr");
        featureslist.add("hotel_placeid_br");
        featureslist.add("hotel_placeid_dtob");
        featureslist.add("user_cat_ctr");
        featureslist.add("user_cat_br");
        featureslist.add("user_cat_dtob");
        featureslist.add("distance");
        modeldata.put("10",featureslist);
        System.out.println("Loading model mapping Completed");
        return modeldata;
    }


    public HashMap<String,List<List<Double>>> cleaningresult(String cityid,String hotelids[],String userid)
    {
        HashMap<String, List<String>> modeldata=loadAll();
        List<redisdata2> hoteldetailsdata= dataRetrivalService.retrival(hotelids);
        HashMap<String,HashMap<String, Redisuserdata>> hoteluserdata=dataRetrivalService.userretrivalmap(hotelids);
        HashMap<String, Features> featureobjectmap=feature_factory.Featurefactory();
        List<List<Double>> cleanedfeaturelist=modelFeatureCreation.featurecreation(hoteldetailsdata,modeldata,hoteluserdata,hotelids,cityid,userid,featureobjectmap);
        HashMap<String, List<List<Double>>> hm = new HashMap<>();
        hm.put(cityid,cleanedfeaturelist);
        return hm;

    }
}
