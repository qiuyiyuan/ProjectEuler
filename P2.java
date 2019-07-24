package com.qiuqiu.practice;

public class P2 {
	public static void main(String[] args) {
		int sum=0;
		for(int i =1;fibonacci(i)<4000000;i++) {
			if(fibonacci(i)%2==0) {
				sum+=fibonacci(i);
			}
		}
		System.out.println(sum);
	}
	
	public static int fibonacci(int index) {
		if(index==1) {
			return 1;
		}else if(index==2) {
			return 2;
		}else {
			return fibonacci(index-1)+fibonacci(index-2);
		}
	}
}
