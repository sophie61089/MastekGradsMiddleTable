import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
<<<<<<< HEAD
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
  {path:'flight', component:FlightComponent},
  {path:'hotel', component:HotelComponent},
  {path:'train', component:TrainComponent}
=======
import { FlightComponent } from './flight/flight.component';

const routes: Routes = [
  {path:'flight',component:FlightComponent}
>>>>>>> 21c1677d0f62be68aedc99cb0c2fda22e3313f21
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
