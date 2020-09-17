package com.app.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Student;


@FeignClient("STUDENT-SERVICE")
public interface StudentRestConsumer {
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll();
	
	@GetMapping("/get")
	public ResponseEntity<?> getStudent(@RequestParam("id")int id);
	
	@PostMapping("/save")
	public ResponseEntity<?> saveStudent(@RequestBody Student student);
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id")Integer id);
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student);
	
	

}
