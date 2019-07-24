package com.qiuqiu.practice;

public class P14 {
	private static long count=1;
	
	public static void main(String[] args) {
		/*buildChain(113383);
		System.out.println(count);*/
		
		long maxLength=Long.MIN_VALUE;
		long result=0;
		for(long i=1;i<1000000;i++) {
			count=1;
			buildChain(i);
			if(count>maxLength) {
				System.out.println(i);
				maxLength=count;
				result=i;
			}
		}
		System.out.println(result+"\t"+maxLength);
	}
	
	public static void buildChain(long n) {
		collatz(n);
	}
	
	public static void collatz(long n) {
		count++;
		if (n == 1) {
		} else {
			if (n % 2 == 0) {
				n /= 2;
				collatz(n);
			} else {
				n = (3 * n + 1);
				collatz(n);
			}
		}
	}
}
