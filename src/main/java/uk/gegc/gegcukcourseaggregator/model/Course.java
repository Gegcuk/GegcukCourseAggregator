package uk.gegc.gegcukcourseaggregator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "courses")
public class Course {
    private String id;
    private String name;
    private String topic;
    private String description;
    private String school;
    private String imageUrl;
    private double price;
    private double discount;
    private String startDate;
    private double rating;
    private int numberOfReviews;
    private String reviewsLink;
    private String length;
    private List<String> speakers;
    private List<String> contentSections;
    private boolean promoFlag;

}
