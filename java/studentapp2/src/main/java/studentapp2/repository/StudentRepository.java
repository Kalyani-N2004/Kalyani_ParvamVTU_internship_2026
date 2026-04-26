package studentapp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studentapp2.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}