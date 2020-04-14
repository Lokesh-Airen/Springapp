package com.example.SpringBoot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.List;


@RedisHash("Redisdata")
public class Redisdata implements Serializable {


    @Id
    @JsonProperty("hotelId")
    public String hotelId;


    public List<Redisuserdata> redisuser;
//    public Redisuserdata redisuser;
//
//    public String getHotelId() {
//        return hotelId;
//    }
//
//    public void setHotelId(String hotelId) {
//        this.hotelId = hotelId;
//    }
//
//    public Redisuserdata getRedisuser() {
//        return redisuser;
//    }
//
//    public void setRedisuser(Redisuserdata redisuser) {
//        this.redisuser = redisuser;
//    }
//
//    public Redisdata(String hotelId, Redisuserdata redisuser) {
//        this.hotelId = hotelId;
//        this.redisuser = redisuser;
//    }
//
//    public Redisdata() {
//    }


    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public List<Redisuserdata> getRedisuser() {
        return redisuser;
    }

    public void setRedisuser(List<Redisuserdata> redisuser) {
        this.redisuser = redisuser;
    }

    public Redisdata(String hotelId, List<Redisuserdata> redisuser) {
        this.hotelId = hotelId;
        this.redisuser = redisuser;
    }

    public Redisdata() {
    }
}
