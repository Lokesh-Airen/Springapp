package com.example.SpringBoot.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PredictionReqBody {

    @JsonProperty("hotel")
    public flaskreq2 hotel;

    public static class flaskreq2 {


        @JsonProperty("modelid")
        public String modelid;

        @JsonProperty("features")
        public List<List<Double>> features;

        public String getModelid() {
            return modelid;
        }

        public void setModelid(String modelid) {
            this.modelid = modelid;
        }

        public List<List<Double>> getFeatures() {
            return features;
        }

        public void setFeatures(List<List<Double>> features) {
            this.features = features;
        }

        public flaskreq2(String modelid, List<List<Double>> features) {
            this.modelid = modelid;
            this.features = features;
        }

        public flaskreq2() {

        }
        }

    public flaskreq2 getHotel() {
        return hotel;
    }

    public void setHotel(flaskreq2 hotel) {
        this.hotel = hotel;
    }

    public PredictionReqBody(flaskreq2 hotel) {
        this.hotel = hotel;
    }

    public PredictionReqBody() {
    }

}
