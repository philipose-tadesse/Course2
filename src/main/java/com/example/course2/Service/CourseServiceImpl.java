package com.example.course2.Service;

import com.example.course2.Repository.CourseRepo;
import com.example.course2.binding.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;

    public CourseServiceImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public String upsert(Course course) {
        courseRepo.save(course);
        return "successfully Created";
    }

    @Override
    public Course getById(Integer CID) {
        Optional<Course> findById = courseRepo.findById(CID);
        return findById.orElse(null);
    }

    @Override
    public String deleteById(Integer CID) {
        courseRepo.deleteById(CID);
        return "Deleted Successfully";

    }

    @Override
    public List<Course> getAllCourse() {
        return courseRepo.findAll();
    }
}
