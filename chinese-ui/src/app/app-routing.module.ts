import { RouterModule, Routes } from '@angular/router';
import { SignInComponent } from './users/sign-in.component';
import { CharacterComponent } from './characters/character.component';
import { NgModule } from '@angular/core';
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'users/sign-in', component: SignInComponent, },
  { path: 'characters', component: CharacterComponent, }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule {

}


