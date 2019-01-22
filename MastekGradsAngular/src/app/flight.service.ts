import { Injectable } from '@angular/core';
import { Flight } from './flight';
import { Observable } from '../../node_modules/rxjs';
import { HttpClient, HttpHeaders } from '../../node_modules/@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FlightService {
  rootURL: string;
  rootTrainingURL:string;

  constructor(private httpsvc: HttpClient) {
    this.rootURL = "http://localhost:9900/flights";
  }

  getFlights(): Observable<Flight[]> {
    return this.httpsvc.get<Flight[]>(this.rootURL + "/list")
  }

  addNewFlight(newFlight: Flight): Observable<Flight> {

    const httpOpts = {
      headers: new HttpHeaders(
        {
          'Content-Type':
            'application/x-www-form-urlencoded;charset=UTF-8'
        })
    }
    var reqBody = "flightNo=" + newFlight.flightNo + "&departureDate=" + newFlight.departureDate 
    + "&arrivalDate=" + newFlight.arrivalDate + "&flightOrigin=" + newFlight.flightOrigin
    + "&flightDestination=" + newFlight.flightDestination + "&departureDate=" + newFlight.airline
    + "&flightPrice=" + newFlight.flightPrice

    return this.httpsvc.post<Flight>(
      this.rootURL + "/book", reqBody, httpOpts)
  }
}

