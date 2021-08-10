package com.naresh.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.naresh.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

public List<Student> findBystudentName (String name);
}
