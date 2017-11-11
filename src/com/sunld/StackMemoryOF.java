package com.sunld;
/**
 * -Xss128k
 * 无限循环本地变量
 * @author sld88
 *
 */
public class StackMemoryOF {
	private int stackLength = 1;
	
	public void stackLeak(){
		stackLength ++ ;
		stackLeak();
	}
	
	public static void main(String[] args) {
		StackMemoryOF stack = new StackMemoryOF();
		try{
			stack.stackLeak();
		}catch(Throwable e){
			System.out.println("=======stackLength========" +stack.getStackLength());
			throw e;
		}
	}

	public int getStackLength() {
		return stackLength;
	}

	public void setStackLength(int stackLength) {
		this.stackLength = stackLength;
	}

}
