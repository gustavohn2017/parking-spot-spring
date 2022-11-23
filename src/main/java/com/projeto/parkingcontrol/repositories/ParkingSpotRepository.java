package com.projeto.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.parkingcontrol.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByApartmentAndBlock(String Apartment, String Block);
    boolean existsByParkingSpotNumber(String parkingSpotNumber); 
}
