package com.example.SpringBoot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Optional;

@RedisHash("redisdata2")
public class redisdata2 implements Serializable
{
    @Id
    @JsonProperty("hotelId")
    public String hotelId;
    @JsonProperty("userid")
    public String userid;
    @JsonProperty("placeid")
    public String placeid;
    @JsonProperty("fprice")
    public String fprice;
    @JsonProperty("hoteltype")
    public String hoteltype;
    @JsonProperty("user_abp")
    public String user_abp;
    @JsonProperty("discount_per")
    public String discount_per;
    @JsonProperty("hotelimp")
    public String hotelimp;
    @JsonProperty("hotelclick")
    public String hotelclick;
    @JsonProperty("hotelbooking")
    public String hotelbooking;

//    @JsonProperty("hoteluserimp")
//    public String hoteluserimp;
//
//    @JsonProperty("hoteluserclick")
//    public String hoteluserclick;
//
//    @JsonProperty("hoteluserbooking")
//    public String hoteluserbooking;

    @JsonProperty("hotelplaceidimp")
    public String hotelplaceidimp;

    @JsonProperty("hotelplaceidclick")
    public String hotelplaceidclick;

    @JsonProperty("hotelplaceidbooking")
    public String hotelplaceidbooking;


    @JsonProperty("usercatimp")
    public String usercatimp;

    @JsonProperty("usercatclick")
    public String usercatclick;

    @JsonProperty("usercatbooking")
    public String usercatbooking;


    @JsonProperty("avg_hotel_btod")
    public String avg_hotel_btod;

    @JsonProperty("recom_score")
    public String recom_score;


    @JsonProperty("ratingcount")
    public String ratingcount;

    @JsonProperty("distance")
    public String distance;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPlaceid() {
        return placeid;
    }

    public void setPlaceid(String placeid) {
        this.placeid = placeid;
    }

    public String getFprice() {
        return fprice;
    }

    public void setFprice(String fprice) {
        this.fprice = fprice;
    }

    public String getHoteltype() {
        return hoteltype;
    }

    public void setHoteltype(String hoteltype) {
        this.hoteltype = hoteltype;
    }

    public String getUser_abp() {
        return user_abp;
    }

    public void setUser_abp(String user_abp) {
        this.user_abp = user_abp;
    }

    public String getDiscount_per() {
        return discount_per;
    }

    public void setDiscount_per(String discount_per) {
        this.discount_per = discount_per;
    }

    public String getHotelimp() {
        return hotelimp;
    }

    public void setHotelimp(String hotelimp) {
        this.hotelimp = hotelimp;
    }

    public String getHotelclick() {
        return hotelclick;
    }

    public void setHotelclick(String hotelclick) {
        this.hotelclick = hotelclick;
    }

    public String getHotelbooking() {
        return hotelbooking;
    }

    public void setHotelbooking(String hotelbooking) {
        this.hotelbooking = hotelbooking;
    }

//    public String getHoteluserimp() {
//        return hoteluserimp;
//    }
//
//    public void setHoteluserimp(String hoteluserimp) {
//        this.hoteluserimp = hoteluserimp;
//    }
//
//    public String getHoteluserclick() {
//        return hoteluserclick;
//    }
//
//    public void setHoteluserclick(String hoteluserclick) {
//        this.hoteluserclick = hoteluserclick;
//    }
//
//    public String getHoteluserbooking() {
//        return hoteluserbooking;
//    }
//
//    public void setHoteluserbooking(String hoteluserbooking) {
//        this.hoteluserbooking = hoteluserbooking;
//    }

    public String getHotelplaceidimp() {
        return hotelplaceidimp;
    }

    public void setHotelplaceidimp(String hotelplaceidimp) {
        this.hotelplaceidimp = hotelplaceidimp;
    }

    public String getHotelplaceidclick() {
        return hotelplaceidclick;
    }

    public void setHotelplaceidclick(String hotelplaceidclick) {
        this.hotelplaceidclick = hotelplaceidclick;
    }

    public String getHotelplaceidbooking() {
        return hotelplaceidbooking;
    }

    public void setHotelplaceidbooking(String hotelplaceidbooking) {
        this.hotelplaceidbooking = hotelplaceidbooking;
    }

    public String getUsercatimp() {
        return usercatimp;
    }

    public void setUsercatimp(String usercatimp) {
        this.usercatimp = usercatimp;
    }

    public String getUsercatclick() {
        return usercatclick;
    }

    public void setUsercatclick(String usercatclick) {
        this.usercatclick = usercatclick;
    }

    public String getUsercatbooking() {
        return usercatbooking;
    }

