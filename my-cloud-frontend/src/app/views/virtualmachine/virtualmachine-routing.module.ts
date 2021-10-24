import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VirtualMachineComponent } from './virtualmachine.component';


const routes: Routes = [
  {
    path: '',
    data: {
      title: 'VirtualMachine'
    },
    children: [
      {
        path: '',
        redirectTo: 'virtualmachine'
      },
      {
        path: 'virtualmachine',
        component: VirtualMachineComponent,
        data: {
          title: 'Create'
        }
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class VirtualMachineRoutingModule {}
