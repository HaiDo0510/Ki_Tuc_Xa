package org.o7planning.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class TicketEntity extends BaseEntity{
	
	
	@Column(name = "infoVehicle")
	private String infoVehicle;
	
	@Column(name = "id_student")
	private Long id_student;

	public String getInfoVehicle() {
		return infoVehicle;
	}

	public void setInfoVehicle(String infoVehicle) {
		this.infoVehicle = infoVehicle;
	}

	public Long getId_student() {
		return id_student;
	}

	public void setId_student(Long id_student) {
		this.id_student = id_student;
	}

	public TicketEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
