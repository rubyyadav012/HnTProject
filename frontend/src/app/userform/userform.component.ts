import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {
  user = {
    name: 'Rubyyadav',
    age: 10
  }
  users: any[] = [];
  constructor(public userService: UserService) { }

  deleteUser(id:number){
    const observable = this.userService.deleteUser(id);
    observable.subscribe((responseBody: any) => {
      console.log(responseBody);
    
    },
      (error: any) => {
        console.log(error);
      }
    );
  }
  saveUser() {
    console.log('clicked');
    const observable = this.userService.save(this.user);
    observable.subscribe((responseBody: any) => {
      console.log(responseBody);
      this.users.push(responseBody);
    },
      (error: any) => {
        console.log(error);
      }
    );
  }
  ngOnInit(): void {
    const observable = this.userService.getUsers();
    observable.subscribe((usersFromServer:any)=>{
      this.users=usersFromServer;
    })
  }

}