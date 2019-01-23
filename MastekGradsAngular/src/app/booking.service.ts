import { Injectable } from '@angular/core';
import { Booking } from './booking';
import { Observable } from '../../node_modules/rxjs';
import { HttpClient, HttpHeaders } from '../../node_modules/@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookingService {
  rootURL: string;

  constructor(private httpsvc: HttpClient) {
    this.rootURL = "http://localhost:9900/booking";
  }

  getBookings(): Observable<Booking[]> {
    return this.httpsvc.get<Booking[]>(this.rootURL + "/list")
  }

  addNewBooking(addNewBooking: Booking): Observable<Booking> {

    const httpOpts = {
      headers: new HttpHeaders(
        {
          'Content-Type':
            'application/x-www-form-urlencoded;charset=UTF-8'
        })
    }
    var reqBody = "bkId=" + addNewBooking.bookingId + "&bkTime=" + addNewBooking.time
    + "&bkDate=" + addNewBooking.date

    return this.httpsvc.post<Booking>(
      this.rootURL + "/book", reqBody, httpOpts)
  }
}


