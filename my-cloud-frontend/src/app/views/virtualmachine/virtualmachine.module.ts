import { VirtualMachineComponent } from './virtualmachine.component';
// Angular
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';




// Components Routing
import { VirtualMachineRoutingModule } from './virtualmachine-routing.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    VirtualMachineRoutingModule
  ],
  declarations: [
    VirtualMachineComponent
  ]
})
export class VirtualMachineModule { }
