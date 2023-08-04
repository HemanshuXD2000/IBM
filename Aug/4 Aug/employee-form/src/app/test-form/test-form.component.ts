import { Component } from '@angular/core';
import {TestData} from "../test-data";

@Component({
  selector: 'app-test-form',
  templateUrl: './test-form.component.html',
  styleUrls: ['./test-form.component.css']
})
export class TestFormComponent {
  testData = new TestData("John","Doe","john@mail.com");

  constructor() {
  }

  onSubmit()
  {
    alert(JSON.stringify(this.testData));
  }
}

