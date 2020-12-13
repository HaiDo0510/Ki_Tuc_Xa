package org.o7planning.service;

import org.o7planning.dto.StudentDTO;

public interface IStudentService {
	StudentDTO save(StudentDTO studentDTO);
	void delete(long[] ids);
	void deleteById(long id);
}
