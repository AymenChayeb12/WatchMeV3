import { Component, OnInit } from '@angular/core';
import { PurchaseService } from '../../services/purchase.service';

@Component({
  selector: 'ngx-ecommerce',
  templateUrl: './e-commerce.component.html',
})
export class ECommerceComponent implements OnInit {
  movies: any;
  constructor(
    private purchaseService: PurchaseService
  ){}
    
  ngOnInit(){
 
   this.purchaseService.getProductBought().subscribe((data)=>{
     console.log(data);
     this.movies=data;
   })
  }
}
