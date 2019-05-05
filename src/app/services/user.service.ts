import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from 'src/model/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  // Dependency Injection - injecting built in http service
  // inside constructor
  constructor(private http:HttpClient) { }

  baseUrl:string = "http://localhost:3000/users";

  // Get All Users
  getUsers(){
      return this.http.get<User[]>(this.baseUrl);
  }
  // Get Users By Id
  getUsersById(id:number){
    return this.http.get<User>(this.baseUrl+"/"+id);
  }
  // Add user
  createUser(user: User){
    return this.http.post(this.baseUrl,user);
  }
  // Modify user
  updateUser(user:User){
    return this.http.put(this.baseUrl+'/'+user.id,user);
  }
  // Delete Users By Id
  deleteUser(id:number){
    return this.http.delete(this.baseUrl+"/"+id);
  }
}
