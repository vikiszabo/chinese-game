import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import {CoreModule} from './core/core.module';
import {CharacterModule} from './characters/character.module';
import {SignInComponent} from './users/sign-in.component';

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent
  ],
  imports: [
    BrowserModule,
    CoreModule,
    CharacterModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
