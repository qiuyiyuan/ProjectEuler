package com.qiuqiu.practice;

public class P6 {
	public static void main(String[] args) {
		int sum_squares=0;//平方的和
		int sum=0;//数字的和
		int square_sum=0;//和的平方
		for(int i=1;i<=100;i++) {
			sum_squares+=(i*i);
			sum+=i;
		}
		square_sum=(sum*sum);
		System.out.println((square_sum-sum_squares));
	}
}
