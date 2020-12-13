package org.o7planning.converter;

import org.o7planning.dto.StudentDTO;
import org.o7planning.entity.StudentEntity;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {
	public StudentEntity toEntity(StudentDTO studentDTO) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setCode(studentDTO.getCode());
		studentEntity.setCmt(studentDTO.getCmt());
		studentEntity.setBirthDay(studentDTO.getBirthDay());
		studentEntity.setFullName(studentDTO.getFullName());
		studentEntity.setHometown(studentDTO.getHometown());
		studentEntity.setId_room(studentDTO.getId_room());
		studentEntity.setNameClass(studentDTO.getNameClass());
		return studentEntity;
	}
	
	public StudentDTO toDTO(StudentEntity studentEntity) {
		StudentDTO studentDTO = new StudentDTO();
		if(studentEntity.getId() != null) {
			studentDTO.setId(studentEntity.getId());
		}
		studentDTO.setCode(studentEntity.getCode());
		studentDTO.setCmt(studentEntity.getCmt());
		studentDTO.setBirthDay(studentEntity.getBirthDay());
		studentDTO.setFullName(studentEntity.getFullName());
		studentDTO.setHometown(studentEntity.getHometown());
		studentDTO.setId_room(studentEntity.getId_room());
		studentDTO.setNameClass(studentEntity.getNameClass());
		return studentDTO;
	}
	
	public StudentEntity toEntity(StudentDTO studentDTO, StudentEntity studentEntity) {
		studentEntity.setCode(studentDTO.getCode());
		studentEntity.setCmt(studentDTO.getCmt());
		studentEntity.setBirthDay(studentDTO.getBirthDay());
		studentEntity.setFullName(studentDTO.getFullName());
		studentEntity.setHometown(studentDTO.getHometown());
		studentEntity.setId_room(studentDTO.getId_room());
		studentEntity.setNameClass(studentDTO.getNameClass());
		return studentEntity;
	}
}
