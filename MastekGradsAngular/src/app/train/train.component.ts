import { Component, OnInit } from '@angular/core';
import { Train} from '../train';
import { TrainsService } from '../trains.service';

@Component({
  selector: 'app-train',
  templateUrl: './train.component.html',
  styleUrls: ['./train.component.css']
})
export class TrainComponent implements OnInit {
  trains:Train[]

  constructor(private trainService:TrainsService) {
    this.trains=[]
   }

   addNewTrain(newTrain:Train){
     this.trainService.addNewTrain(newTrain).subscribe(
       res=>{
         this.trainService.getTrains().subscribe(
           res=>{this.trains=res}
         )
       }
     )
   }

  ngOnInit() {
    this.trainService.getTrains().subscribe(
      res=>{this.trains=res}
    )
  }

}
