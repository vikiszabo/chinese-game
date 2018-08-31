import { Component, OnInit } from '@angular/core';
import {CharacterService} from '../../services/character.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  public characters;

  constructor(private characterService: CharacterService) { }

  ngOnInit() {
  }

}
