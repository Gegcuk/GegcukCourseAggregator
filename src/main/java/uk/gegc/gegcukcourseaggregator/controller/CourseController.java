package uk.gegc.gegcukcourseaggregator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import uk.gegc.gegcukcourseaggregator.model.Course;
import uk.gegc.gegcukcourseaggregator.repository.CourseRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CourseController {
    private final CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }
}
