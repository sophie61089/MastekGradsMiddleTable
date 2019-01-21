package com.example.BookingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookingSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BookingSystemApplication.class, args);

	TrainAccessAPI trainAPI = ctx.getBean(TrainAccessAPI.class);
	
//	Train train1 = new Train();
//	train1.setOrigin("Leeds");
//	train1.setDestination("London Kings Cross");
//	train1.setTotalCarriageNo(8);
//	train1.setDriver("Dave");
//	train1.setProvider("LNER");
//	train1.setPrice(144);
//	
//	Train train2 = new Train();
//	train2.setOrigin("Leeds");
//	train2.setDestination("Manchester Piccadily");
//	train2.setTotalCarriageNo(4);
//	train2.setDriver("Paul");
//	train2.setProvider("Norther Rail");
//	train2.setPrice(23);
//	
//	train1 = trainAPI.addTrain(train1);
//	train2 = trainAPI.addTrain(train2);
//	
////	for(Train t: trainAPI.listTrains()) {
////		System.out.println(t);
////	}
//	
//
//	
//	ctx.close();
//	
//	
	}

}

