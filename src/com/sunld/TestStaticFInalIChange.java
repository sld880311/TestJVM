package com.sunld;

import java.math.BigDecimal;

public class TestStaticFInalIChange {
	private static final int i = 1;
	public static void main(String[] args) {
		update(i);
	}
	
	public static void update(int i){
		System.out.println(i);
		i = 100;
		System.out.println(i);
	}

}
