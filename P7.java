package com.qiuqiu.practice;

public class P7 {
	public static void main(String[] args) {
		int count = 0;
		int i=2;
		while(count!=10001) {
			if(isPrimeNumber(i)) {
				count++;
			}
			i++;
		}
		System.out.println(--i);
	}

	public static boolean isPrimeNumber(int i) {
		boolean tag = true;
		if (i == 1) {
			return false;
		} else if (i == 2) {
			return true;
		} else {
			if (i % 2 != 0) {
				for (int j = i / 2; j > 2; j--) {
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
