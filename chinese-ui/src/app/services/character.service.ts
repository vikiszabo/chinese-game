import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json'})
};


@Injectable()
export class CharacterService {

  constructor(private http: HttpClient) {}

  getChars() {
    return this.http.get('server/api/v1/chars');
  }

  getBike(id: number) {
    return this.http.get('server/api/v1/chars' + id);
  }

  createCharacterRegistration(character) {
    let body = JSON.stringify(character);
    return this.http.post('server/api/v1/chars', body, httpOptions);
  }
}
