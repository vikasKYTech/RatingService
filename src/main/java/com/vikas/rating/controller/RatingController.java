package com.vikas.rating.controller;

import com.vikas.rating.entities.Rating;
import com.vikas.rating.entities.dto.RatingDto;
import com.vikas.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    public final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody RatingDto ratingDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(ratingDto));
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getRatings(){
        return ResponseEntity.ok(ratingService.getAllRating());
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<List<Rating>> getUserByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getAllRatingByHotel(hotelId));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Rating>> getUserByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getAllRatingByHotel(userId));
    }


}
