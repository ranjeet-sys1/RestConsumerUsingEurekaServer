package com.app.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.consumer.StudentRestConsumer;
import com.app.model.Student;

@RestController
public class StudentRestController {
	@Autowired
	private StudentRestConsumer consumer;
	@GetMapping("/getAllStudent")
	public ResponseEntity<?> getAll()
	{
		return consumer.getAll();
	}
	@GetMapping("/getStudent")
	public ResponseEntity<?> getStudent(@RequestParam("id")int id)
	{
		return consumer.getStudent(id);
	}
	@PostMapping("/saveStudent")
	public ResponseEntity<?> saveStudent(@RequestBody Student student)
	{
		return consumer.saveStudent(student);
	}
	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<?> delete(@PathVariable("id")Integer id)
	{
		return consumer.delete(id);
	}
	@PutMapping("/updateStudent")
	public ResponseEntity<String> updateStudent(@RequestBody Student student)
	{
		return consumer.updateStudent(student);
	}

}
