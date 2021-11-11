package fr.slim.mycloud.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.slim.mycloud.config.VirtualBoxCommandConfig;
import fr.slim.mycloud.domain.entity.VirtualMachine;
import fr.slim.mycloud.domain.repository.VirtualMachineRepository;
import fr.slim.mycloud.dto.CloudRequestDTO;
import fr.slim.mycloud.dto.VirtualMachineDTO;

@Service
public class VirtualMachineServiceImpl implements VirtualMachineService {

	Logger logger = LoggerFactory.getLogger(VirtualMachineServiceImpl.class);

	@Autowired
	VirtualBoxCommandConfig virtualBoxCommandConfig;

	@Autowired
	VirtualMachineRepository virtualMachineRepository;

	@Override
	public CloudRequestDTO createVirtualMachine(VirtualMachineDTO vmDto) {
		String command = virtualBoxCommandConfig.getCreateVm()
				.replaceAll("_vmName_", "test")
				.replaceAll("_osType_",
				"Debian_64");

		logger.info("Command to execute " + command);
		VirtualMachine vm = VirtualMachineDTO.mapVMDTOtoVM(vmDto);
		vm= virtualMachineRepository.save(vm);
		
		String output = executeCommand(command);
		CloudRequestDTO cloudRequest = new CloudRequestDTO();
		cloudRequest.setId(ThreadLocalRandom.current().nextInt());
		
		return cloudRequest;
	}

	@Override
	public List<VirtualMachineDTO> listVirtualMachine() {
		VirtualMachineDTO vm1 = new VirtualMachineDTO();
		vm1.setId(1);
		vm1.setVmName("Toto");
		vm1.setVmCPU(1);
		vm1.setVmMemory(2048);
		vm1.setVmIP("192.168.1.1");

		VirtualMachineDTO vm2 = new VirtualMachineDTO();
		vm2.setId(1);
		vm2.setVmName("Titi");
		vm2.setVmCPU(1);
		vm2.setVmMemory(2048);
		vm2.setVmIP("192.168.1.2");
		
		System.out.println(((List<VirtualMachine>)virtualMachineRepository.findAll()).size());

		List<VirtualMachineDTO> vms = StreamSupport
				.stream(virtualMachineRepository.findAll().spliterator(), false)
				.map(VirtualMachineDTO::mapVMtoVMDTO)
				.collect(Collectors.toList());
		System.out.println(vms.size());
		return vms;
	}

	private String executeCommand(String command) {

		StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String line = "";
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info(output.toString());

		return output.toString();

	}

}
