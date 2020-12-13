package org.o7planning.converter;

import org.o7planning.dto.StudentDTO;
import org.o7planning.dto.TicketDTO;
import org.o7planning.entity.TicketEntity;
import org.springframework.stereotype.Component;

@Component
public class TicketConverter {
	public TicketEntity toEntity(TicketDTO ticketDTO) {
		TicketEntity ticketEntity = new TicketEntity();
		ticketEntity.setCreateDate(ticketDTO.getCreateDate());
		ticketEntity.setInfoVehicle(ticketDTO.getInfoVehicle());
		ticketEntity.setId_student(ticketDTO.getId_student());
		return ticketEntity;
	}

	public TicketDTO toDTO(TicketEntity ticketEntity) {
		TicketDTO ticketDTO = new TicketDTO();
		if(ticketEntity.getId() != null) {
			ticketDTO.setId(ticketEntity.getId());
		}
		ticketDTO.setCreateDate(ticketEntity.getCreateDate());
		ticketDTO.setInfoVehicle(ticketEntity.getInfoVehicle());
		ticketDTO.setId_student(ticketEntity.getId_student());
		return ticketDTO;
	}

	public TicketEntity toEntity(TicketDTO ticketDTO, TicketEntity ticketEntity) {
		ticketEntity.setCreateDate(ticketDTO.getCreateDate());
		ticketEntity.setInfoVehicle(ticketDTO.getInfoVehicle());
		ticketEntity.setId_student(ticketDTO.getId_student());
		return ticketEntity;
	}
}
