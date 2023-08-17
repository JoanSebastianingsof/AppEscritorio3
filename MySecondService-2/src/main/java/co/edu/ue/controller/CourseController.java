package co.edu.ue.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Course;

@RestController
public class CourseController {
	Course course;
	
	@PostConstruct
	public void init() {
		course=new Course();
	}
	@GetMapping(value="courses",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Course> getCourses(){
		return course.listCourses();
	}
	@GetMapping(value="courses/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Course> searchCourses(@PathVariable("name") String nam){
		return course.searchCourses(nam);
	}
	
	@PostMapping(value="course", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Course>postCourse(@RequestBody Course c){
		return course.postCourse(c);
	}
	
	@DeleteMapping(value="courses/{name}")
	public List<Course> deleteCourse(@PathVariable("name") String nam){
		return course.deleteCourse(nam);
	}
	
	@PutMapping(value="course/{name}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Course> updateCourse(@PathVariable("name") String nam,@RequestBody Course c){
		return course.updateCourse(c, nam);
	}
}
