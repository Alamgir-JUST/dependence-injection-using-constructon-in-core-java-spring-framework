/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Alamgir.Autowire;

/**
 *
 * @author Alamgir Hossain
 */
public class Address {
    private String area;
    private String district;
    private String country;
    
    public Address(String area, String district, String country){
        this.area = area;
        this.district = district;
        this.country = country;
    }
    
    @Override
    public String toString(){
        return area+" "+district+" "+country;
    }
}
