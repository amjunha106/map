package com.web.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rankings {
    @Id
    private Long id;                 // 고유 ID
    private Integer ranking;         // 순위
    private String restaurantName;   // 가게 이름
    private String location;         // 지역
    private Double rating;           // 별점
    private String review;           // 평가 내용

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
