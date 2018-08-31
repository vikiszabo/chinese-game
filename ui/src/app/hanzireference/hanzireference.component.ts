import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-hanzireference',
  templateUrl: './hanzireference.component.html',
  styleUrls: ['./hanzireference.component.css']
})
export class HanzireferenceComponent implements OnInit {

  hanziList: string[];

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get<any[]>("http://localhost:9003/api/v1/chars").subscribe(
      value => {
        this.hanziList = value
      }
    )
  }

}
