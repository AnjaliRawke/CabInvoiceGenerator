package com.bridgelabz;

import java.util.HashMap;

public class RideRepository {
	HashMap<String,Ride[]> rideHashMap = new HashMap<>();
	public void addRides(String userId,Ride[] rides){
		if (rideHashMap.containsKey(userId)){
			System.out.println("This userId already exists.");
		}else {
			rideHashMap.put(userId,rides);
		}
	}
	public Ride[] getRideFromUserId(String userId){
		Ride[] rides = rideHashMap.get(userId);
		return rides;
	}
	public Invoice getInvoiceFromUserId(String userId){
		Ride[] rides = rideHashMap.get(userId);
		CabInvoice invoice = new CabInvoice();
		return invoice.generateInvoice(rides);
	}

	public Invoice generateInvoice(int userNo, Ride[] rides,UserType usertype) {
		CabInvoice cabInvoice = new CabInvoice();
		if (usertype.NORMAL.equals(usertype)) {
			int totalRides = rides.length;
			double aggFare = cabInvoice.calculateFare(rides);
			double avgFare = (aggFare / totalRides);
			return new Invoice(totalRides, aggFare, avgFare, userNo);
		} else if (usertype.PREMIUM.equals(usertype)) {
			int totalRides = rides.length;
			double aggFare = cabInvoice.calculateFarePremium(rides);
			double avgFare = (aggFare / totalRides);
			return new Invoice(totalRides, aggFare, avgFare, userNo);
		}
		return null;
	}
}
