import { Component, OnInit } from '@angular/core';
import { HotelService } from '../hotel.service';
import { HotelReservation } from '../hotel-reservation';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-hotel',
  templateUrl: './hotel.component.html',
  styleUrls: ['./hotel.component.css']
})

export class HotelComponent implements OnInit {

  constructor(private httpReqs: HotelService) {

  }


  formData: HotelReservation = {
    hotelbookingid: null,
    occupants: null,
    roomsize: null,
    price: null,
    location: "",
    duration: null,
    latecheckout: false
  }

  roomsizes = [1, 2, 3, 4, 5, 6, 7, 8, 9]

  fillRequestTable = [{}]

  makeHotelRequest(occupants: number, roomsize: number, location: string, duration: number) {
    console.log(occupants)
    console.log("roomsize" + roomsize)
    console.log(location)
    console.log(duration)
    this.httpReqs.addReservationToTable(occupants,roomsize,location,duration).subscribe( res => {
      this.httpReqs.getRequestList().subscribe(res => {
        this.fillRequestTable = res;
      })
    })
  }

  ngOnInit() {
    console.log("ngOninit hotelComponent executed")
    this.httpReqs.getRequestList().subscribe(res => {
    this.fillRequestTable = res;
      //this.requests.push(this.formData);
      this.fillRequestTable.forEach(element => {
        console.log(element)
      })
    });
  }



}

