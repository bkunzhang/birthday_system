package com.tyb.test;

public class Test {
	public static void main(String[] args) {
		 String tempstr = "abcdefghijklmnopqrstuvwxyz";
	     int times = 20000;
	     long lstart1 = System.currentTimeMillis();
	     StringBuffer str = new StringBuffer();
	     for (int i = 0; i < times; i++) {
	    	 str.append(tempstr);
	         System.out.println(i);
	     }
	     long lend1 = System.currentTimeMillis();
	     long time = (lend1 - lstart1);
	     System.out.println(time+"ms");
	}
}
