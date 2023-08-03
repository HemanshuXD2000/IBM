import { Component } from '@angular/core';
import {Location} from "./location";

@Component({
  selector: 'app-location-list',
  templateUrl: './location-list.component.html',
  styleUrls: ['./location-list.component.css']
})
export class LocationListComponent {
  locationList :Location[] = [
    new Location("BCIT Tech Park","Bangalore"),
    new Location("Manyata Tech park", "Bangalore")
  ]
}
