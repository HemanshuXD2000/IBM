import {Component, OnInit} from '@angular/core';
import {TestData} from "../test-data";

@Component({
  selector: 'app-test-form',
  templateUrl: './test-form.component.html',
  styleUrls: ['./test-form.component.css']
})
export class TestFormComponent {

  testData = new TestData(
    1,'Hemanshu','Hello World',
    'Black','Spring',[false,true,true,false]
  );
  colors = ['Red','Blue','Yellow','Purple','Green','Black','Orange','Green'];
  seasons = ['Spring','Summer','Autumn','Winter'];
  hobbies = ['Reading','Writing','Painting','Walking']

  constructor() {
  }

  onSubmit()
  {
    alert(JSON.stringify(this.testData));
  }
}
