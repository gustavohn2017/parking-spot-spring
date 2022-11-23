package com.projeto.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.parkingcontrol.models.ParkingSpotModel;
import com.projeto.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
    @Autowired
    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(com.projeto.parkingcontrol.repositories.ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public Object save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    //Tem um problema aqui nesta porra.

    public boolean existsByApartmentAndBlock(String Apartment, String Block) {
        return parkingSpotRepository.existsByApartmentAndBlock(Apartment, Block);
    }

    public boolean existsByApartmentAndBlock(Object byApartmentAndBlock) {
        return false;
    }

    public List<ParkingSpotModel> findAll() {
        return parkingSpotRepository.findAll();
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSpotRepository.delete(parkingSpotModel);
    }

  
}
