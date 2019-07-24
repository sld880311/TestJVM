package com.sunld.string;
/**
 * @Title: TestString5.java
 * @Package com.sunld
 * <p>Description:</p>
 * @author sunld
 * @version V1.0.0 
 * <p>CreateDate:2017年6月8日 上午9:28:59</p>
*/

public class TestString5 {

	public static void main(String[] args) {
		String s1 = new String("a");
		String s2 = s1.intern();
		String s3 = "a";
		System.out.println(s1 == s2);//false
		System.out.println(s3 == s2);//true
	}

}
