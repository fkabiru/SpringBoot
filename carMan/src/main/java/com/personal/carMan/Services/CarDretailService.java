/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.carMan.Services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author fnkab
 */

@Service
public class CarDretailService {
    
    private List carDetailsList;
    private CarDetails crDtls;
    
    public CarDretailService(){
        carDetailsList = new ArrayList<>();
        crDtls = new CarDetails();
    }
    

    public List getCarDetailsList() {
        return carDetailsList;
    }

    public void setCarDetailsList(List carDetailsList) {
        this.carDetailsList = carDetailsList;
    }
    
    public List<CarDetails> allCars(){
       
        
        return carDetailsList;
    }
    public List<CarDetails> createCar(CarDetails carDt){
        crDtls.setEngineNo(carDt.getEngineNo());
        crDtls.setYearManufactured(carDt.getYearManufactured());
        System.out.print("***New Car "+crDtls.getEngineNo()+" "+crDtls.getYearManufactured());
        carDetailsList.add(crDtls);
        return carDetailsList;
    }
    
}
