package com.example.Practice.Springboot.APIs8.repositories;

import com.example.Practice.Springboot.APIs8.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
