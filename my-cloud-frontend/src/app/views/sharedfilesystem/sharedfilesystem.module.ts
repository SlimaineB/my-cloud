import { ReactiveFormsModule } from '@angular/forms';
import { SharedFileSystemRoutingModule } from './sharedfilesystem-routing.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SharedFileSystemComponent } from './create/sharedfilesystem.component';



@NgModule({
  declarations: [
    SharedFileSystemComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    SharedFileSystemRoutingModule
  ]
})
export class SharedFileSystemModule { }
