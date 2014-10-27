package com.packets.carPack;
import java.util.Random;

/**
 * Created by mihai on 10/26/2014.
 *
 *
 * This is the class for Car
 */
public class CarClass
{
    private String nume;
    private String culoare;
    private float greutate;
    private float putere;
    private float pret;
    private int id;


    /**
     * Constructor for Car class
     * @param nume
     * @param culoare
     * @param i
     * @param greutate
     * @param putere
     * @param pret
     */
    public CarClass(String nume, String culoare, int i, float greutate, float putere, float pret) {
        this.nume = nume;
        this.culoare = culoare;
        this.greutate = greutate;
        this.putere = putere;
        this.pret = pret;
        this.id = new Random().nextInt(1000000);
    }

    /**
     * The price for car rises on bad times
     */
    public void criza()
    {
        pret += 10;
        System.out.println("Creste pretul cu 10 unitati!");
    }

    /**
     * getters and setters
     * @return
     */
    public String getNume() {
        return nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public float getGreutate() {
        return greutate;
    }

    public float getPutere() {
        return putere;
    }

    public float getPret() {
        return pret;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public void setPutere(float putere) {
        this.putere = putere;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getId() {
        return id;
    }

}
