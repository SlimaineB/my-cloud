package fr.slim.mycloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.slim.mycloud.domain.entity.VirtualMachine;
import fr.slim.mycloud.domain.repository.VirtualMachineRepository;
import fr.slim.mycloud.dto.VirtualMachineDTO;

@SpringBootApplication
public class MycloudSpringbootApplication implements CommandLineRunner{
	
    private static Logger LOG = LoggerFactory
    	      .getLogger(MycloudSpringbootApplication.class);
    
    @Autowired
    VirtualMachineRepository vmRepository;

	public static void main(String[] args) {
		SpringApplication.run(MycloudSpringbootApplication.class, args);
	}
	
    @Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");
		
		VirtualMachine vm1 = new VirtualMachine();
		vm1.setId(1);
		vm1.setVmName("Titi");
		vm1.setVmCPU(1);
		vm1.setVmMemory(2048);
		vm1.setVmIP("192.168.1.2");
        vmRepository.save(vm1);
 
     
    }

}
