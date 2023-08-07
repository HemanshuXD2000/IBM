import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Tutorial} from "./tutorial";


@Injectable({
  providedIn: 'root'
})
export class TutorialService {

  private baseURL = "http://localhost:8057/api/v1/tutorials";
  constructor(private httpClient :HttpClient) { }

  getTutorialList() :Observable<Tutorial[]>{
    return this.httpClient.get<Tutorial[]>(`${this.baseURL}`);
  }

  createTutorial(tutorial :Tutorial) :Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}`,tutorial);
  }
}
