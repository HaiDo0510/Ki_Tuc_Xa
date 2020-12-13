package org.o7planning.api;

import org.o7planning.dto.StudentDTO;
import org.o7planning.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class StudentAPI {

	@Autowired
	private IStudentService studentService;
	
	@PostMapping(value = "/student")
	public StudentDTO createStudent(@RequestBody StudentDTO model) {
		return studentService.save(model);
	}
	
	
	
	@PutMapping(value = "/student/{id}")
	public StudentDTO updateStudent(@RequestBody StudentDTO model, @PathVariable("id") long id) {
		// set id
		return studentService.save(model);
	}
	
	@DeleteMapping(value= "/student")
	public void deleteStudent(@RequestBody long[] ids ) {
		studentService.delete(ids);
	}
	
	
	@DeleteMapping(value= "/student/{id}")
	public void deleteStudent(@PathVariable("id") long id) {
		studentService.deleteById(id);;
	}
}
