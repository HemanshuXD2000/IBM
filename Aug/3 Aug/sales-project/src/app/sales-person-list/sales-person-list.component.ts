import { Component } from '@angular/core';
import { SalesPerson} from "./sales-person";

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent {

  salesPersonList: SalesPerson[] = [
    new SalesPerson("Tony","Stark","tony@starks.inc",50000),
    new SalesPerson("Natasha","Romonoff","romNat@starks.inc",75000),
    new SalesPerson("Pepper","Potts","ppotts@starks.inc",25000),
    new SalesPerson("Happy","Hopps","happy@starks.inc",85000)
  ]
}
