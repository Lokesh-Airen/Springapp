package com.example.SpringBoot.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PredictionResponseBody {

//    public int hotelId;
    @JsonProperty("score")
    public List<Double> score;

//    public int getHotelId() {
//        return hotelId;
//    }
//
//    public void setHotelId(int hotelId) {
//        this.hotelId = hotelId;
//    }


    public List<Double> getScore() {
        return score;
    }

    public void setScore(List<Double> score) {
        this.score = score;
    }

    public PredictionResponseBody(List<Double> score) {
        this.score = score;
    }

    public PredictionResponseBody() {
    }


}
