package com.zjh.test;

import com.zjh.pojo.Vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("摩托",80,2000);
        System.out.println(vehicle);
        vehicle.risePrice(588.8);
        System.out.println(vehicle);
        vehicle.cutPrice(100);
        System.out.println(vehicle);
    }
}
