import { Routes } from '@angular/router';
import { SignInComponent } from './users/sign-in.component';
import {CharacterComponent} from './characters/character.component';

export const appRoutes: Routes = [
  { path: 'users/sign-in', component: SignInComponent, },
  { path: 'characters', component: CharacterComponent, }
];
