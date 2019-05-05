import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
 title:string= "welcome to angular 6";
 
 
 
 
  submitted:boolean = true;
  // date
  todaysDate = new Date();
  // json data
  cust = {
    name:'Mukund',
    age:25,
    address:{
      city:'Bangalore',
      state:'Karnataka'
    }
  };
  // Array data
  months = ["Jan","Feb","Mar","Apr","May","Jun",
"Jul","Aug","Sep","Oct","Nov","Dec"];

  constructor() { }

  ngOnInit() {
  }

}
