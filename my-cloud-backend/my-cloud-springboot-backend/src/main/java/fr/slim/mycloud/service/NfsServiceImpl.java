package fr.slim.mycloud.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import fr.slim.mycloud.dto.CloudRequestDTO;
import fr.slim.mycloud.dto.NfsDTO;

@Service
public class NfsServiceImpl implements NfsService{


	@Override
	public CloudRequestDTO createNfs(NfsDTO newNFS) {
		// TODO Auto-generated method stub
		CloudRequestDTO cloudRequest = new CloudRequestDTO();
		cloudRequest.setId(ThreadLocalRandom.current().nextInt());
		
		return cloudRequest;
	}
	
}
