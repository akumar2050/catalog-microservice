package io.javabrains.ratingsdataservice;


import java.util.Arrays;
import java.util.List;
import io.javabrains.ratingsdataservice.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {
    
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    
    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 3));
        
        
        UserRating userRating = new UserRating();
        userRating.setUserrating(ratings);
        return userRating;
              
    }

}