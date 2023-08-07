import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {observableToBeFn} from "rxjs/internal/testing/TestScheduler";
import {Observable} from "rxjs";
import {EmployeeTs} from "./employee.ts";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private baseURL = "http://localhost:49598/employees";

  constructor(private httpClient :HttpClient) { }

  getEmployeeList() :Observable<EmployeeTs[]>
  {
    return this.httpClient.get<EmployeeTs[]>(`${this.baseURL}`);
  }

  createEmployee(employee :EmployeeTs) :Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}`,employee);
  }
}
