package com.jhlee.hardshop;

public class TotalOrders {
	private static int orderCount = 0;

	public static int getOrderCount() {
		return orderCount;
	}

	public static void setOrderCount(int orderCount) {
		TotalOrders.orderCount = orderCount;
	}
	
}
