import { Injectable } from '@angular/core';
import { Flight } from './flight';
import { HttpClient } from '../../node_modules/@types/selenium-webdriver/http';
import { Observable } from '../../node_modules/rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlightService {
  rootURL: string;
  rootTrainingURL:string;

  constructor(private httpsvc: HttpClient) {
    this.rootURL = "http://localhost:9900/flight";
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
      this.rootURL + "/register", reqBody, httpOpts)
  }
}

