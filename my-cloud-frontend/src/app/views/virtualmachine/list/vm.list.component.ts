import { Vm } from './../../../models/vm';
import { ReferentialService } from './../../../services/referential.service';
import { VirtualMachineService } from './../../../services/virtualmachineservice.service';

import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-vm-list',
  templateUrl: './vm.list.component.html',
  styleUrls: ['./vm.list.component.scss']
})
export class VirtualMachineListComponent implements OnInit {


  virtualMachines =  [];


  constructor(
    private vmSvc: VirtualMachineService,
    private referentialSvc: ReferentialService) {

    }

  ngOnInit(): void {
    this.vmSvc.getVirtualMachines().subscribe(
      virtualMachines => this.virtualMachines = virtualMachines,
      error => console.error(error)
    );
  }







}
