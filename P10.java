package com.qiuqiu.practice;

public class P10 {
	public static void main(String[] args) {
		long sum = 0;
		for(int i=3;i<2000000;i+=2) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum+2);
	}
	public static boolean isPrimeNumber(int i) {
		boolean tag = true;
		if (i == 1) {
			return false;
		} else if (i == 2) {
			return true;
		} else {
			if (i % 2 != 0) {
				for (int j = 3; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						tag = false;
					}
				}
			} else {
				tag = false;
			}
		}
		return tag;
	}
}
