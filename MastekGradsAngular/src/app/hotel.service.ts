import { Injectable } from '@angular/core';
import { HotelReservation } from './hotel-reservation';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HotelService {

  rootURL: string;
  
  constructor(private httpRequests: HttpClient) {
    this.rootURL = "http://localhost:8080/hotel"
   }

   getRequestList():Observable<HotelReservation[]>{
     return this.httpRequests.get<HotelReservation[]>(this.rootURL+"/list")
   }

   addReservationToTable(occupants:number,roomSize:number,location:string,duration:number):Observable<HotelReservation[]>{
      const httpOpts = {
        headers: new HttpHeaders(
          {'Content-Type':
          'application/x-www-form-urlencoded;charset=UTF-8'})
        }
          //var request = "occupants=" + occupants + "&roomSize=" + roomsize + "&location=" + location + "&durationInDays=" + duration;
          var request = "occupants=" + occupants + "&roomSize=" + roomSize + "&location=" + location + "&durationInDays=" + duration;
          
          //return this.httpRequests.post<any>(this.rootURL+"/register/", request, httpOpts)
          return this.httpRequests.post<any>(this.rootURL+"/register",request,httpOpts )
      }
    }
