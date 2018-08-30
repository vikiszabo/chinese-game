import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  styles: [`
      .app {
        width: 1000px;
        margin: auto;
      }
      .main {
        background-color:white;      
      }
    `],
  template: `
    <div class="app">
      <wp-nav-bar></wp-nav-bar>
      <div class="main">
      </div>
    </div>
  `,
})
export class AppComponent  {  }
