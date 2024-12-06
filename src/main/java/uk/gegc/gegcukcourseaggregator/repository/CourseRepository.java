package uk.gegc.gegcukcourseaggregator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uk.gegc.gegcukcourseaggregator.model.Course;

public interface CourseRepository extends MongoRepository<Course, String> {
}
