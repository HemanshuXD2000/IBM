import { Component } from '@angular/core';
import {Department} from "./department";

@Component({
  selector: 'app-department-list',
  templateUrl: './department-list.component.html',
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent {
  departmentList: Department[] = [
    new Department("IT"),
    new Department("Sales"),
    new Department("Marketing")
  ]
}
