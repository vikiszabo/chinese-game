import { Component, OnInit } from '@angular/core';
import {CharacterService} from '../../services/character.service';
import {FormGroup, FormControl, Validators } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  level: string[] = [
    'HSK1',
    'HSK2',
    'HSK3',
    'HSK4',
    'HSK5',
    'HSK6'
  ];
  characterform: FormGroup;
  validMessage: string = "";

  constructor(private characterService: CharacterService) { }

  ngOnInit() {
    this.characterform = new FormGroup({
      name: new FormControl('', Validators.required),
      pinyin: new FormControl('', Validators.required),
      level: new FormControl('', Validators.required),
      student: new FormControl()
    });
  }

  submitRegistration() {
    if (this.characterform.valid) {
      this.validMessage = "Your character registration has been submitted. Thank you!";
      this.characterService.createCharacterRegistration(this.characterform.value).subscribe(
        data => {
          this.characterform.reset();
          return true;
        },
        error => {
          return Observable
        }
      )
    }
  }

}
