package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;

/**
 * CropDTO.
 */
public record CropDto(Long id, String name, double plantedArea, Long farmId) {
  public Crop toCrop(Long farmId) {
    return new Crop(id, name, plantedArea, farmId);
  }

  public Crop toCrop() {
    return new Crop(id, name, plantedArea, farmId);
  }
}
