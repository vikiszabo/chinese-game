import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HanzireferenceComponent } from './hanzireference.component';

describe('HanzireferenceComponent', () => {
  let component: HanzireferenceComponent;
  let fixture: ComponentFixture<HanzireferenceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HanzireferenceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HanzireferenceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
