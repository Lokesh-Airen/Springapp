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

    public List<List<Double>> featurecreation(List<redisdata2> hoteldetailsdata, HashMap<String, List<String>> modeldata, HashMap<String, HashMap<String, Redisuserdata>> hoteluserdata, String hotelids[], String cityid, String userid) {
//List<String> l=modeldata.get(cityid);
//        Iterator iterator = l.iterator();
//        while(iterator.hasNext()) {
//            m.rank.add((String) iterator.next());
//        }
        Features hotelbtod = new Hotel_btod();
        Features hoteluserbr = new Hotel_User_br();
        Features hoteluserctr = new Hotel_User_ctr();
        Features hoteluserbtod = new Hotel_User_btod();
        Features hotelplaceidbr = new Hotel_Placeid_br();
        Features hotelplaceidctr = new Hotel_Placeid_ctr();
        Features hotelplaceiddtob = new Hotel_Placeid_dtob();
        Features usercatbr = new User_Cat_br();
        Features usercatctr = new User_Cat_ctr();
        Features usercatdtob = new User_Cat_dtob();


        List<Double> hotelbtodcal = hotelbtod.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
        List<Double> hoteluserbrcal = hoteluserbr.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
        List<Double> hoteluserctrcal = hoteluserctr.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
        List<Double> hoteluserbtodcal = hoteluserbtod.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
        List<Double> hotelplaceidbrcal = hotelplaceidbr.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
        List<Double> hotelplaceidctrcal = hotelplaceidctr.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
        List<Double> hotelplaceiddtobcal = hotelplaceiddtob.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
        List<Double> usercatctrcal = usercatctr.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
        List<Double> usercatbrcal = usercatbr.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
        List<Double> usercatdtobcal = usercatdtob.calculate(hoteldetailsdata, hoteluserdata, hotelids, userid);
//        List<Double> l = new ArrayList<>();
        List<List<Double>> cleanlist = new ArrayList<>();
        int i = 0;
        for (redisdata2 data : hoteldetailsdata) {
            List<Double>l= new ArrayList<>();
            l.add(Double.parseDouble(data.fprice));
            l.add(Double.parseDouble(data.hoteltype));
            l.add(Double.parseDouble(data.user_abp));
            l.add(Double.parseDouble(data.discount_per));
            l.add(hotelbtodcal.get(i));
            l.add(hoteluserbrcal.get(i));
            l.add(hoteluserctrcal.get(i));
            l.add(hoteluserbtodcal.get(i));
            l.add(Double.parseDouble(data.avg_hotel_btod));
            l.add(Double.parseDouble(data.fprice )- Double.parseDouble(data.user_abp));
            l.add(Double.parseDouble(data.recom_score));
            l.add(Double.parseDouble(data.ratingcount));
            l.add(hotelplaceidctrcal.get(i));
            l.add(hotelplaceidbrcal.get(i));
            l.add(hotelplaceiddtobcal.get(i));
            l.add(usercatctrcal.get(i));
            l.add(usercatbrcal.get(i));
            l.add(usercatdtobcal.get(i));
            l.add(Double.parseDouble(data.distance));


            i++;
            cleanlist.add(l);
        }
        return cleanlist;
    }

}