package com.betrybe.agrix.service;

import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.models.repositories.FarmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class FarmService.
 */
@Service
public class FarmService {
  private FarmsRepository farmsRepository;
  
  @Autowired
  public FarmService(FarmsRepository farmsRepository) {
    this.farmsRepository = farmsRepository;
  }
  
  //Método insertFarm.
  public Farm insertFarm(Farm farm) {
    return farmsRepository.save(farm);
  }
}
