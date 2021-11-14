package fr.slim.mycloud.service;

import fr.slim.mycloud.dto.CloudRequestDTO;
import fr.slim.mycloud.dto.NfsDTO;

public interface NfsService {

	public CloudRequestDTO createNfs(NfsDTO newNFS);
}
