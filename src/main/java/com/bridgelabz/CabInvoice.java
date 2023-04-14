package com.bridgelabz;

public class CabInvoice {
	public static final int COST_PER_KILOMETER = 10;
	public static final int COST_PER_MINUTE = 1;
	public static final int COST_PER_KM_PRE = 15;
	public static final int COST_PER_MIN_PRE = 2;
	public static final int MINIMUM_FARE = 5;
	public static final int MIN_FARE_PRE = 20;


	public double calculateFare(double distance, double time) {
		double fare = (distance * COST_PER_KILOMETER) + (time * COST_PER_MINUTE);
		return (fare < MINIMUM_FARE) ? MINIMUM_FARE : fare;
	}

	public double calculateFare(Ride[] rides) {
		double aggregateFare = 0;
		for (Ride ride : rides) {
			aggregateFare += calculateFare(ride.getDistance(), ride.getTime());
		}
		return aggregateFare;
	}

	public Invoice generateInvoice(Ride[] rides) {
		int totalRides = rides.length;
		double totalFare = calculateFare(rides);
		double averageFare =(totalFare/totalRides);
		return new Invoice(totalRides,totalFare,averageFare);
	}

	public Double calculateFarePremium(double distance, double time) {

		double fare=distance*COST_PER_KM_PRE+time*COST_PER_MIN_PRE;
		return fare<MIN_FARE_PRE?MIN_FARE_PRE:fare;
	}
	public double calculateFarePremium(Ride[] rides) {
		double aggfare=0;
		for (Ride ride: rides) {
			aggfare+=calculateFarePremium(ride.getDistance(),ride.getTime());
		}
		return aggfare;
	}
}