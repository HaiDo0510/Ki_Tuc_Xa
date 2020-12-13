package org.o7planning.dto;

import java.util.Date;

import javax.persistence.Column;

public class GuestDTO extends AbtractDTO {

	private String cmt;

	private String fullName;

	private Date birthDay;

	private Long id_student;

	public GuestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Long getId_student() {
		return id_student;
	}

	public void setId_student(Long id_student) {
		this.id_student = id_student;
	}
	
	
}
