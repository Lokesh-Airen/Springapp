package com.example.SpringBoot.Cleaning;

import com.example.SpringBoot.Feature.*;
import com.example.SpringBoot.model.Redisuserdata;
import com.example.SpringBoot.model.redisdata2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


@Service
public class ModelFeatureCreation {

    public List<List<Double>> featurecreation(List<redisdata2> hoteldetailsdata, HashMap<String, List<String>> modeldata, HashMap<String, HashMap<String, Redisuserdata>> hoteluserdata, String hotelids[], String cityid, String userid,HashMap<String,Features>featureobjectmap) {
        List<String> l = modeldata.get(cityid);
        HashMap<String, List<Double>> featurecallist = new HashMap<>();
        for (int j = 0; j < l.size(); j++) {
            Features f = featureobjectmap.get(l.get(j));
            List<Double> list = f.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
            featurecallist.put(l.get(j), list);

        }


        List<List<Double>> cleanlist = new ArrayList<>();
        for (int i = 0; i < hotelids.length; i++) {
            List<Double> finallist = new ArrayList<>();

            for (int j = 0; j < l.size(); j++) {
                finallist.add(featurecallist.get(l.get(j)).get(i));
            }
            cleanlist.add(finallist);

        }

        return cleanlist;
    }

}