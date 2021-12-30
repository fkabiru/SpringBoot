/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.CarHire.controller;

import com.personal.CarHire.Entity.CarDetails;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author fkabiru
 */
@RestController
public class CarHireInfo {

    RestTemplate rstmp;
    String carCreateUrls = "http://localhost:8085/addCar";

    public CarHireInfo() {
        this.rstmp = new RestTemplate();
    }

    @PostMapping(value = "/clientCreateCar", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> createCar(@RequestBody CarDetails cdtls) {

        System.out.print("----Request : COLOR :" + cdtls.getColor() + ", "
                + "ENGINE:" + cdtls.getEngineNo() + " YEAR :" + cdtls.getYearManufactured());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        CarDetails cdts = new CarDetails();
        cdts.setColor(cdtls.getColor());
        cdts.setEngineNo(cdtls.getEngineNo());
        cdts.setYearManufactured(cdtls.getYearManufactured());

        HttpEntity<CarDetails> request = new HttpEntity<>(cdts, headers);

        String response = rstmp.postForObject(carCreateUrls, request, String.class);
        System.out.print("||||****** Now Posting *******|||||");

//        assertThat(response.getStatusCode(), is(HttpStatus.CREATED));
        return new ResponseEntity(response, HttpStatus.OK);
    }

}
