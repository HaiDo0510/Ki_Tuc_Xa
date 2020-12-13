package org.o7planning.dto;

import java.util.Date;

public class StudentDTO extends AbtractDTO {
	private String code;

	private String fullName;

	private String cmt;

	private Date birthDay;

	private String nameClass;

	private String hometown;

	private Long id_room;

	public StudentDTO() {
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
