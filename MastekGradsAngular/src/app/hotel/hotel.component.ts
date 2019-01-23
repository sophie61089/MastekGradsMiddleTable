import { Component, OnInit } from '@angular/core';
import { HotelService } from '../hotel.service';
import {HotelReservation } from '../hotel-reservation';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-hotel',
  templateUrl: './hotel.component.html',
  styleUrls: ['./hotel.component.css']
})

export class HotelComponent implements OnInit {

  constructor(private httpReqs: HotelService) { 

  }


  ngOnInit() {
    console.log("ngOninit hotelComponent executed")
   
     this.httpReqs.getRequestList().subscribe(res => { this.fillRequestTable = res;   
        //this.requests.push(this.formData);
        this.fillRequestTable.forEach(element => {
          console.log(element)
            })
          });
  }

  newHotelReservationData: HotelReservation = {
    hotelbookingid: null,
    occupants: null,
    roomsize: null,
    price: null,
    location: "",
    duration: null,
    latecheckout: false
  }

  fillRequestTable = [{}]

}

