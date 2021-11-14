import { SharedFileSystemComponent } from './create/sharedfilesystem.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';




const routes: Routes = [
  {
    path: '',
    data: {
      title: 'SharedFilesystem'
    },
    children: [
      {
        path: '',
        redirectTo: 'nfs-list'
      },
      {
        path: 'nfs-create',
        component: SharedFileSystemComponent,
        data: {
          title: 'Create'
        }
      },
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SharedFileSystemRoutingModule {}
