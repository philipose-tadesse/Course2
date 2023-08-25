package com.example.course2.Service;

import com.example.course2.binding.Course;

import java.util.List;

public interface CourseService {
     String upsert(Course course);
      Course getById(Integer CID);
      String deleteById(Integer CID);
      List<Course> getAllCourse();

}
