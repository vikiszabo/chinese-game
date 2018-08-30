import {Injectable} from '@angular/core';
import {Observable, Subject} from 'rxjs';
import 'rxjs/add/operator/map';


@Injectable()
export class UserRepositoryService {
  currentUser: any;

  constructor()


  saveUser(user): Observable<any> {
    this.currentUser = Object.assign({}, user, {classes:
      user.classes || []});

    return Observable.empty().delay(1000);
  }

  enroll(classId): Observable<any> {
    if (!this.currentUser)
      return Observable.throwError('User not signed in');

    if (this.currentUser.classes.includes[classId])
      return Observable.throwError('Already enrolled');

    this.currentUser = Object.assign({}, this.currentUser,
      {classes: this.currentUser.classes.concat([classId])});

    return Observable.empty().delay(1000);
  }

  drop(classId): Observable<any> {
    if (!this.currentUser)
      return Observable.throwError('User not signed in');

    if (!this.currentUser.classes.includes(classId))
      return Observable.throwError('Not enrolled');

    this.currentUser = Object.assign({}, this.currentUser,
      {
        classes: this.currentUser.classes.filter(c => c.classId !==
          classId)
      });

    return Observable.empty().delay(1000);
  }

  signIn(credentials): Observable<any> {
    //Never, ever check credentials in client-side code.
    //This code is only here to supply a fake endpoint for signing in.
    if (credentials.email !== 'me@chinesegame.edu' || credentials.password !== 'super-secret')
      return Observable.throwError('Invalid login');

    this.currentUser = {
      userId: 'e61aebed-dbc5-437a-b514-02b8380d8efc',
      firstName: 'Viki',
      lastName: 'Szabo',
      email: 'me@chinesegame.edu',
      classes: ['24ab7b14-f935-44c1-b91b-8598123ea54a']
    };

    return Observable.empty();
  }
}

const users = [{
  userId: 'e61aebed-dbc5-437a-b514-02b8380d8efc',
  firstName: 'Jim',
  lastName: 'Cooper',
  email: 'someones-email@gmail.com',
  password: 'supersecret',
  classes: ['24ab7b14-f935-44c1-b91b-8598123ea54a']
}];


