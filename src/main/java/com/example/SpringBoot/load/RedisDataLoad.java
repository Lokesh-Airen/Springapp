package com.example.SpringBoot.load;


import com.example.SpringBoot.model.Data;
import com.example.SpringBoot.model.Redisdata;
import com.example.SpringBoot.model.Redisuserdata;
import com.example.SpringBoot.model.Repository.DataRepository;
import com.example.SpringBoot.model.Repository.redisrepo;
import com.example.SpringBoot.model.Repository.redisrepo1;
import com.example.SpringBoot.model.redisdata2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class RedisDataLoad {
    @Autowired
    DataRepository dataRepository;
//
    @Autowired
    redisrepo redisrepository;
//
    @Autowired
    redisrepo1 redisrepository1;


    @PostConstruct
    @Transactional
    public void loadAll() {
        System.out.println("Loading Data");
        redisrepository1.deleteAll();
        redisrepository1.saveAll(getData());
        System.out.println("Loading Completed");

    }


    public List<Redisdata> getData()
    {
        List<Redisdata> datas = new ArrayList<>();
        Redisuserdata obj1=new Redisuserdata("2275", "26426834", "1500", "12");
        Redisuserdata obj2= new Redisuserdata("3452", "41277", "26426834", "1900");
        Redisuserdata obj3=new Redisuserdata("6799", "2644", "1500", "12");
        Redisuserdata obj4=new Redisuserdata("2276", "26426834", "1500", "12");

        List<Redisuserdata> objarray1=new ArrayList<>();
        List<Redisuserdata> objarray2=new ArrayList<>();

        List<Redisuserdata> objarray3=new ArrayList<>();

        objarray1.add(obj1);
        objarray1.add(obj4);
        objarray2.add(obj2);
        objarray3.add(obj3);


        datas.add(new Redisdata("1234", objarray1));
//        datas.add(new Redisdata("1234", obj4));
        datas.add(new Redisdata("3456", objarray2));
        datas.add(new Redisdata("6789", objarray3));

        return datas;
    }



    @Scheduled(fixedRate = 5000)
    public void redisstore() {
        Iterator iterator = dataRepository.findAll().iterator();
        redisrepository.deleteAll();
//        List<Data>data=getData();
//        Iterator iterator = data.iterator();
        while (iterator.hasNext()) {
            redisdata2 obj = new redisdata2((Data) iterator.next());
            redisrepository.save(obj);
        }

    }



}
