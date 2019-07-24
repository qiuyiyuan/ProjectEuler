package com.qiuqiu.practice;

public class P4 {
	public static void main(String[] args) {
		boolean tag = false;
		for (int i = 999999; i > 99999; i--) {
			if ((i / 100000) == (i % 10) && (i/10000%10)==(i/10%10) && (i/1000%10)==(i/100%10)) {
				for (int j = 999; j > 99; j--) {
					if (i % j == 0 && i / j > 99 && i / j < 1000) {
						int remain = i / j;
						if (remain < j) {
							System.out.println(i + "=" + remain + "*" + j);
						} else {
							System.out.println(i + "=" + j + "*" + remain);
						}
						tag = true;
					}
					if (tag) {
						break;
					}
				}
				if (tag) {
					break;
				}
			}
		}
	}
}
