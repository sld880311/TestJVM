package com.sunld;

public class TestEden {
	
	private static final int _1MB = 1024 * 1024;
	/**
	 * vm参数：-verbose:gc -Xms20M -Xmx20M -Xmn8M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] a,b,c,d;
		a = new byte[2 * _1MB];
		b = new byte[1 * _1MB];
//		c = new byte[1 * _1MB];
//		d = new byte[2 * _1MB];
	}

}
