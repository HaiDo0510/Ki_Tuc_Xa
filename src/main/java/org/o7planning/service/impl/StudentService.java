package org.o7planning.service.impl;

import org.o7planning.converter.StudentConverter;
import org.o7planning.dto.StudentDTO;
import org.o7planning.entity.StudentEntity;
import org.o7planning.repository.StudentRepository;
import org.o7planning.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService implements IStudentService{

	@Autowired
	private StudentConverter studentConverter;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public StudentDTO save(StudentDTO studentDTO) {
		StudentEntity studentEntity = new StudentEntity();
		if(studentDTO.getId() != null) {
			StudentEntity oldStudentEntity = studentRepository.findOne(studentDTO.getId());
			studentEntity = studentConverter.toEntity(studentDTO, oldStudentEntity);
		} else {
			studentEntity = studentConverter.toEntity(studentDTO);
		}
		studentEntity = studentRepository.save(studentEntity);
		return studentConverter.toDTO(studentEntity);
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(long id) {
		studentRepository.delete(id);
		
	}

}
