import { VirtualMachineListComponent } from './list/vm.list.component';
import { VirtualMachineComponent } from './create/virtualmachine.component';

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
    VirtualMachineComponent,
    VirtualMachineListComponent
  ]
})
export class VirtualMachineModule {




}
