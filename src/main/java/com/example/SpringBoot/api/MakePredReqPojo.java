package com.example.SpringBoot.api;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MakePredReqPojo {

    public PredictionReqBody makepojo(HashMap<String, List<List<Double>>> hm,String cityid)
    {
        List<List<Double>> list=hm.get(cityid);
        PredictionReqBody cleandata=new PredictionReqBody();
        PredictionReqBody.flaskreq2 cdata=new PredictionReqBody.flaskreq2();
        cdata.modelid=cityid;
        cdata.features=list;
        cleandata.hotel=cdata;

        return cleandata;
    }
}
