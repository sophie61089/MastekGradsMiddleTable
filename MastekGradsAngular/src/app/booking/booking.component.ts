import { Component, OnInit } from '@angular/core';
import { Booking } from '../booking';
import { BookingService } from '../booking.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  booking:Booking[]

  constructor(private bookingService:BookingService) {
    this.booking=[]
   }

   addNewBooking(newBooking:Booking){
      this.bookingService.addNewBooking(newBooking).subscribe(
        res=>{
          this.bookingService.getBookings().subscribe(
            res=>{this.booking=res}
          )
        }
      )
   }

  ngOnInit() {
    this.bookingService.getBookings().subscribe(
      res=>{this.booking=res}
    )
  }
}
