package com.service;

import com.bean.DTO.InnerUserDTO;
import com.mapper.UserMgrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserMgrServices {

    @Autowired
    UserMgrMapper userMgrMapper;

    @Autowired
    MongoTemplate mongoTemplate;

    public void addCar(String car) {

    }

    public InnerUserDTO getInnerUsers (String innerUserId) {
        return userMgrMapper.getById(innerUserId);
    }
//
//    public () {
//
//    }

}
