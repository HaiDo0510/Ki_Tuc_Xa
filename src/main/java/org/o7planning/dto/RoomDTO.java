package org.o7planning.dto;

public class RoomDTO extends AbtractDTO {

	private String numberRoom;

	private String typeRoom;

	private Long price;

	private Integer maxPeople;

	private Integer numberPCurrent;

	public RoomDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	
	
}
