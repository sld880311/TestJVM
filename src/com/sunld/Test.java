package com.sunld;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal a = new BigDecimal("1.22");
		BigDecimal b = new BigDecimal("2.22");
		a.add(b);
//		System.out.println(a);
//		System.out.println(a.add(b));
		b=a.add(b);
		System.out.println(a);
		System.out.println(b);
	}

}
