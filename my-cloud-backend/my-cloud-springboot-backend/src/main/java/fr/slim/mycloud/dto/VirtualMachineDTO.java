package fr.slim.mycloud.dto;

import fr.slim.mycloud.domain.entity.VirtualMachine;

public class VirtualMachineDTO {

	private Integer id;
	private String vmName;	
	private String vmType;
	private Integer vmCPU;
	private Integer vmMemory;
	private String vmIP;

	
	public VirtualMachineDTO() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getVmName() {
		return vmName;
	}


	public void setVmName(String vmName) {
		this.vmName = vmName;
	}


	public String getVmType() {
		return vmType;
	}


	public void setVmType(String vmType) {
		this.vmType = vmType;
	}


	public Integer getVmCPU() {
		return vmCPU;
	}


	public void setVmCPU(Integer vmCPU) {
		this.vmCPU = vmCPU;
	}


	public Integer getVmMemory() {
		return vmMemory;
	}


	public void setVmMemory(Integer vmMemory) {
		this.vmMemory = vmMemory;
	}


	public String getVmIP() {
		return vmIP;
	}


	public void setVmIP(String vmIP) {
		this.vmIP = vmIP;
	}


	@Override
	public String toString() {
		return "VirtualMachineDTO [id=" + id + ", vmName=" + vmName + ", vmType=" + vmType + ", vmCPU=" + vmCPU
				+ ", vmMemory=" + vmMemory + ", vmIP=" + vmIP + "]";
	}

	
	public static VirtualMachineDTO mapVMtoVMDTO(VirtualMachine vm) {
		VirtualMachineDTO dto = new VirtualMachineDTO();
		dto.setId(vm.getId());
		dto.setVmName(vm.getVmName());
		dto.setVmType(vm.getVmType());
		dto.setVmIP(vm.getVmIP());
		dto.setVmCPU(vm.getVmCPU());
		dto.setVmMemory(vm.getVmMemory());
		
		return dto;
	}
	
	public static VirtualMachine mapVMDTOtoVM(VirtualMachineDTO dto) {
		VirtualMachine vm = new VirtualMachine();
		vm.setId(dto.getId());
		vm.setVmName(dto.getVmName());
		vm.setVmType(dto.getVmType());
		vm.setVmIP(dto.getVmIP());
		vm.setVmCPU(dto.getVmCPU());
		vm.setVmMemory(dto.getVmMemory());
		
		return vm;
	}


	
}
