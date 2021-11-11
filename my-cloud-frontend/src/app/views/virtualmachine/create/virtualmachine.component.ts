import { Vm } from './../../../models/vm';
import { ReferentialService } from './../../../services/referential.service';
import { VirtualMachineService } from './../../../services/virtualmachineservice.service';

import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-vm-create',
  templateUrl: './virtualmachine.component.html',
  styleUrls: ['./virtualmachine.component.scss']
})
export class VirtualMachineComponent implements OnInit {


  vmTypes = ["test1","test2"];
  vmForm = new FormGroup({
    "vmName": new FormControl("", Validators.required),
    "vmType": new FormControl(0, Validators.required),
    "vmIP": new FormControl("192.168.10.xxx", Validators.required),
    "vmCPU": new FormControl("2", Validators.required),
    "vmMemory": new FormControl("2048", Validators.required),

});

  constructor(
    private vmSvc: VirtualMachineService,
    private referentialSvc: ReferentialService) {

    }

  ngOnInit(): void {
    this.referentialSvc.vmTypes().subscribe(
      vmTypes => this.vmTypes = vmTypes,
      error => console.error(error)
    );
  }


  createVm(){



    const newVM: Vm = Object.assign({}, this.vmForm.value);
    console.log("New Created VM");
    console.log(newVM);
    this.vmSvc.createVirtualMachine(newVM).subscribe(
      cloudRequest => {
        console.log("OK "+cloudRequest.id);
        this.reset();},
      error => console.error(error)
    );
}


reset() {
  console.log("Reset form ");

 this.vmForm.reset({
    vmName:"",
    vmType:0,
    vmIP: "192.168.10.xxx",
    vmCPU: 2,
    vmMemory: 2048
  });
}


}
