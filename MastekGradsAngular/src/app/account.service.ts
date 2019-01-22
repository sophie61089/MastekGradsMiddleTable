import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '../../node_modules/@angular/common/http';
import { Observable } from '../../node_modules/rxjs';
import { Account } from './account';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  rootURL: String
  constructor(private httpservice:HttpClient) { 
    this.rootURL="http://localhost:9900/account"
  }

  listAccounts():Observable<Account[]>{
    return this.httpservice.get<Account[]>(this.rootURL+"/list")
   }

   addAccount(newAccount:Account):Observable<any>{
    const httpOpts = {
      headers: new HttpHeaders(
        {'Content-Type' : 'application/x-www-form-urlencoded;charset=UTF-8'})
    }

    var reqBody = "type="+newAccount.accountType

    return this.httpservice.post<Account>(
      this.rootURL+"/register", reqBody, httpOpts)
   }
}
