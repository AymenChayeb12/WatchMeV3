import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { CommentService } from '../../../services/comment.service';
import { Router, ActivatedRoute } from '@angular/router';
import { FormGroup, FormArray, FormControl } from '@angular/forms';
import { Action } from 'rxjs/internal/scheduler/Action';




@Component({
  selector: 'ngx-datepicker',
  templateUrl: 'datepicker.component.html',
  styleUrls: ['datepicker.component.scss'],
})
export class DatepickerComponent implements OnInit {
  @ViewChild('comment') comment:ElementRef;
  comments: any;
  constructor(
    private commentService: CommentService,
    private router:Router,
    private routerLink  : ActivatedRoute
  ){}
  form = new FormGroup({
    topics: new FormArray([])

  });
    
  ngOnInit(){
   const movieid=this.routerLink.snapshot.queryParamMap.get("id")
   this.commentService.getComments(movieid).subscribe((data)=>{
     console.log(data);
     this.comments=data;
   })
  }

  Onclick(target){
    const movieid=this.routerLink.snapshot.queryParamMap.get("id")
  const url= "http://localhost:4200/#/pages/forms/datepicker"
   const c = this.comment.nativeElement.value;
   this.commentService.addComment(c).subscribe((data) =>{
    console.log(data);
    this.comments = data;
   }) 
   this.router.navigateByUrl(url);
   this.commentService.getComments( movieid).subscribe((data)=>{
    console.log(data);
    this.comments=data;
  })
   
  }
  
  
}
