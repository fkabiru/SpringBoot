/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.carMan.Controllers;

import com.personal.carMan.Services.CarDetails;
import com.personal.carMan.Services.CarDretailService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fkabiru
 */
@RestController
public class CarAvailable {
    
    @Autowired
    CarDretailService crDtls;
            
            
    @GetMapping("/carsAvailable")
    public String availableCars(){
        System.out.print("***RESPONDING****");
        return "No available Cars";
    }
     
    @GetMapping("/allCars")
    public ResponseEntity<List> findAllCars(){
        return new ResponseEntity(crDtls.allCars(),HttpStatus.OK)  ;
    }
    @PostMapping("/addCar")
    public ResponseEntity <List> createOneCar(@RequestBody CarDetails carDtls){
         return new ResponseEntity(crDtls.createCar(carDtls),HttpStatus.OK);
    }
}
