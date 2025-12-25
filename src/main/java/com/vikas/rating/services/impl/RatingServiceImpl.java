package com.vikas.rating.services.impl;

import com.vikas.rating.entities.Rating;
import com.vikas.rating.entities.dto.RatingDto;
import com.vikas.rating.repository.RatingRepository;
import com.vikas.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    public final RatingRepository ratingRepository;

    @Autowired
    RatingServiceImpl(RatingRepository ratingRepository){
        this.ratingRepository = ratingRepository;
    }

    @Override
    public Rating createRating(RatingDto ratingDto) {
        Rating rating = new Rating();
//        rating.setRatingId(ratingDto.getRatingId());
        rating.setHotelId(ratingDto.getHotelId());
        rating.setUserId(ratingDto.getUserId());
        rating.setRating(ratingDto.getRating());
        rating.setFeedback(ratingDto.getFeedback());
        ratingRepository.save(rating);
        return null;
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingByHotel(String hotelId) {
        return ratingRepository.findAllByHotelId(hotelId);
    }

    @Override
    public List<Rating> getRatingByUser(String userId) {
        return ratingRepository.findAllByUserId(userId);
    }
}
