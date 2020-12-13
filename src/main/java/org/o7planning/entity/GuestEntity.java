package org.o7planning.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "guest")
public class GuestEntity extends BaseEntity{
	
	
	@Column(name = "cmt")
	private String cmt;
	
	@Column(name = "fullName")
	private String fullName;
	
	@Column(name = "birthDay")
	private Date birthDay;
	
	@Column(name = "id_student")
	private Long id_student;

	public GuestEntity() {
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
