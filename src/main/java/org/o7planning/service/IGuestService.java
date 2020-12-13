package org.o7planning.service;

import org.o7planning.dto.GuestDTO;

public interface IGuestService {
	GuestDTO save(GuestDTO guestDTO);
	void delete(long[] ids);
	void deleteById(long id);
}
