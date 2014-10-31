package com.packets.exceptionsPack;

/**
 * Created by mihai on 10/30/2014.
 *
 * This is the exception classs thrown by the {@Link com.packets.interfacesPack.IOffRoadVehicle } interface
 */
public class OffRoadVehicleException extends Exception {

    /**
     * Constructorul default
     * @param message
     */
    public OffRoadVehicleException(String message) {super(message);}
}
