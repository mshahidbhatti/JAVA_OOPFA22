package com.oop_java.A_Week_07;

public class Truck extends LoadingVehicles{

    @Override
    public void maximumLoad(){

    }

    @Override
    public void steer(){

    }

    @Override
    public void applyBrakes(){
        System.out.println("Apply brakes function of truck is called");
    }

    public void unload(){
        System.out.println("Unload");
    }

}
