import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { UserformComponent } from './userform/userform.component';
import { HttpClientModule } from '@angular/common/http';
import { UserlistComponent } from './userlist/userlist.component';
import { RouterModule, Routes } from '@angular/router';

const routes:Routes =[
  {path:'userForm',component:UserformComponent},
  {path:'userlist',component:UserlistComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    UserformComponent,
    UserlistComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule,RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]//load this component at the beginning
})
export class AppModule { }
