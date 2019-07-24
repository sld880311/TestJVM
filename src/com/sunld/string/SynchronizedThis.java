package com.sunld.string;
/**
 * @Title: SynchronizedThis.java
 * @Package com.sunld
 * <p>Description:</p>
 * @author sunld
 * @version V1.0.0 
 * <p>CreateDate:2017年5月12日 下午1:11:10</p>
*/

public class SynchronizedThis {
	
	public volatile int b;
	public volatile boolean c;
	
	public void methodA(){
        synchronized (this) {
            System.out.println("this A start:"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("this A end:"+Thread.currentThread().getName());
        }
    }

    public synchronized void methodB(){
        System.out.println("this B start:"+Thread.currentThread().getName());
        System.out.println("this B end:"+Thread.currentThread().getName());
    }
    
    public static void main(String args[]){
    	
    }

}
