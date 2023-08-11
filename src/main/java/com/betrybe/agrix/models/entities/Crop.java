package com.betrybe.agrix.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Class Crop.
 */
@Entity
@Table(name = "crops")
public class Crop {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @Column(name = "planted_area")
  private double plantedArea;
  
  @ManyToOne
  @JoinColumn(name = "farm_id")
  private Farm farm;

  public Crop() {}
  
  /**
 * Metodo contrutor.
 */
  public Crop(Long id, String name, double plantedArea, Farm farm) {
    this.id = id;
    this.name = name;
    this.plantedArea = plantedArea;
    this.farm = farm;
  }
  
  public Crop(Long id, String name, double plantedArea, Long farmId) {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPlantedArea() {
    return plantedArea;
  }

  public void setPlantedArea(double plantedArea) {
    this.plantedArea = plantedArea;
  }

  public Farm getFarm() {
    return farm;
  }

  public void setFarm(Farm farm) {
    this.farm = farm;
  }
}
