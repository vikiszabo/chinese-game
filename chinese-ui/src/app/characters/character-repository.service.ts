import {Injectable} from '@angular/core';
import {UserRepositoryService} from '../core/user-repository.service';
import {Observable} from 'rxjs';


@Injectable()
export class CharacterRepositoryService {

  constructor(private userRepository: UserRepositoryService) {}

}

const characters = [{
  charNumber: 1,
  pinyin: 'hao',
  symbol: '好'

}, {
  charNumber: 2,
  pinyin: 'ni',
  symbol: '你'
  }];

const words = [{
  pinyin: 'nihao',
  chars: [characters[0], characters[1]]
}]
