import { Component } from '@angular/core';
import {Tutorial} from "../tutorial";
import {TutorialService} from "../tutorial.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-tutorial',
  templateUrl: './create-tutorial.component.html',
  styleUrls: ['./create-tutorial.component.css']
})
export class CreateTutorialComponent {
 tutorial :Tutorial = new Tutorial();
 constructor(private tutorialService :TutorialService,
             private router :Router) {
 }

 saveTutorial()
 {
   this.tutorialService.createTutorial(this.tutorial).subscribe(data =>
   {
     console.log(data);
     this.goToTutorial();
   },
     error => console.log(error));
 }

 goToTutorial(){
   this.router.navigate(['/tutorials']);
 }

 onSubmit()
 {
   console.log(this.tutorial);
   this.saveTutorial();
 }
}
