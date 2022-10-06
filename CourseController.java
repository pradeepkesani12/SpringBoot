package com.in28minutes.springboot.learnspringboot.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.learnspringboot.entity.Course;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course>retriveAllCorses(){
		return Arrays.asList(
				new Course (1,"learn AWS","IN 28Minutes"),
				new Course(2,"learninng java","in28Minutes"), 
				new Course(3,"learninng python","in28Minutes"), 
				new Course(4,"learninng MYSQL","in28Minutes")
				);
	}

}
