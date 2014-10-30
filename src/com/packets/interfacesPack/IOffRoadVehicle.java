package com.packets.interfacesPack;
import com.packets.exceptionsPack.OffRoadVehicleException;

/**
 * Created by mihai on 10/30/2014.
 *
 * This is the interface for all the machine that are going to race off-road
 */
public interface IOffRoadVehicle {

    /**
     * This is the racing method
     * @throws OffRoadVehicleException
     */
    public void driveOffRoad() throws OffRoadVehicleException;

    public void attendingRoadTypes() throws OffRoadVehicleException;
}
