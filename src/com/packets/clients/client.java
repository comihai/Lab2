package com.packets.clients;

import com.packets.cars.Car;

/**
 * Created by mihai on 10/26/2014.
 *
 * This is the class for client
 */
public class Client {
    private String nume;
    private float buget;
    private int carId;

    /**
     * Constructor for client class
     * @param nume
     * @param buget
     */
    public Client(String nume, float buget) {
        this.nume = nume;
        this.buget = buget;
    }

    /**
     * setters and getters
     * @param buget
     */

    public void setBuget(float buget) {
        this.buget = buget;
    }

    public void setNume(String nume) {
        this.nume = nume;

    }
    public String getNume() {
        return nume;
    }

    public float getBuget() {
        return buget;
    }

    public int getCarId() {
        return carId;
    }

    /**
     * buy method used for buying one car by the client
     * @param c
     */
    public void buy(Car c)
    {
        if(c.getPret() >= this.getBuget())
        {
            System.out.println("Masina costa prea mult!");
        }
        else
        {
            this.carId = c.getId();
        }
    }
}
