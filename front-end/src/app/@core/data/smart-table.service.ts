import { Injectable } from '@angular/core';

@Injectable()
export class SmartTableService {

  data = [{
    id: 1,
    name: 'Mark',
    genre: 'Otto',
    rate: '@mdo',
   
  }, {
    id: 2,
    name: 'Jacob',
    genre: 'Thornton',
    rate: '@fat',
  
  }, {
    id: 3,
    name: 'Larry',
    genre: 'Bird',
    rate: '@twitter',
  
  }, {
    id: 4,
    name: 'John',
    genre: 'Snow',
    rate: '@snow',

  }, {
    id: 5,
    name: 'Jack',
    genre: 'Sparrow',
    rate: '@jack',

  }, {
    id: 6,
    name: 'Ann',
    genre: 'Smith',
    rate: '@ann',

  }, {
    id: 7,
    name: 'Barbara',
    genre: 'Black',
    rate: '@barbara',

  }, {
    id: 8,
    name: 'Sevan',
    genre: 'Bagrat',
    rate: '@sevan',

  }, {
    id: 9,
    name: 'Ruben',
    genre: 'Vardan',
    rate: '@ruben',
   
  }, {
    id: 10,
    name: 'Karen',
    genre: 'Sevan',
    rate: '@karen',
 
  }, {
    id: 11,
    name: 'Mark',
    genre: 'Otto',
    rate: '@mark',
  
  }, {
    id: 12,
    name: 'Jacob',
    genre: 'Thornton',
    rate: '@jacob',
 
  }, {
    id: 13,
    name: 'Haik',
    genre: 'Hakob',
    rate: '@haik',
 
  }, {
    id: 14,
    name: 'Garegin',
    genre: 'Jirair',
    rate: '@garegin',
 
  }, {
    id: 15,
    name: 'Krikor',
    genre: 'Bedros',
    rate: '@krikor',
  
  
  }];

  getData() {
    return this.data;
  }
}
