import {Component, EventEmitter, Input, Output} from '@angular/core';


@Component({
  selector: 'account-menu',
  styleUrls: ['./account-menu.component.css'],
  templateUrl: './account-menu.component.html'
})

export class AccountMenuComponent {
  @Input() user;
  @Output() signedOut: EventEmitter<any> = new EventEmitter<any>();
  showMenu: boolean

  signOut() {
    this.showMenu = false;
    this.signedOut.emit();
  }
}
