import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'project-store';

  items = ['nicolas', 'juan', 'marco'];

  addItem(){
    this.items.push ('nuevo item');
  }
  deleteItem(index: number) {
    this.items.splice(index, 1);
  }
}






<input type="text" [(ngModel)]="title">
{{title}}

<div *ngIf="title === 'nicolas'">
    Este es un div
</div>

<button (click)="addItem()">AddItem</button>

<ul>
    <li *ngIf="items.length === 0">la lista esta vacia</li>
    <li *ngFor="let name of items; index as i">
        {{ name }} {{ i }}
        <button (click)="deleteItem(i)")>delete</button>
    </li>
</ul>

https://www.pcprogramasymas.net/aprender-php-mysql-y-javascript-con-jquery-css-y-html5-5a-edi-pdf/
