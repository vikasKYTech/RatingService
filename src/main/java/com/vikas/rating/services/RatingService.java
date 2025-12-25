package com.vikas.rating.services;

import com.vikas.rating.entities.Rating;
import com.vikas.rating.entities.dto.RatingDto;

import java.util.List;

public interface RatingService {

    // create
    Rating createRating(RatingDto ratingDto);

    // get All ratings
    List<Rating> getAllRating();

    // Get all by hotel
    List<Rating> getAllRatingByHotel(String hotelId);

    // Get all by userId
    List<Rating> getRatingByUser(String userId);

}
