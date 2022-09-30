package com.exodus.learning.service;

import com.exodus.learning.model.MainModelRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("MainServiceImpl")
public class MainServiceImpl implements  MainService {

    @Override
    public String dataLoad(String mainModelRequest) {
        String status="Success : MAIN" + mainModelRequest;
        return status;
    }

    @Override
    public String dataView(String mainModelRequest) {
        String status="Success : MAIN" + mainModelRequest;
        return status;
    }

}
