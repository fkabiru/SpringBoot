/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.carMan.Entities;

import java.io.Serializable;

/**
 *
 * @author fkabiru
 */

public class CarDetails implements Serializable {
    private String color;
    private String ingineNo;
    private String yearManufactured;
    
    public CarDetails(){
        
    }

    public CarDetails(String color,String ingineNo,String yearManufactured){
        this.color = color;
        this.ingineNo = ingineNo;
        this.yearManufactured = yearManufactured;
        
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIngineNo() {
        return ingineNo;
    }

    public void setIngineNo(String ingineNo) {
        this.ingineNo = ingineNo;
    }

    public String getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(String yearManufactured) {
        this.yearManufactured = yearManufactured;
    }
    
    
}
