package com.andressasouza.dslist.dto;

import com.andressasouza.dslist.entities.Game;

// Class to represent ONLY the projection of data needed
public class GameMinDTO {
  private Long id;
  private String title;
  private Integer year;
  private String imgUrl;
  private String shortDescription;

  public GameMinDTO() {
  }


  public GameMinDTO(Game entity) {
    // THIS. can be ommitted in this situation because there's no ambiguity
    id = entity.getId();
    title = entity.getTitle();
    year = entity.getYear();
    imgUrl = entity.getImgUrl();
    shortDescription = entity.getShortDescription();
  }

  public Long getId() {
    return this.id;
  }

  public String getTitle() {
    return this.title;
  }

  public Integer getYear() {
    return this.year;
  }

  public String getImgUrl() {
    return this.imgUrl;
  }

  public String getShortDescription() {
    return this.shortDescription;
  }


}
