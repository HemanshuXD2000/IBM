import { Injectable } from '@angular/core';

import { HttpClient} from "@angular/common/http";
import { Observable} from "rxjs";
import { User} from "./user";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseURL = "http://hemanshu-pc:9999/USER-SERVICE/userservice";
  constructor(private httpClient :HttpClient) {
  }

  getUserList() :Observable<User[]>{
    return this.httpClient.get<User[]>(`${this.baseURL}`);
  }
}
