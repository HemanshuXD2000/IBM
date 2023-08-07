import { Component } from '@angular/core';
import {Tutorial} from "../tutorial";
import {TutorialService} from "../tutorial.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-tutorial-list',
  templateUrl: './tutorial-list.component.html',
  styleUrls: ['./tutorial-list.component.css']
})
export class TutorialListComponent {
  tutorials :Tutorial[] = [];

  constructor(private tutorialService :TutorialService,
              private router :Router) {
  }

  ngOnInit(){
    this.getTutorial();
  }

  private getTutorial()
  {
    this.tutorialService.getTutorialList().subscribe(data =>
    {
      this.tutorials = data;
    });
  }
}
