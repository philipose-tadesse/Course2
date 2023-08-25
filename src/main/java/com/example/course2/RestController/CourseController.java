package com.example.course2.RestController;

import com.example.course2.Service.CourseServiceImpl;
import com.example.course2.binding.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;

    @GetMapping("/course/{CID}")
    public ResponseEntity<Course>  getCourse(@PathVariable Integer CID){
        Course c = courseService.getById(CID);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    @PostMapping("/course")
    public ResponseEntity<String> CreateCourse(@RequestBody Course course){
        String Status = courseService.upsert(course);
        return new ResponseEntity<>(Status, HttpStatus.OK);
    }
    @GetMapping("/courses")
    public ResponseEntity<List<Course>> GetAllCourse(){
        List<Course> courses= courseService.getAllCourse();
        return new ResponseEntity<>(courses,HttpStatus.OK);
    }
}
