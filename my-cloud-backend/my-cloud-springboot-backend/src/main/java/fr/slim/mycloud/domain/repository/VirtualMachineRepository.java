package fr.slim.mycloud.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.slim.mycloud.domain.entity.VirtualMachine;

@Repository
public interface VirtualMachineRepository extends CrudRepository<VirtualMachine, Integer> {

	
	
}
