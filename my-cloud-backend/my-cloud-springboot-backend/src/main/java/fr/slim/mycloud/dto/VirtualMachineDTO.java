package fr.slim.mycloud.dto;


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



	
}
