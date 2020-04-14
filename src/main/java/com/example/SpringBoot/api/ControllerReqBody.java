package com.example.SpringBoot.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ControllerReqBody
{
    @JsonProperty("hotelreq")
    public controllerreq hotelreq;


    public class controllerreq {

        @JsonProperty("hotelids")
        public String[] hotelids;

        @JsonProperty("userid")
        public String userid;

        @JsonProperty("sortby")
        public String sortby;

        @JsonProperty("city")
        public String city;


        public String[] getHotelids() {
            return hotelids;
        }

        public void setHotelids(String[] hotelids) {
            this.hotelids = hotelids;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getSortby() {
            return sortby;
        }

        public void setSortby(String sortby) {
            this.sortby = sortby;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public controllerreq() {
        }

        public controllerreq(String[] hotelids, String userid, String sortby, String city) {
            this.hotelids = hotelids;
            this.userid = userid;
            this.sortby = sortby;
            this.city = city;
        }
    }





    public controllerreq getHotelreq() {
        return hotelreq;
    }

    public void setHotelreq(controllerreq hotelreq) {
        this.hotelreq = hotelreq;
    }

    public ControllerReqBody() {
    }

    public ControllerReqBody(controllerreq hotelreq) {
        this.hotelreq = hotelreq;
    }
}
