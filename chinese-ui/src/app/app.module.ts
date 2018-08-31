import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import {CoreModule} from './core/core.module';
import {CharacterModule} from './characters/character.module';
import {SignInComponent} from './users/sign-in.component';

import { CharacterService } from './services/character.service';
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';
import { ReactiveFormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    AdminComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    CoreModule,
    CharacterModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [ CharacterService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
