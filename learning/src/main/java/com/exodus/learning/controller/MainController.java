package com.exodus.learning.controller;

import com.exodus.learning.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.exodus.learning.model.MainModelRequest;

import java.lang.reflect.Array;

@RestController
public class MainController {

    @Autowired
    @Qualifier("MainServiceImpl")
    MainService mainService;

    @Autowired
    @Qualifier("SubMainServiceImpl")
    MainService submainService;


    @RequestMapping(path = "/add/data")
    @ResponseBody()
    public String putData(){
        String Status = mainService.dataLoad("MAIN");
                return Status;
    }


    @RequestMapping(path = "/view/data")
    @ResponseBody()
    public String viewData(){
        String Status = submainService.dataLoad("SUB-MAIN");
        return Status;
    }

}
