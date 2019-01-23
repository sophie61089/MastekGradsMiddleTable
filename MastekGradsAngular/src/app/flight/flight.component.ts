import { Component, OnInit } from '@angular/core';
import { Flight } from '../flight';
import { FlightService } from '../flight.service';

@Component({
  selector: 'app-flight',
  templateUrl: './flight.component.html',
  styleUrls: ['./flight.component.css']
})
export class FlightComponent implements OnInit {
flight:Flight[]

  constructor(private flightService:FlightService) {
    this.flight=[]
   }

   addNewFlight(newFlight:Flight){
     this.flightService.addNewFlight(newFlight).subscribe(
       res=>{
         this.flightService.getFlights().subscribe(
           res=>{this.flight=res}
         )
       }
     )
   }

  ngOnInit() {
     this.flightService.getFlights().subscribe(
      res=> {this.flight=res}
    )
  }
}
