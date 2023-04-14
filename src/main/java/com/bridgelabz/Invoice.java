package com.bridgelabz;

public class Invoice {
	private int totalRides;
	private double totalFare;
	private double averageFare;
	private int userId;

	public Invoice() {
	}

	public Invoice(int totalRides, double totalFare, double averageFare) {
		this.totalRides = totalRides;
		this.totalFare = totalFare;
		this.averageFare = averageFare;
	}

	public Invoice(int totalRides, double totalFare, double averageFare, int userId) {
		this.totalRides = totalRides;
		this.totalFare = totalFare;
		this.averageFare = averageFare;
		this.userId = userId;
	}

	public int getTotalRides() {
		return totalRides;
	}

	public void setTotalRides(int totalRides) {
		this.totalRides = totalRides;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public double getAverageFare() {
		return averageFare;
	}

	public void setAverageFare(double averageFare) {
		this.averageFare = averageFare;
	}

	@Override
	public String toString() {
		return "Invoice{" +
				"totalRides=" + totalRides +
				", totalFare=" + totalFare +
				", avgFare=" + averageFare +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Invoice invoice)) return false;
		return totalRides == invoice.totalRides && Double.compare(invoice.totalFare, totalFare) == 0 && Double.compare(invoice.averageFare, averageFare) == 0;
	}

}