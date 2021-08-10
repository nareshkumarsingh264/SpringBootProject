package com.naresh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.model.Student;
import com.naresh.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	/* @PostMapping("/studentSave")
	public String insertStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return "your record is saved successfully !!";
	} */

	@PostMapping("/multiplestudentSave")
	public String insertStudent(@RequestBody List<Student> student) {
		studentRepository.saveAll(student);
		return " record is saved successfully !!";
	}
	
	@PostMapping("/studentSave")

	public String insertStudent(@RequestParam String name, @RequestParam String course, @RequestParam Long id) {
		Student student = new Student();
		student.setStudentId(id);
		student.setStudentCourse(course);
		student.setStudentName(name);
		studentRepository.save(student);
		return " record is saved successfully !!";
	}
	
@GetMapping("/getAllStudent")
public List<Student> getStudent() {
	
	return (List<Student>)studentRepository.findAll();
}

@GetMapping("/getByBookName/{name}")
public List<Student> getStudent(@PathVariable("name") String studentName) {
	
	return (List<Student>)studentRepository.findBystudentName(studentName);
}

@GetMapping("/getByStudentId/{studentId}")
public Optional<Student> getStudent(@PathVariable("studentId") Long id) {
	
	return studentRepository.findById(id);
}


/*@PutMapping("/updateStudent")
public String updateStudent(@RequestBody Student student) {
	studentRepository.save(student);
	return "your record is update successfully !!";
} */


@PutMapping("/update")

public String update(@RequestParam String name, @RequestParam String course, @RequestParam Long id) {
	Student student = new Student();
	student.setStudentId(id);
	student.setStudentCourse(course);
	student.setStudentName(name);
	studentRepository.save(student);
	return "your record is update successfully !!";
}

/* @DeleteMapping("/deleteStudent/{id}")
public String deleteStudent(@PathVariable Long id) {
	studentRepository.deleteById(id);
	return "your record is delete successfully !!";
} */

@DeleteMapping("/delete")
public String deleteStudent(@RequestBody Student student) {
	studentRepository.delete(student);
	return "your record is delete successfully !!";
	}
/*@DeleteMapping("/deleteStudent/{id}")
public String deleteStudent( @RequestParam Long id) {
	Student student = new Student();
	student.setStudentId(id);
	studentRepository.deleteById(id);
	return "your record is delete successfully !!";
} */
}
