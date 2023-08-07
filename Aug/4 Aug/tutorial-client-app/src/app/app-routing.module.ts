import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {TutorialListComponent} from "./tutorial-list/tutorial-list.component";
import {CreateTutorialComponent} from "./create-tutorial/create-tutorial.component";

const routes: Routes = [
  {path: 'tutorials', component :TutorialListComponent},
  {path: 'create-tutorial', component :CreateTutorialComponent},
  {path: '', redirectTo: 'tutorials', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
