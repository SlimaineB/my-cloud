package fr.slim.mycloud.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.slim.mycloud.config.VirtualBoxCommandConfig;
import fr.slim.mycloud.dto.VirtualMachineDTO;

@Service
public class VirtualMachineServiceImpl implements VirtualMachineService{
	
	Logger logger = LoggerFactory.getLogger(VirtualMachineServiceImpl.class);
	
	@Autowired
	VirtualBoxCommandConfig virtualBoxCommandConfig;

	@Override
	public String createVirtualMachine(VirtualMachineDTO vmDto) {
		String command = virtualBoxCommandConfig.getCreateVm()
				.replaceAll("_vmName_", "test")
				.replaceAll("_osType_", "Debian_64");
		
		logger.info("Command to execute "+ command);
		
		String output = executeCommand(command);
		return output;
	}
	
	
	private String executeCommand(String command) {

		StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = 
                           new BufferedReader(new InputStreamReader(p.getInputStream()));

			String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info(output.toString());
		
		return output.toString();

	}
	
}
