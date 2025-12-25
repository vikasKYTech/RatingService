package com.vikas.rating.entities.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RatingDto {

    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;

}
