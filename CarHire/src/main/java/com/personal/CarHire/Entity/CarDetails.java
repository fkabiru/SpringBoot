/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.CarHire.Entity;

/**
 *
 * @author fkabiru
 */
public class CarDetails {
    
     private String color;
    private String engineNo;
    private String yearManufactured;
    
    public CarDetails(){
        
    }

    public CarDetails(String color,String engineNo,String yearManufactured){
        this.color = color;
        this.engineNo = engineNo;
        this.yearManufactured = yearManufactured;
        
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(String yearManufactured) {
        this.yearManufactured = yearManufactured;
    }
    
    
}
