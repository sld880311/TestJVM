package com.sunld;

import java.util.ArrayList;
import java.util.List;
/**
 * -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError -XX:+PrintGCDetails
 * HeapDumpOnOutOfMemoryError:可以让虚拟机在出现内存溢出异常时
 *  Dump出当前的内存堆转储快照以便事后进行分析
 * @author sld88
 *
 */
public class HeapOOM {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		while(true){
			list.add(new Student());
		}
	}

}
class Student{}
