package fr.slim.mycloud;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.slim.mycloud.config.VirtualBoxCommandConfig;

@SpringBootTest
class MycloudSpringbootApplicationTests {
	
	@Autowired
	VirtualBoxCommandConfig vbCmdConfig;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreateVm() {
		
		
		 //assertThat(vbCmdConfig.getCreateVm()).isEqualTo("Test");
	}

}
