package com.example.course2.Repository;

import com.example.course2.binding.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CourseRepo extends JpaRepository<Course, Serializable> {
}
