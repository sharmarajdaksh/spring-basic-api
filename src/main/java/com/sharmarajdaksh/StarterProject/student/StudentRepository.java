package com.sharmarajdaksh.StarterProject.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //    @Query("Select s FROM Student WHERE s.email = ?")
    Optional<Student> findStudentByEmail(String email);
}
