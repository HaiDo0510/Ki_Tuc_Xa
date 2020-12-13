package org.o7planning.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "activities")
public class ActivitiesEntity extends BaseEntity{
	@Column(name = "dateIn")
	private Date dateIn;
	
	@Column(name = "dateOut")
	private Date dateOut;
	
	@Column(name = "id_ticket")
	private Long id_ticket;
	
	@Column(name = "numberOfDay")
	private Integer numberOfDay;

	public ActivitiesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	public Long getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(Long id_ticket) {
		this.id_ticket = id_ticket;
	}

	public Integer getNumberOfDay() {
		return numberOfDay;
	}

	public void setNumberOfDay(Integer numberOfDay) {
		this.numberOfDay = numberOfDay;
	}
	
	
}
