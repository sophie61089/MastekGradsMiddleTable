import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '../../node_modules/@angular/common/http';
import { Observable } from '../../node_modules/rxjs';
import { Train } from './train';


@Injectable({
  providedIn: 'root'
})
export class TrainsService {
  rootURL:string
  constructor(private httpsvc:HttpClient) {
    this.rootURL="http://localhost:9900/trains"
   }

   getTrains():Observable<Train[]>{
     return this.httpsvc.get<Train[]>(this.rootURL+"/list")
   }

   addNewTrain(newTrain:Train): Observable<any>{
     const httpOpts ={headers: new HttpHeaders(
      {'Content-Type':'application/x-www-form-urlencoded;charset=UTF-8'})
    }
    var reqBody="destination="+newTrain.destination+
    "&total_carriage_number="+newTrain.total_carriage_number+
    "&driver="+newTrain.driver+"&provider="+newTrain.provider+
    "&price="+newTrain.price
    return this.httpsvc.post<Train>(
      this.rootURL+"/register",reqBody,httpOpts)
   }
}
