package fr.slim.mycloud.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/referential")
public class ReferentialController {

	@GetMapping(path = "vmtype")
	public List<String> getVMType(){
		
		return Arrays.asList("ubuntu/focal64","ubuntu/trusty64","centos");
		
	}
	
}
