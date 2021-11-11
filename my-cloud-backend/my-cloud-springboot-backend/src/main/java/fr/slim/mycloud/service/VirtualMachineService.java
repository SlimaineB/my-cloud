package fr.slim.mycloud.service;

import java.util.List;

import fr.slim.mycloud.dto.CloudRequestDTO;
import fr.slim.mycloud.dto.VirtualMachineDTO;

public interface VirtualMachineService {

	public CloudRequestDTO createVirtualMachine(VirtualMachineDTO vmDto);

	public List<VirtualMachineDTO> listVirtualMachine();
	

}