    public void setUsercatbooking(String usercatbooking) {
        this.usercatbooking = usercatbooking;
    }

    public String getAvg_hotel_btod() {
        return avg_hotel_btod;
    }

    public void setAvg_hotel_btod(String avg_hotel_btod) {
        this.avg_hotel_btod = avg_hotel_btod;
    }

    public String getRecom_score() {
        return recom_score;
    }

    public void setRecom_score(String recom_score) {
        this.recom_score = recom_score;
    }

    public String getRatingcount() {
        return ratingcount;
    }

    public void setRatingcount(String ratingcount) {
        this.ratingcount = ratingcount;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public redisdata2(Optional<Data> byId) {
    }
    public redisdata2() {
    }

    @Override
    public String toString() {
        return "redisdata2{" +
                "hotelId='" + hotelId + '\'' +
                ", userid='" + userid + '\'' +
                ", placeid='" + placeid + '\'' +
                ", fprice='" + fprice + '\'' +
                ", hoteltype='" + hoteltype + '\'' +
                ", user_abp='" + user_abp + '\'' +
                ", discount_per='" + discount_per + '\'' +
                ", hotelimp='" + hotelimp + '\'' +
                ", hotelclick='" + hotelclick + '\'' +
                ", hotelbooking='" + hotelbooking + '\'' +
//                ", hoteluserimp='" + hoteluserimp + '\'' +
//                ", hoteluserclick='" + hoteluserclick + '\'' +
//                ", hoteluserbooking='" + hoteluserbooking + '\'' +
                ", hotelplaceidimp='" + hotelplaceidimp + '\'' +
                ", hotelplaceidclick='" + hotelplaceidclick + '\'' +
                ", hotelplaceidbooking='" + hotelplaceidbooking + '\'' +
                ", usercatimp='" + usercatimp + '\'' +
                ", usercatclick='" + usercatclick + '\'' +
                ", usercatbooking='" + usercatbooking + '\'' +
                ", avg_hotel_btod='" + avg_hotel_btod + '\'' +
                ", recom_score='" + recom_score + '\'' +
                ", ratingcount='" + ratingcount + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }

    public redisdata2(String hotelId, String userid, String placeid, String fprice, String hoteltype, String user_abp, String discount_per, String hotelimp, String hotelclick, String hotelbooking,String hotelplaceidimp, String hotelplaceidclick, String hotelplaceidbooking, String usercatimp, String usercatclick, String usercatbooking, String avg_hotel_btod, String recom_score, String ratingcount, String distance) {
        super();
        this.hotelId=hotelId;
        this.userid = userid;
        this.placeid = placeid;
        this.fprice = fprice;
        this.hoteltype = hoteltype;
        this.user_abp = user_abp;
        this.discount_per = discount_per;
        this.hotelimp = hotelimp;
        this.hotelclick = hotelclick;
        this.hotelbooking = hotelbooking;
//        this.hoteluserimp = hoteluserimp;
//        this.hoteluserclick = hoteluserclick;
//        this.hoteluserbooking = hoteluserbooking;
        this.hotelplaceidimp = hotelplaceidimp;
        this.hotelplaceidclick = hotelplaceidclick;
        this.hotelplaceidbooking = hotelplaceidbooking;
        this.usercatimp = usercatimp;
        this.usercatclick = usercatclick;
        this.usercatbooking = usercatbooking;
        this.avg_hotel_btod = avg_hotel_btod;
        this.recom_score = recom_score;
        this.ratingcount = ratingcount;
        this.distance = distance;

    }

    public redisdata2(Data d) {
        super();
        this.hotelId=d.hotelId;
        this.userid = d.userid;
        this.placeid = d.placeid;
        this.fprice = d.fprice;
        this.hoteltype = d.hoteltype;
        this.user_abp = d.user_abp;
        this.discount_per = d.discount_per;
        this.hotelimp = d.hotelimp;
        this.hotelclick = d.hotelclick;
        this.hotelbooking = d.hotelbooking;
//        this.hoteluserimp = d.hoteluserimp;
//        this.hoteluserclick = d.hoteluserclick;
//        this.hoteluserbooking = d.hoteluserbooking;
        this.hotelplaceidimp = d.hotelplaceidimp;
        this.hotelplaceidclick = d.hotelplaceidclick;
        this.hotelplaceidbooking = d.hotelplaceidbooking;
        this.usercatimp = d.usercatimp;
        this.usercatclick = d.usercatclick;
        this.usercatbooking = d.usercatbooking;
        this.avg_hotel_btod = d.avg_hotel_btod;
        this.recom_score = d.recom_score;
        this.ratingcount = d.ratingcount;
        this.distance = d.distance;

    }
}


