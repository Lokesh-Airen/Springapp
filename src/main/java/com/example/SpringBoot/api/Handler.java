package com.example.SpringBoot.api;
import com.example.SpringBoot.Cleaning.ModelFeatureMapping;
//import com.example.SpringBoot.Service.CleaningService;
import com.example.SpringBoot.Service.DataRetrivalService;
import com.example.SpringBoot.model.redisdata2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)


@Service
public class Handler {


    @Autowired
    RestTemplate restTemplate;


    @Autowired
    DataRetrivalService dataretrive;

    @Autowired
    PredictionService PredictionService;

    @Autowired
    MakePredReqPojo makePredReqPojo;

    @Autowired
    ModelFeatureMapping modelFeatureMapping;



public ControllerRespBody getreq(ControllerReqBody hoteldata) {
//    FlaskReqBody cleandata = cleaningService.cleaning(hoteldata.hotelreq.hotelids,hoteldata.hotelreq.userid);
    if(hoteldata.hotelreq.sortby.equals("pop")) {
//        FlaskReqBody cleandata = cleaningService.cleaning(hoteldata.hotelreq.hotelids,hoteldata.hotelreq.userid);
        HashMap<String,List<List<Double>>> hm = modelFeatureMapping.cleaningresult(hoteldata.hotelreq.city,hoteldata.hotelreq.hotelids,hoteldata.hotelreq.userid);
        PredictionReqBody cleandata=makePredReqPojo.makepojo(hm,hoteldata.hotelreq.city);
        PredictionResponseBody predictions_score = PredictionService.get_predictions(cleandata);
        return builresp1(predictions_score, hoteldata);
    }
    else
    {
        List<redisdata2> l1=dataretrive.retrival(hoteldata.hotelreq.hotelids);
        return builresp(hoteldata, l1);
    }

}


    public ControllerRespBody builresp(ControllerReqBody hoteldata, List<redisdata2>data)
    {

        HashMap<String, Double> hm = new HashMap<>();
        LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>();
        ArrayList<Double> list = new ArrayList<>();
        if(hoteldata.hotelreq.sortby.equals("price"))
        {
            for (int i = 0; i < hoteldata.hotelreq.hotelids.length; i++) {
                hm.put(hoteldata.hotelreq.hotelids[i], Double.parseDouble(data.get(i).fprice));
            }
        }

        if(hoteldata.hotelreq.sortby.equals("distance"))
        {
            for (int i = 0; i < hoteldata.hotelreq.hotelids.length; i++) {
                hm.put(hoteldata.hotelreq.hotelids[i], Double.parseDouble(data.get(i).distance));
            }
        }
        for (Map.Entry<String, Double> entry : hm.entrySet()) {
            list.add(entry.getValue());
        }

        Collections.sort(list, new Comparator<Double>() {
            public int compare(Double str, Double str1) {
                return (str).compareTo(str1);
            }
        });
        for (Double str : list) {
            for (Map.Entry<String, Double> entry : hm.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }

        List<String>l = new ArrayList<>();
        for (Map.Entry<String, Double> en : sortedMap.entrySet()) {
            l.add(en.getKey());
        }

        ControllerRespBody m=new ControllerRespBody();
        m.rank = new ArrayList<>();

        Iterator iterator = l.iterator();
        while(iterator.hasNext()) {
            m.rank.add((String) iterator.next());
        }
        return m;
    }



    public ControllerRespBody builresp1(PredictionResponseBody scores, ControllerReqBody hoteldata)
    {
        HashMap<String, Double> hm = new HashMap<>();
        LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>();
        ArrayList<Double> list = new ArrayList<>();

        int d=0;
            for (int i = 0; i < hoteldata.hotelreq.hotelids.length; i++) {
                hm.put(hoteldata.hotelreq.hotelids[i], scores.score.get(d));
                d++;
            }



        for (Map.Entry<String, Double> entry : hm.entrySet()) {
            list.add(entry.getValue());
        }

        Collections.sort(list, new Comparator<Double>() {
            public int compare(Double str, Double str1) {
                return (str).compareTo(str1);
            }
        });


        for (Double str : list) {
            for (Map.Entry<String, Double> entry : hm.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }

        List<String>l = new ArrayList<>();
        for (Map.Entry<String, Double> en : sortedMap.entrySet()) {
            l.add(en.getKey());
        }

        Collections.reverse(l);
        ControllerRespBody m=new ControllerRespBody();
        m.rank = new ArrayList<>();

        Iterator iterator = l.iterator();
        while(iterator.hasNext()) {
            m.rank.add((String) iterator.next());
        }
      return m;
    }

}






