import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class MovieService {
    constructor(
        private httpClient :HttpClient

    ) { }

    getMovies (){
        return this.httpClient.get("http://localhost:8080/movies");

    }
}