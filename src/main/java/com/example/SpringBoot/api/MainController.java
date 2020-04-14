package com.example.SpringBoot.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {


    @Autowired
    Handler handle;





    @RequestMapping(value = "/rank", method = RequestMethod.POST)
    public ControllerRespBody generaterank(@RequestBody ControllerReqBody reqdata) {
        ControllerRespBody m;
        m = handle.getreq(reqdata);
        return m;
    }
}

