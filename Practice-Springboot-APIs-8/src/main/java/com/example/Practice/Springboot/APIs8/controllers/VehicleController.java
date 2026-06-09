package com.example.Practice.Springboot.APIs8.controllers;
import com.example.Practice.Springboot.APIs8.entities.Vehicle;
import com.example.Practice.Springboot.APIs8.services.VehicleManager;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    @Autowired
    private VehicleManager vehicleManager;
    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleManager.getAllVehicles();
    }
    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(@Valid @RequestBody Vehicle vehicle) {
        Vehicle savedVehicle = vehicleManager.addVehicle(vehicle);
        return new ResponseEntity<>(savedVehicle, HttpStatus.CREATED);
    }
}