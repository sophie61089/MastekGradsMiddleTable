import { Injectable } from '@angular/core';
import { Customer } from './customer';
import { Observable } from '../../node_modules/rxjs';
import { HttpClient, HttpHeaders } from '../../node_modules/@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  rootURL: string;

  constructor(private httpsvc: HttpClient) {
    this.rootURL = "http://localhost:9900/flights";
  }

  getCustomers(): Observable<Customer[]> {
    return this.httpsvc.get<Customer[]>(this.rootURL + "/list")
  }

  addNewCustomer(newCustomer: Customer): Observable<Customer> {

    const httpOpts = {
      headers: new HttpHeaders(
        {
          'Content-Type':
            'application/x-www-form-urlencoded;charset=UTF-8'
        })
    }
    var reqBody = "customerId=" + newCustomer.customerId + "&customerName=" + newCustomer.customerName 
    

    return this.httpsvc.post<Customer>(
      this.rootURL + "/book", reqBody, httpOpts)
  }
}

