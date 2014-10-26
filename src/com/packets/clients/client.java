package com.packets.clients;
import com.packets.cars.car;

/**
 * Created by mihai on 10/26/2014.
 */
public class client {
    private String nume;
    private float buget;
    private int carId;


    public client(String nume, float buget) {
        this.nume = nume;
        this.buget = buget;
    }

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

    public void buy(car c)
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
