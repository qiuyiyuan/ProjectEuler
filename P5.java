package com.qiuqiu.practice;

public class P5 {
	public static void main(String[] args) {
		/*for(int i=1;i<10000;i++) {
			int count=0;
			for(int j=2;j<=10;j++) {
				if((i%j)==0) {
					count++;
				}
			}
			if(count==9) {
				System.out.println(i);
			}
		}*/
		
		int i =2521;
		boolean tag = true;
		while(tag) {
			int count=0;
			for(int j=2;j<=20;j++) {
				if((i%j)==0) {
					count++;
				}
			}
			if(count==19) {
				System.out.println(i);
				tag=false;
			}
			i++;
		}
	}
}
