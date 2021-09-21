package com.uni.java.task.controller;

import com.uni.java.task.dto.CarOwnerInfoResponse;
import com.uni.java.task.dto.CarOwnerInfoRequest;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car-owner-info")
public class CarOwnerInfoController {

    @PutMapping
    public CarOwnerInfoResponse changeOwnerInformation(@RequestBody CarOwnerInfoRequest carOwnerInfoRequest) {

        CarOwnerInfoResponse carOwnerInfoResponse = new CarOwnerInfoResponse();

        carOwnerInfoResponse.setCarId(carOwnerInfoRequest.getCarId());
        carOwnerInfoResponse.setCarName(carOwnerInfoRequest.getCarName());
        carOwnerInfoResponse.setOwnerName("Alik");
        carOwnerInfoResponse.setRegistrationCountry("Russia");

        return carOwnerInfoResponse;
    }
}
