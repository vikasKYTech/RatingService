package com.vikas.rating.repository;

import com.vikas.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {
    List<Rating> findAllByHotelId(String hotelId);

    List<Rating> findAllByUserId(String userId);
}
