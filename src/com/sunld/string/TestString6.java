package com.sunld.string;
/**
 * @Title: TestString6.java
 * @Package com.sunld
 * <p>Description:</p>
 * @author sunld
 * @version V1.0.0 
 * <p>CreateDate:2017年6月8日 上午9:53:43</p>
*/

public class TestString6 {
	public static void main(String[] args) {
	    String s = new String("1");
	    s.intern();
	    String s2 = "1";
	    System.out.println(s == s2);

	    String s3 = new String("1") + new String("1");
//	    s3.intern();
	    String s4 = "11";
	    String s5 = s3.intern();
	    System.out.println(s3 == s4);
	    System.out.println(s5 == s4);
	}
}
