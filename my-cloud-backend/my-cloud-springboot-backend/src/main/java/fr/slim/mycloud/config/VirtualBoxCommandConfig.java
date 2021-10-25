package fr.slim.mycloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "vb.cmd", ignoreUnknownFields = false)
public class VirtualBoxCommandConfig {

	
	private String createVm;

	public String getCreateVm() {
		return createVm;
	}

	public void setCreateVm(String createVm) {
		this.createVm = createVm;
	}



	
	
	
}
