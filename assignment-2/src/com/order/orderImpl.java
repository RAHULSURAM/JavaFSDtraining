package com.order;

import java.util.Random;

public class orderImpl {

	public int generateRandomInt() {
		Random rd = new Random();
		int res = rd.nextInt(100);
		System.out.println(res);
		return res;
		
	}
	
}
