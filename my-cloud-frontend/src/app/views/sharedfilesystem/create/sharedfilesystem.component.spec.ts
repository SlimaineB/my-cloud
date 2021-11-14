import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SharedFileSystemComponent } from './sharedfilesystem.component';

describe('SharedFileSystemComponent', () => {
  let component: SharedFileSystemComponent;
  let fixture: ComponentFixture<SharedFileSystemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SharedFileSystemComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SharedFileSystemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
