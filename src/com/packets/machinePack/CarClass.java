package com.packets.machinePack;

import com.packets.exceptionsPack.OffRoadVehicleException;
import com.packets.interfacesPack.IOffRoadVehicle;

import java.util.Random;

/**
 * Created by mihai on 10/26/2014.
 * <p/>
 * <p/>
 * This is the class for Car
 */
public class CarClass extends MachineClass implements IOffRoadVehicle {
    private String name;
    private String color;
    private float weight;
    private float price;
    private int id;
    private boolean isConvertible = false;


    /**
     * Constructor for Car class
     *
     * @param name
     * @param color
     * @param weight
     * @param price
     */
    public CarClass(String name, String color, float weight, float price, int capacity, int power) {
        super(capacity, power);
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.id = new Random().nextInt(1000000);

        checkIfConvertible();

    }

    /**
     * The price for car rises on bad times
     */
    public void criza() {
        price += 10;
        System.out.println("Creste pretul cu 10 unitati!");
    }

    /**
     * getters and setters
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    public float getPrice() {
        return price;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
        checkIfConvertible();
    }

    public void setColor(String culoare) {
        this.color = color;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        checkIfConvertible();
    }

    public void setPrice(float pret) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void checkIfConvertible() {
        isConvertible = getName() != null && getWeight() <= 200 && getName().contains("convertible");
    }

    @Override
    public void driveOffRoad() throws OffRoadVehicleException {
        if (getName() == null)
            throw new OffRoadVehicleException("The name of the car is undefined!");

        System.out.println(getName() + " is driving over rough terrain!");
    }

    @Override
    public void attendingRoadTypes() throws OffRoadVehicleException {
        if(getPower() ==0 && getCapacity() < 50)
            throw new OffRoadVehicleException("This vechile is too low!");

        System.out.println(getName() + "has a power of "+getPower()+"units!");
    }

    @Override
    public boolean usedForRace(String championship) {

        return championship != null && (championship.contains("4x4"));

    }
}
