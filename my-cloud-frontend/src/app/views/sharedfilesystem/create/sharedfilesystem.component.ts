import { NfsService } from './../../../services/nfs.service';
import { Nfs } from './../../../models/nfs';
import { ReferentialService } from './../../../services/referential.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-sharedfilesystem',
  templateUrl: './sharedfilesystem.component.html',
  styleUrls: ['./sharedfilesystem.component.scss']
})
export class SharedFileSystemComponent implements OnInit {

  vmTypes = ["test1","test2"];
  nfsForm = new FormGroup({
    nfsSize: new FormControl(1, Validators.required),
});

  constructor(
    private nfsSvc: NfsService,
    private referentialSvc: ReferentialService) {

    }

  ngOnInit(): void {
    this.referentialSvc.vmTypes().subscribe(
      vmTypes => this.vmTypes = vmTypes,
      error => console.error(error)
    );
  }


  createNFS(){

    const newNFS: Nfs = Object.assign({}, this.nfsForm.value);

    this.nfsSvc.createNfs(newNFS).subscribe(
      cloudRequest => {
        console.log("OK "+cloudRequest.id);
        this.reset();},
      error => console.error(error)
    );
}


reset() {


 this.nfsForm.reset({
    nfsSize:1
  });
}

}
