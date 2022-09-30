package com.exodus.learning.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("SubMainServiceImpl")
public class SubMainServiceImple implements  MainService {

    @Override
    public String dataView(String mainModelRequest) {
        String status="Success : SUB" + mainModelRequest;
        return status;
    }
    @Override
    public String dataLoad(String mainModelRequest) {
        String status="Success : SUB" + mainModelRequest;
        return status;
    }
}
