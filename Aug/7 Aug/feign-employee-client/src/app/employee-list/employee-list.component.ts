import { Component } from '@angular/core';
import {EmployeeTs} from "../employee.ts";
import {EmployeeService} from "../employee.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent {
  employees :EmployeeTs[] = [];

  constructor(private employeeService :EmployeeService,
              private router :Router) {
  }

  ngOnInit() :void
  {
    this.getEmployees();
  }

  private getEmployees()
  {
    this.employeeService.getEmployeeList().subscribe(data =>
    {
      this.employees = data;
    });
  }
}
