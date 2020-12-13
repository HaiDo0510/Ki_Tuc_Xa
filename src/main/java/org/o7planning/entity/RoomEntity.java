package org.o7planning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class RoomEntity extends BaseEntity{
	
	@Column(name = "numberRoom")
	private String numberRoom;
	
	@Column(name = "typeRoom")
	private String typeRoom;
	
	@Column(name = "price")
	private Long price;
	
	@Column(name = "maxPeople")
	private Integer maxPeople;
	
	@Column(name = "numberPCurrent")
	private Integer numberPCurrent;

	public String getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(String numberRoom) {
		this.numberRoom = numberRoom;
	}

	public String getTypeRoom() {
		return typeRoom;
	}

	public void setTypeRoom(String typeRoom) {
		this.typeRoom = typeRoom;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(Integer maxPeople) {
		this.maxPeople = maxPeople;
	}

	public Integer getNumberPCurrent() {
		return numberPCurrent;
	}

	public void setNumberPCurrent(Integer numberPCurrent) {
		this.numberPCurrent = numberPCurrent;
	}

	public RoomEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
