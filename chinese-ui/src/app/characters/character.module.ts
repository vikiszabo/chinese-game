import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';
import {CharacterComponent} from './character.component';
import {CharacterRepositoryService} from './character-repository.service';

@NgModule({
  imports: [ RouterModule ],
  exports: [ ],
  declarations: [ CharacterComponent ],
  providers: [ CharacterRepositoryService ]
})

export class CharacterModule { }
