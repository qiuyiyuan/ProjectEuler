package com.qiuqiu.practice;

import java.math.BigDecimal;

public class P16 {
	public static void main(String[] args) {
		method1();
		method2();
	}
	
	//方法一：强行暴力计算
	public static void method1() {
		BigDecimal result = BigDecimal.ONE;
		BigDecimal two = BigDecimal.ONE.add(BigDecimal.ONE);
		for (int i = 0; i < 1000; i++) {
			result = result.multiply(two);
			//System.out.println("2^" + (i + 1) + "=" + result);
		}
		String s = result.toString();
		int sum=0;
		for(char c:s.toCharArray()) {
			sum+=(c-'0');
		}
		System.out.println(sum);
	}
	
	//方法二：利用数组实现进位
	public static void method2() {
		int[] a = new int[500];
		int i =0;
		int j =0;
		int k =0;
		int sum=0;
		for(j=0;j<500;j++) {
			a[j]=0;
		}
		a[0]=2;
		for(j=1;j<1000;j++) {
			for(k=0;k<i+1;k++) {
				a[k]*=2;
			}
			for(k=0;k<i+1;k++) {
				a[k+1]+=a[k]/10;
				a[k]-=a[k]/10*10;
			}
			if(a[i+1]>0) {
				i++;
			}
		}
		for(j=i;j>=0;j--) {
			sum+=a[j];
		}
		System.out.println(sum);
	}
}
