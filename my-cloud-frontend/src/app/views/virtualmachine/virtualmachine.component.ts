import { VirtualMachineService } from './../../services/virtualmachineservice.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-virtualmachine',
  templateUrl: './virtualmachine.component.html',
  styleUrls: ['./virtualmachine.component.scss']
})
export class VirtualMachineComponent implements OnInit {

  constructor(private vmService: VirtualMachineService) { }

  ngOnInit(): void {
    console.log(">>>>>>>>> ngOnInit");
    this.vmService.addVirtualMachine();

  }




}
