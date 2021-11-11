import { VirtualMachineListComponent } from './list/vm.list.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VirtualMachineComponent } from './create/virtualmachine.component';



const routes: Routes = [
  {
    path: '',
    data: {
      title: 'VirtualMachine'
    },
    children: [
      {
        path: '',
        redirectTo: 'vm-list'
      },
      {
        path: 'vm-create',
        component: VirtualMachineComponent,
        data: {
          title: 'Create'
        }
      },
        {
          path: 'vm-list',
          component: VirtualMachineListComponent,
          data: {
            title: 'List'
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
