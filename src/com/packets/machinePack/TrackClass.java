package com.packets.machinePack;

/**
 * Created by mihai on 10/30/2014.
 * <p/>
 * This is the class for track machine
 */
public class TrackClass extends MachineClass {
    private String name;
    private double wight;
    private boolean hasTurbo;

    /**
     * The default constructor for track class
     *
     * @param capacity
     * @param power
     * @param name
     * @param wight
     * @param hasTurbo
     */
    public TrackClass(float capacity, float power, String name, double wight, boolean hasTurbo) {
        super(capacity, power);
        this.name = name;
        this.wight = wight;
        this.hasTurbo = hasTurbo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public boolean isHasTurbo() {
        return hasTurbo;
    }

    public void setHasTurbo(boolean hasTurbo) {
        this.hasTurbo = hasTurbo;
    }

    @Override
    public boolean usedForRace(String championship) {
        return championship != null && (championship.contains("turbo"));
    }

}
