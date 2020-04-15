package com.example.SpringBoot.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class Feature_Factory {

    @Autowired
    Fprice fprice;

    @Autowired
    Hotel_type hotel_type;

    @Autowired
    User_abp user_abp;

    @Autowired
    Discount_per discount_per;

    @Autowired
    Hotel_btod hotel_btod;

    @Autowired
    Hotel_User_br hotelUserBr;

    @Autowired
    Hotel_User_ctr hotelUserCtr;

    @Autowired
    Hotel_User_btod hotelUserBtod;

    @Autowired
    Avg_hotel_btod avg_hotel_btod;

    @Autowired
    Abp_price_diff abp_price_diff;

    @Autowired
    Recom_score recom_score;

    @Autowired
    RatingCount ratingCount;

    @Autowired
    Hotel_Placeid_ctr hotel_placeid_ctr;

    @Autowired
    Hotel_Placeid_br hotel_placeid_br;

    @Autowired
    Hotel_Placeid_dtob hotel_placeid_dtob;

    @Autowired
    User_Cat_ctr user_cat_ctr;

    @Autowired
    User_Cat_br user_cat_br;

    @Autowired
    User_Cat_dtob user_cat_dtob;

    @Autowired
    Distance distance;




    public HashMap<String,Features> Featurefactory()
    {
        HashMap<String,Features> hm=new HashMap<>();
        hm.put("fprice",fprice);
        hm.put("hoteltype",hotel_type);
        hm.put("user_abp",user_abp);
        hm.put("discount_per",discount_per);
        hm.put("hotel_btod",hotel_btod);
        hm.put("hotel_user_br",hotelUserBr);
        hm.put("hotel_user_ctr",hotelUserCtr);
        hm.put("hotel_user_btod",hotelUserBtod);
        hm.put("avg_hotel_btod",avg_hotel_btod);
        hm.put("abp_price_diff",abp_price_diff);
        hm.put("recom_score",recom_score);
        hm.put("ratingcount",ratingCount);
        hm.put("hotel_placeid_ctr",hotel_placeid_ctr);
        hm.put("hotel_placeid_br",hotel_placeid_br);
        hm.put("hotel_placeid_dtob",hotel_placeid_dtob);
        hm.put("user_cat_ctr",user_cat_ctr);
        hm.put("user_cat_br",user_cat_br);
        hm.put("user_cat_dtob",user_cat_dtob);
        hm.put("distance",distance);
        return hm;
    }


}
