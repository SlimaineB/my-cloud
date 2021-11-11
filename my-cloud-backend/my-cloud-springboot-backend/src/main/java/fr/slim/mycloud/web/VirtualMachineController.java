package fr.slim.mycloud.web;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.slim.mycloud.dto.CloudRequestDTO;
import fr.slim.mycloud.dto.VirtualMachineDTO;
import fr.slim.mycloud.service.VirtualMachineService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/virtualmachine")
public class VirtualMachineController {

	Logger logger = LoggerFactory.getLogger(VirtualMachineController.class);

	@Autowired
	private VirtualMachineService virtualMachineService;

	@PostMapping
	public ResponseEntity<CloudRequestDTO> createVirtualMachine(@RequestBody VirtualMachineDTO newVm) {
		logger.info("createVirtualMachine called" + newVm);

		CloudRequestDTO cloudRequest = virtualMachineService.createVirtualMachine(newVm);

		return ResponseEntity.status(HttpStatus.OK).body(cloudRequest);

	}

	@GetMapping
	public ResponseEntity<List<VirtualMachineDTO>> listVirtualMachine() {
		logger.info("lisVirtualMachine called");

		List<VirtualMachineDTO> vms = virtualMachineService.listVirtualMachine();

		return ResponseEntity.status(HttpStatus.OK).body(vms);

	}

}
