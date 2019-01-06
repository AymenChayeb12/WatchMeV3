import {Component, OnDestroy, OnInit} from '@angular/core';
import { NbThemeService } from '@nebular/theme';
import { takeWhile } from 'rxjs/operators' ;
import { MovieService } from '../../services/movie.service';
import { SmartTableService } from '../../@core/data/smart-table.service';
import { LocalDataSource } from 'ng2-smart-table';

interface CardSettings {
  title: string;
  iconClass: string;
  type: string;
}

@Component({
  selector: 'ngx-dashboard',
  styleUrls: ['./dashboard.component.scss'],
  templateUrl: './dashboard.component.html',
})


export class DashboardComponent implements OnInit {

  settings = {
    add: {
    addButtonContent: '<i class="nb-plus"></i>',
    createButtonContent: '<i class="nb-checkmark"></i>',
    cancelButtonContent: '<i class="nb-close"></i>',
  },
  edit: {
    editButtonContent: '<i class="nb-edit"></i>',
    saveButtonContent: '<i class="nb-checkmark"></i>',
    cancelButtonContent: '<i class="nb-close"></i>',
  },
  delete: {
    deleteButtonContent: '<i class="nb-trash"></i>',
    confirmDelete: true,
  },
  columns: {
    id: 
    {
      title: 'Name',
      type: 'string',
    },
    name: {
      title: 'Genre',
      type: 'string',
    },
    genre: {
      title: 'Rate',
      type: 'string',
    },
    rate: {
      title: 'Link',
      type: 'string',
    },
    link: {
      title: 'Link',
      type: 'string',
    },
 
  },
};

  
source: LocalDataSource = new LocalDataSource();
  movies: any;
  constructor(
    private movieService: MovieService,
    // private service: SmartTableService
  ){
  // const data = this.service.getData();
   //this.source.load(data);  
  }
    
  ngOnInit(){
 
   this.movieService.getMovies().subscribe((data)=>{
     console.log(data[0][0]);
     this.movies=data;
    this.source.load(this.movies);
   })
  }
}
