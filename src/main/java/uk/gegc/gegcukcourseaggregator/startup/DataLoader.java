package uk.gegc.gegcukcourseaggregator.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uk.gegc.gegcukcourseaggregator.model.Course;
import uk.gegc.gegcukcourseaggregator.repository.CourseRepository;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    private final CourseRepository courseRepository;

    // Constructor-based injection for CourseRepository
    public DataLoader(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) {
        // Check if the database is already populated
        if (courseRepository.count() == 0) {
            System.out.println("No courses found in database. Adding default data...");

            // Create and save some seed data
            Course course1 = new Course();
            course1.setId("course-1");
            course1.setName("Intro to Java Programming");
            course1.setTopic("Programming");
            course1.setDescription("Learn Java from scratch...");
            course1.setSchool("Online Academy");
            course1.setImageUrl("https://example.com/java.png");
            course1.setPrice(49.99);
            course1.setDiscount(0);
            course1.setStartDate("2024-01-15");
            course1.setRating(4.5);
            course1.setNumberOfReviews(120);
            course1.setReviewsLink("https://example.com/reviews/course-1");
            course1.setLength("5 weeks");
            course1.setSpeakers(Arrays.asList("John Doe", "Mary Smith"));
            course1.setContentSections(Arrays.asList("Introduction", "Basic Syntax", "OOP Concepts", "Practice Projects"));
            course1.setPromoFlag(false);

            Course course2 = new Course();
            course2.setId("course-2");
            course2.setName("Mastering React");
            course2.setTopic("Frontend Development");
            course2.setDescription("Dive deep into React and its ecosystem...");
            course2.setSchool("Web Academy");
            course2.setImageUrl("https://example.com/react.png");
            course2.setPrice(79.99);
            course2.setDiscount(10);
            course2.setStartDate("2024-02-01");
            course2.setRating(4.8);
            course2.setNumberOfReviews(250);
            course2.setReviewsLink("https://example.com/reviews/course-2");
            course2.setLength("6 weeks");
            course2.setSpeakers(Arrays.asList("Alice Johnson", "Bob Brown"));
            course2.setContentSections(Arrays.asList("React Basics", "State Management", "React Router", "Hooks and Context"));
            course2.setPromoFlag(true);

            courseRepository.saveAll(Arrays.asList(course1, course2));
            System.out.println("Default courses added to database.");
        } else {
            System.out.println("Courses already exist in database. Skipping data loading.");
        }
    }
}
