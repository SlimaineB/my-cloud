import { TestBed } from '@angular/core/testing';

import { NfsService } from './nfs.service';

describe('NfsService', () => {
  let service: NfsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NfsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
