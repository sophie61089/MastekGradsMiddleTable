import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AccountComponent } from './account/account.component';
import { BookingComponent } from './booking/booking.component';
import { CustomerComponent } from './customer/customer.component';
import { FlightComponent } from './flight/flight.component';
import { HotelComponent } from './hotel/hotel.component';
import { TrainComponent } from './train/train.component';

@NgModule({
  declarations: [
    AppComponent,
    AccountComponent,
    BookingComponent,
    CustomerComponent,
    FlightComponent,
    HotelComponent,
    TrainComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
