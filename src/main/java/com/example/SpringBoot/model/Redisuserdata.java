package com.example.SpringBoot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Redisuserdata")
public class Redisuserdata implements Serializable {

    @Id
    @JsonProperty("userid")
    public String userid;

    @JsonProperty("hoteluserimp")
    public String hoteluserimp;

    @JsonProperty("hoteluserclick")
    public String hoteluserclick;

    @JsonProperty("hoteluserbooking")
    public String hoteluserbooking;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getHoteluserimp() {
        return hoteluserimp;
    }

    public void setHoteluserimp(String hoteluserimp) {
        this.hoteluserimp = hoteluserimp;
    }

    public String getHoteluserclick() {
        return hoteluserclick;
    }

    public void setHoteluserclick(String hoteluserclick) {
        this.hoteluserclick = hoteluserclick;
    }

    public String getHoteluserbooking() {
        return hoteluserbooking;
    }

    public void setHoteluserbooking(String hoteluserbooking) {
        this.hoteluserbooking = hoteluserbooking;
    }

    public Redisuserdata() {
    }

    public Redisuserdata(String userid, String hoteluserimp, String hoteluserclick, String hoteluserbooking) {
        this.userid = userid;
        this.hoteluserimp = hoteluserimp;
        this.hoteluserclick = hoteluserclick;
        this.hoteluserbooking = hoteluserbooking;
    }


}
