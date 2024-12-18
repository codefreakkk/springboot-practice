package org.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String personName;

//  field level DI
//  @Autowired
    private Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person Bean created by spring");
        this.vehicle = vehicle;
    }

//  Setter level DI
//  @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonVehicle() {
        return vehicle.getVehicleName();
    }
}
