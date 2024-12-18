package org.models;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Vehicle {
    private String vehicleName = "Mercedes";

    public Vehicle() {
        System.out.println("Vehicle Bean created by spring");
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return this.vehicleName;
    }

}
