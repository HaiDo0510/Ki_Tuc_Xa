package org.o7planning.service;

import org.o7planning.dto.RoomDTO;

public interface IRoomService {
	RoomDTO save(RoomDTO roomDTO);
	void delete(long[] ids);
	void deleteById(long id);
}
