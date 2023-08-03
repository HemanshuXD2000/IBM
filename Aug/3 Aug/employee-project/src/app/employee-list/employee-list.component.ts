import { Component } from '@angular/core';
import {Employee} from "./employee";


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent {

  employeeList: Employee[] = [
    new Employee("Pepper","Potts","ppotts@starks.inc"),
    new Employee("Happy","Hops","hops@starks.inc")
  ]
}
