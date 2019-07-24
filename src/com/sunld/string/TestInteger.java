package com.sunld.string;
/**
 * @Title: TestInteger.java
 * @Package com.sunld
 * <p>Description:</p>
 * @author sunld
 * @version V1.0.0 
 * <p>CreateDate:2017年6月9日 上午9:28:45</p>
*/

public class TestInteger {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 10;
		System.out.println(a == b);//true
		
		a = 127;
		b = 127;
		System.out.println(a == b);//true
		
		a = 128;
		b = 128;
		System.out.println(a == b);//false
		
		a = -128;
		b = -128;
		System.out.println(a == b);//true
		
		a = -129;
		b = -120;
		System.out.println(a == b);//false
	}

}
