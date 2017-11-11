package com.sunld;
/**
 * -Xss128k
 * @author sld88
 *
 */
public class StackMemoryOOM {

	public void whiledo(){
		while(true){
			
		}
	}
	
	public void stackLeakByThread(){
		new Thread(new Runnable() {
			@Override
			public void run() {
				whiledo();
			}
		}).start();
	}
	public static void main(String[] args) {
		StackMemoryOOM s = new StackMemoryOOM();
		s.stackLeakByThread();
	}

}
