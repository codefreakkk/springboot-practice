package org.config;

import org.models.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.models")
public class ProjectConfig {

//    @Bean(value = "audiVehicle")
//    Vehicle audiVehicle() {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setVehicleName("Audi");
//        return vehicle;
//    }
//
//    @Bean(value = "hondaVehicle")
//    Vehicle hondaVehicle() {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setVehicleName("Honda");
//        return vehicle;
//    }
}
