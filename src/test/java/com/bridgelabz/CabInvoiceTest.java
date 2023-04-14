package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	public class CabInvoiceTest {
		CabInvoice cabInvoice;
		@BeforeEach
		public void init() {
			cabInvoice = new CabInvoice();
		}

		@Test
		public void givenDistanceAndTimeShouldReturnTotalFare() {
			double fare = cabInvoice.calculateFare(20, 5);
			Assertions.assertEquals(205, fare, 0.0);
		}

		@Test
		public void givenDistanceAndTimeShouldReturnMinimumFare() {
			double fare = cabInvoice.calculateFare(0.2, 1);
			Assertions.assertEquals(5, fare, 0.0);
		}
	}