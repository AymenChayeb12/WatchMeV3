import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class PurchaseService {
    constructor(
        private httpClient :HttpClient

    ) { }

    getProductBought (){
        return this.httpClient.get("http://localhost:8080/productBought/11");

    }
}