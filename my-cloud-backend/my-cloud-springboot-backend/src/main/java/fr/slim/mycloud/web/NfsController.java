package fr.slim.mycloud.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.slim.mycloud.dto.CloudRequestDTO;
import fr.slim.mycloud.dto.NfsDTO;
import fr.slim.mycloud.service.NfsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/nfs")
public class NfsController {

	Logger logger = LoggerFactory.getLogger(NfsController.class);

	@Autowired
	private NfsService nfsService;

	@PostMapping
	public ResponseEntity<CloudRequestDTO> createNfs(@RequestBody NfsDTO newNFS) {
		logger.info("createNfs called" + newNFS);

		CloudRequestDTO cloudRequest = nfsService.createNfs(newNFS);

		return ResponseEntity.status(HttpStatus.OK).body(cloudRequest);

	}

	

}
