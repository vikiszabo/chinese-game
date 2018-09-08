import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HanzireferenceComponent } from './hanzireference/hanzireference.component';
import { RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "./home/home.component";
import { NavigationComponent } from './navigation/navigation.component';
import { HttpClientModule } from "@angular/common/http";


const appRoutes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'reference', component: HanzireferenceComponent}
  ];

@NgModule({
  declarations: [
    AppComponent,
    HanzireferenceComponent,
    HomeComponent,
    NavigationComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
