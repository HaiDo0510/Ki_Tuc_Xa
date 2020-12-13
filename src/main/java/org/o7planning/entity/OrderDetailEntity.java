package org.o7planning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "orderDetail")
public class OrderDetailEntity extends BaseEntity{
	
	@Column(name = "id_service")
	private Long id_service;
	
	@Column(name = "id_order")
	private Long id_order;
	
	@Column(name = "numbers")
	private Integer numbers;
	
	@Column(name = "originalPrice")
	private Long originalPrice;
	
	@Column(name = "amount")
	private Long amount;

	public OrderDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_service() {
		return id_service;
	}

	public void setId_service(Long id_service) {
		this.id_service = id_service;
	}

	public Long getId_order() {
		return id_order;
	}

	public void setId_order(Long id_order) {
		this.id_order = id_order;
	}

	public Integer getNumbers() {
		return numbers;
	}

	public void setNumbers(Integer numbers) {
		this.numbers = numbers;
	}

	public Long getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	
	
}
