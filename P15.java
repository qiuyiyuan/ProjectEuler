package com.qiuqiu.practice;

public class P15 {
	public static void main(String[] args) {
		long ans = 1;
		for (long i = 39; i > 20; i -= 2) {
			ans *= i;
			System.out.println(i + "\t" + ans);
		}
		System.out.println("##########");
		for (long i = 0; i < 10; i++) {
			ans *= 2;
			System.out.println(i + "\t" + ans);
		}

		/*
		 * 2 39 2 37 2 35 2 33 2 31 2 29 2 27 2 25 2 23 2 21 10 9 8 7 6 5 4 3 2 1
		 */
		System.out.println("##########");
		for (long i = 10; i > 0; i--) {
			ans /= i;
			System.out.println(i + "\t" + ans);
		}
		System.out.println(ans);
	}
}
