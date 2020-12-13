package org.o7planning.service.impl;

import org.o7planning.dto.GuestDTO;
import org.o7planning.repository.GuestRepository;
import org.o7planning.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService implements IGuestService{

	@Autowired
	private GuestConverter guestConverter;
	
	@Autowired
	private GuestRepository guestRepository;
	
	@Override
	public GuestDTO save(GuestDTO guestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

}
