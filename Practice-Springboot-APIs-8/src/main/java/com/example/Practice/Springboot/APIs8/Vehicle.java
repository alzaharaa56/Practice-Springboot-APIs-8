package com.example.Practice.Springboot.APIs8;

public class Vehicle {
    private String vehicleId;
    private String vehicleModel;
    private double rentalPricePerDay;
    // Constructor empty for Spring Boot JSON Parsing
    public Vehicle() {
    }

    public Vehicle(String vehicleId, String vehicleModel, double rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getVehicleModel() {
        return vehicleModel;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }
    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }
}
