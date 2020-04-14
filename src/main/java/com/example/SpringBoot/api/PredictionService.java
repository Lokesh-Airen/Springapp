package com.example.SpringBoot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@Service
public class PredictionService {




    @Autowired
    RestTemplate restTemplate;


    public PredictionResponseBody get_predictions(PredictionReqBody cleandata) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<PredictionReqBody> entity = new HttpEntity<>(cleandata, headers);
//        System.out.println(flaskreq.toString());

        PredictionResponseBody scores=restTemplate.exchange("http://localhost:5000/getprediction", HttpMethod.POST, entity, PredictionResponseBody.class).getBody();
        return scores;
    }

    }
