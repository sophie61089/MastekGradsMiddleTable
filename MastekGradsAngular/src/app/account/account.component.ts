import { Component, OnInit } from '@angular/core';
import { AccountService } from '../account.service';
import { Account } from '../account'

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  accounts: Account[]

  constructor(private accountService:AccountService) {
    this.accounts=[]
   }

  addNewAccount(newAccount:Account){
    console.log(newAccount)
    this.accountService.addAccount(newAccount).subscribe(
      res =>{
        this.accountService.listAccounts().subscribe(
          res => {this.accounts = res}
        )
      }
    )
   }

  ngOnInit() {
    this.accountService.listAccounts().subscribe(
      res => {this.accounts = res
       
      }

    )
  }

}
