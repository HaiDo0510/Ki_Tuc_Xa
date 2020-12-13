package org.o7planning.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity extends BaseEntity{

	@Column(name = "code")
	private String code;
	
	@Column(name = "fullName")
	private String fullName;
	
	@Column(name = "cmt")
	private String cmt;
	
	@Column(name = "birthDay")
	private Date birthDay;
	
	@Column(name = "nameClass")
	private String nameClass;
	
	@Column(name = "hometown")
	private String hometown;
	
	
	@Column(name = "id_room")
	private Long id_room;

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	

	public Long getId_room() {
		return id_room;
	}

	public void setId_room(Long id_room) {
		this.id_room = id_room;
	}
	
	
	
}
