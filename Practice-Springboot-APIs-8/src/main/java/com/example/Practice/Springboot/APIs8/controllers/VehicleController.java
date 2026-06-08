package com.example.Practice.Springboot.APIs8.controllers;

import com.example.Practice.Springboot.APIs8.entities.Vehicle;
import com.example.Practice.Springboot.APIs8.services.VehicleManager;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    private final VehicleManager vehicleManager;

    public VehicleController(VehicleManager vehicleManager) {
        this.vehicleManager = vehicleManager;
    }

    @PostMapping("/add")
    public String createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleManager.addVehicle(vehicle);
    }

    @GetMapping("/list")
    public List<Vehicle> listVehicles() {
        return vehicleManager.getVehicles();
    }
}
