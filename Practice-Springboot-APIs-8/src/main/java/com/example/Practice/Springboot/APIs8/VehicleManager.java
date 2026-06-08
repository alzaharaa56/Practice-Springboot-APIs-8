package com.example.Practice.Springboot.APIs8;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class VehicleManager {

    private final List<Vehicle> vehicles = new ArrayList<>();

    public VehicleManager() {
        vehicles.add(new Vehicle("V101", "Toyota Corolla", 20.0));
        vehicles.add(new Vehicle("V102", "Nissan Sunny", 18.0));
        vehicles.add(new Vehicle("V103", "Hyundai Elantra", 22.0));
    }

    public String addVehicle(Vehicle vehicle) {

        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equalsIgnoreCase(vehicle.getVehicleId())) {
                return "Vehicle ID already exists\nNo vehicle was added";
            }
        }

        vehicles.add(vehicle);

        return "Vehicle Added Successfully\n" +
                "Vehicle ID: " + vehicle.getVehicleId() + "\n" +
                "Vehicle Model: " + vehicle.getVehicleModel() + "\n" +
                "Rental Price Per Day: " + vehicle.getRentalPricePerDay() + " OMR\n" +
                "Status: Created";
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}

