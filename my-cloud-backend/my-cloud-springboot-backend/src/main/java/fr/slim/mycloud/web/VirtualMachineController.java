package fr.slim.mycloud.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.slim.mycloud.dto.VirtualMachineDTO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/virtualmachine")
public class VirtualMachineController {

	Logger logger = LoggerFactory.getLogger(VirtualMachineController.class);

	@PostMapping
	public ResponseEntity<VirtualMachineDTO>  createVirtualMachine() {
		logger.info("createVirtualMachine called");
		VirtualMachineDTO vm = new VirtualMachineDTO();
		vm.setId(1);
		vm.setName("My First VM");
		
		return ResponseEntity.status(HttpStatus.OK)
		        .body(vm);
		
	}

}
