package com.example.SpringBoot.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ControllerRespBody {

    @JsonProperty("rank")
    public List<String> rank;

    public List<String> getRank() {
        return rank;
    }

    public void setRank(List<String> rank) {
        this.rank = rank;
    }

    public ControllerRespBody() {
    }

    public ControllerRespBody(List<String> rank) {
        this.rank = rank;
    }
}
