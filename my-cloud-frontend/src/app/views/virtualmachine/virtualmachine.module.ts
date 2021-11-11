import { VirtualMachineComponent } from './virtualmachine.component';
// Angular
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';




// Components Routing
import { VirtualMachineRoutingModule } from './virtualmachine-routing.module';

@NgModule({
  imports: [
    CommonModule,
    ReactiveFormsModule,
    VirtualMachineRoutingModule
  ],
  declarations: [
    VirtualMachineComponent
  ]
})
export class VirtualMachineModule {




}
