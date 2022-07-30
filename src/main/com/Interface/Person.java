package com.Interface;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author
 * @version 1.0
 */
public class Person  {
    private String name;
    private String vehicles;
    public Person(){};
    public Person(String name, String vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        Boat boat = TransportationFactory.getBoat();
        boat.work();
    }
    public void common(){
        Horse horse = TransportationFactory.getHorse();
        horse.work();

    }

}
class A{

}
