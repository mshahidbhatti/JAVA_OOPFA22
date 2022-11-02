package com.oop_java.A_Week_07;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle v1;
        ArrayList<Vehicle> vehiclesList=new ArrayList<Vehicle>();

        vehiclesList.add(new Truck());
        vehiclesList.add(new Bus());
        vehiclesList.add(new Bus());
        vehiclesList.add(new Bus());
        vehiclesList.add(new Truck());



        for(Vehicle temp:vehiclesList) {
            temp.applyBrakes();

        }

        int busCounter=0;
        int truckCounter=0;
        for(Vehicle temp:vehiclesList) {
            if(temp instanceof Bus)
                busCounter++;
            if((temp instanceof Truck))  {
                Truck t1=(Truck)temp;
                t1.unload();
                truckCounter++;
            }

        }

        System.out.println("Bus counter:"+busCounter);
        System.out.println("Truck counter"+truckCounter);





      /*  v1=new Bus();
        v1.applyBrakes();

        v1=new Truck();
        v1.applyBrakes();*/


    }
}
