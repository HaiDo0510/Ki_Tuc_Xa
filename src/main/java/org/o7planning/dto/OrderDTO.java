package org.o7planning.dto;

public class OrderDTO extends AbtractDTO {
	
	private Long id_student;

	private Long totalPrice;

	private String status;

	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_student() {
		return id_student;
	}

	public void setId_student(Long id_student) {
		this.id_student = id_student;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
