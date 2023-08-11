package com.betrybe.agrix.controllers;

import com.betrybe.agrix.controllers.dto.CropDto;
import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.service.CropService;
import com.betrybe.agrix.service.FarmService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class CropController.
 */
@RestController
@RequestMapping()
public class CropController {

  private CropService cropService;
  //  private FarmService farmService;
  
  @Autowired
  public CropController(CropService cropService, FarmService farmService) {
    this.cropService = cropService;
    //    this.farmService = farmService;
  }
  
  /**
 * Método getAllCrops.
 */
  @GetMapping("/crops")
  public ResponseEntity<?> getAllCrops() {
    List<Crop> allCrops = cropService.getAllCrops();

    List<CropDto> cropDto = allCrops.stream().map(crop -> new CropDto(crop.getId(), crop
        .getName(), crop.getPlantedArea(), crop.getFarmId())).collect(Collectors.toList());
    return ResponseEntity.ok(cropDto);
  }
  
  /**
 * Método getCropById.
 */
  @GetMapping("/crops/{id}")
  public ResponseEntity<?> getCropById(@PathVariable Long id) {
    Optional<Crop> optionalCrop = cropService.getCropById(id);

    if (optionalCrop.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Plantação não encontrada!");
    }
    
    return ResponseEntity.ok(optionalCrop);
  }
}
