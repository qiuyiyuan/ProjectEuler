package com.qiuqiu.practice;

public class P3 {
	public static void main(String[] args) {
		long test = 600851475143l;
		int i=2;
		while(test!=1) {
			if(test%i==0) {
				test/=i;
			}
			i++;
		}
		System.out.println(--i);
	}
}
