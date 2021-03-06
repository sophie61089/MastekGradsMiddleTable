import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { BookingComponent } from './booking/booking.component';
import { CustomerComponent } from './customer/customer.component';
import { FlightComponent } from './flight/flight.component';
import { HotelComponent } from './hotel/hotel.component';
import { TrainComponent } from './train/train.component';

const routes: Routes = [
  {path:'', component:AccountComponent},
  {path:'booking', component:BookingComponent},
  {path:'customer', component:CustomerComponent},
  {path:'flights', component:FlightComponent},
  {path:'hotels', component:HotelComponent},
  {path:'trains', component:TrainComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
