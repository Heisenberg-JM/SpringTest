package com.exodus.learning.service;

import com.exodus.learning.model.MainModelRequest;



public interface MainService {
    String dataLoad(String mainModelRequest);
    String dataView(String mainModelRequest);
}
