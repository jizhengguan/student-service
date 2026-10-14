package hu.unimiskolc.dwa.student_service.repository;

import hu.unimiskolc.dwa.student_service.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContainingIgnoreCase(String name);
}