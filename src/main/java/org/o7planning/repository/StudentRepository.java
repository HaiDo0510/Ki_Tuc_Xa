package org.o7planning.repository;

import org.o7planning.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

	

}
