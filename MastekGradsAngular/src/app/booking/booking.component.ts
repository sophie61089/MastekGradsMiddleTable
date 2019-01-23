import { Component, OnInit } from '@angular/core';
import { BookingsService } from './bookings.service';
import { Booking } from './booking';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  bookings:Booking[]

  constructor(private bookService:BookingsService) { 
    this.bookings=[]
  }

  addNewBooking(newBooking:Booking){
    this.bookService.addNewBooking(newBooking).subscribe(
      res=>{
        this.bookService.getBookings().subscribe(
          res =>{this.bookings =res}
        )
      }
    )
  }

  deleteBooking(bookingId:number){
    this.bookService.deleteBooking(bookingId).subscribe(
      res=>{
        this.bookService.getBookings().subscribe(
          res =>{ this.bookings =res}
        )
      }
    )
  }


  ngOnInit() {
    
  this.bookService.getBookings().subscribe(
    res =>(this.bookings= res)
  )
  }
}