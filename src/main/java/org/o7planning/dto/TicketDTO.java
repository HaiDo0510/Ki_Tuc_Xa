package org.o7planning.dto;

public class TicketDTO extends AbtractDTO {

	private String infoVehicle;
	
	private Long id_student;

	public TicketDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	
	
}
