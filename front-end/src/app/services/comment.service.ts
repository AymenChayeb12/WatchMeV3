import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class CommentService {
    tab:any[]
    constructor(
        private httpClient :HttpClient

    ) { }

    getComments (movieID){
        return this.httpClient.get("http://localhost:8080/movieComment?id="+movieID);

    }
     addComment(comment){
    
        return this.httpClient.post("http://localhost:8080/addComment/58",{'body':comment,'date':new Date()});
        
    }
}