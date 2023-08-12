package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;

/**
 * CropDTO.
 */
public record CropDto(Long id, String name, double plantedArea) {
  /**
   * Set crops.
   */
  public Crop toCrop() {
    Crop crop = new Crop();
    crop.setName(name);
    crop.setPlantedArea(plantedArea);
    return crop;
  }
  
  /**
 * FromEntiti.
 */
  public static record FromEntiti(Long id, String name, double plantedArea, Long farmId) {
  
  }
  
  /**
 * FromEntiti.
 */
  public static FromEntiti toResponse(Crop crop) {
    return new FromEntiti(crop.getId(), crop.getName(), crop.getPlantedArea(), crop
      .getFarm().getId());
  }
}
