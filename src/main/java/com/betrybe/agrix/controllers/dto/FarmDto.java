package com.betrybe.agrix.controllers.dto;

//import com.betrybe.agrix.models.entities.Farm;

/**
 * FarmDTO.
 */
public class FarmDto {
  private Long id;
  private String name;
  private Double size;

  public FarmDto() {
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

  public Double getSize() {
    return size;
  }

  public void setSize(Double size) {
    this.size = size;
  }

  // /**
  // * FarmDTO.
  // */
  //  public static record Creation(String name, double size) {
  //    public Farm toFarm() {
  //      return new Farm(name, size);
  //    }
  //  }
}
