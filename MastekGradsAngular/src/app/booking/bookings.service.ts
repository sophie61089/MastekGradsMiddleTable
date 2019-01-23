import { Injectable } from '@angular/core';;
import { Booking } from './booking';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookingsService {

  rootURL:string

  constructor(private httpsvc:HttpClient) {  
    this.rootURL="http://localhost:4200/Bookings"
  }

  getBookings():Observable<Booking[]>{
    return this.httpsvc.get<Booking[]>(this.rootURL+"/list")
  }

  addNewBooking(newBooking:Booking):Observable<Booking>{

    const httpOpts ={         
      headers: new HttpHeaders(
        {'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8'})
    }
  var reqBody="company="+newBooking.company

  return this.httpsvc.post<Booking>(this.rootURL+"/register",reqBody,httpOpts)
 }

 deleteBooking(BookingId:number):Observable<Booking>{
     return this.httpsvc.request<Booking>('DELETE',this.rootURL+"/delete",
    {
          headers: new HttpHeaders({'Content-Type': 'text/plain'}),
          body: BookingId
      })
    }
  }