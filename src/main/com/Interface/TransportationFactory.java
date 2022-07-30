package com.Interface;

/**
 * @author
 * @version 1.0
 */
public class TransportationFactory {
    public static Horse getHorse(){
        return new Horse();
    }
    public static Boat getBoat(){
        return new Boat();
    }

}
