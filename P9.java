package com.qiuqiu.practice;

public class P9 {
	public static void main(String[] args) {
		int k;
		for (int i = 998; i > 2; i--) {
			for (int j = 1; j < (999 - i); j++) {
				k = (1000 - i - j);
				if ((j * j + k * k) == (i * i)) {
					System.out.println(i + "*" + i + "=" + j + "*" + j + "+" + k + "*" + k);
					System.out.println(i * j * k);
				}
			}
		}
	}
}
