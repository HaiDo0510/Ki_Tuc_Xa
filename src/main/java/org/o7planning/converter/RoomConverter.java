package org.o7planning.converter;

import org.o7planning.dto.RoomDTO;
import org.o7planning.entity.RoomEntity;
import org.springframework.stereotype.Component;

@Component
public class RoomConverter {
	public RoomEntity toEntity(RoomDTO roomDTO) {
		RoomEntity roomEntity = new RoomEntity();
		roomEntity.setMaxPeople(roomDTO.getMaxPeople());
		roomEntity.setNumberPCurrent(roomDTO.getNumberPCurrent());
		roomEntity.setNumberRoom(roomDTO.getNumberRoom());
		roomEntity.setPrice(roomDTO.getPrice());
		roomEntity.setTypeRoom(roomDTO.getTypeRoom());
		return roomEntity;
	}

	public RoomDTO toDTO(RoomEntity roomEntity) {
		RoomDTO roomDTO = new RoomDTO();
		if (roomEntity.getId() != null) {
			roomDTO.setId(roomEntity.getId());
		}

		return roomDTO;
	}

	public RoomEntity toEntity(RoomDTO roomDTO, RoomEntity roomEntity) {

		return roomEntity;
	}
}
