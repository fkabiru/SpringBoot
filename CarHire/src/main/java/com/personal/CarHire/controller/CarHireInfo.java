/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.CarHire.controller;

import com.personal.CarHire.Entity.CarDetails;
import net.minidev.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
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
    String carCreateUrls = "http://localhost:8081/addCar";

    public CarHireInfo() {
        this.rstmp = new RestTemplate();
    }

    @PostMapping(value = "/clientCreateCar", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> createCar(@RequestBody CarDetails cdtls) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject carJsonObject = new JSONObject();
        carJsonObject.put("color", cdtls.getColor());
        carJsonObject.put("ingineNo", cdtls.getIngineNo());
        carJsonObject.put("yearManufactured", cdtls.getYearManufactured());

        CarDetails cdts = new CarDetails();
        cdts.setIngineNo(cdtls.getIngineNo());
        cdts.setYearManufactured(cdtls.getYearManufactured());

        HttpEntity<String> request = new HttpEntity<>(carJsonObject.toString(),headers);
//        CarDetails crdtls = rstmp.postForObject(carCreateUrls, request, CarDetails.class);
        String response = rstmp.postForObject(carCreateUrls, request, String.class);
        System.out.print("||||****** Now Posting *******|||||");

//        assertThat(response.getStatusCode(), is(HttpStatus.CREATED));
        return new ResponseEntity(response, HttpStatus.OK);
    }

}
