import { Component, OnInit } from '@angular/core';
import { User } from 'src/model/user.model';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {
  // creating an Array of User class
  users: User[];
  public searchText: any;

  // Constructor Dependency Injection
  constructor(private router: Router
    , private userService: UserService) { }

  // loading all users as soon as component
  // gets loaded
  ngOnInit() {
    if (localStorage.getItem("username") != null) {
      this.userService.getUsers()
        .subscribe(data => {
          this.users = data;
        });
    }
    else {
      this.router.navigate(['/login']);
    }
  }

  // logOff User
  logOutUser(): void {
    if (localStorage.getItem("username") != null) {
      localStorage.removeItem("username");
      this.router.navigate(['/login']);
    }
  }
  // Delete User
  deleteUser(user: User): void {
    let result = confirm("Do you want to delete user?");
    if (result) {
      this.userService.deleteUser(user.id)
        .subscribe(data => {
          this.users = this.users.filter
            (u => u !== user);
        })
    }
  }
  // Modify User
  editUser(user: User): void {
    localStorage.removeItem("editUserId");
    localStorage.setItem("editUserId",
      user.id.toString());
    //  this.router.navigate(['edit-user']);
    this.router.navigate(['edit-user', 
    user.id.toString()]);
  }

  // Add New User
  addUser(): void {
    this.router.navigate(['add-user']);
  }
}
