package com.packets.machinePack;

import com.packets.interfacesPack.IOffRoadVehicle;

/**
 * Created by mihai on 10/30/2014.
 * <p/>
 * This class is the class for motorcycle
 */
public class MotorcycleClass extends MachineClass implements IOffRoadVehicle {
    private String name;
    private String color;

    public MotorcycleClass(float capacity, float power, String name, String color) {
        super(capacity, power);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean usedForRace(String championship) {
        return championship != null && (championship.contains("off-road"));
    }

    @Override
    public void driveOffRoad() {
        if(getPower() > 450 && getName() != null){
            System.out.println("This machine motor is intended for off-road racing!");
        }
        else
        {
            System.out.println("This machine motor is not intended for off-road racing!");
        }
    }

    @Override
    public void attendingRoadTypes() {
        if(getPower() > 500)
        {
            System.out.println("The roadside area must be free from obstacles and dangerous slopes.");
        }
        else
        {
            System.out.println("Stop and regain vehicle control within 9 meters.");
        }
    }
}
