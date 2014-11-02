package com.packets;

import com.packets.exceptionsPack.OffRoadVehicleException;
import com.packets.interfacesPack.IOffRoadVehicle;
import com.packets.machinePack.CarClass;
import com.packets.machinePack.MachineClass;
import com.packets.machinePack.MotorcycleClass;
import com.packets.machinePack.TrackClass;

/**
 * Created by mihai on 10/26/2014.
 * <p/>
 * This the main class of the project. It is also the entry point of the application.
 */
public class Main {
    public static void main(String[] args){

        IOffRoadVehicle offVehicle = new CarClass("Bmw", "rosu", 100, 120, 500, 100);
        MachineClass moto = new MotorcycleClass(120, 230, "kawasaki", "albastru");
        CarClass car = new CarClass(null, null, 0, 0, 0, 0);
        MachineClass normalCar = new CarClass(null, null, 0, 0, 0, 0);
        MachineClass truck = new TrackClass(200,230,"john deer",678.9,true);

        try {
            offVehicle.driveOffRoad();
        } catch (OffRoadVehicleException e) {
            System.out.println("Exception : "+e.getMessage());
        }

        try {
            ((IOffRoadVehicle) moto).driveOffRoad();
            ((IOffRoadVehicle) moto).attendingRoadTypes();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            car.driveOffRoad();

        } catch (OffRoadVehicleException e) {
            System.out.println("Exception : " + e.getMessage());
        }
        car.setName("Audi A6 convertible");
        car.setColor("blue");

        System.out.println("Is a convertible car?\n" + (car.isConvertible() ? "Yes!" : "No!"));


        System.out.println("Is a racing truck?\n" + ((((TrackClass) truck).isHasTurbo() ? "Yes.It is!" : "No!" )));
        System.out.println("Is a truck that is designed for use over rough terrain?\n" + ((( truck).designedForUseOverRoughTerrain() ? "Yes.It is!" : "No!" )));
    }
}