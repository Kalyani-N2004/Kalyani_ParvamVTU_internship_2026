package studentapp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studentapp2.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}