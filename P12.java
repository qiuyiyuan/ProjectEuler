package com.qiuqiu.practice;

public class P12 {
	public static void main(String[] args) {
		int i=1;
		boolean flag=true;
		while(flag) {
			int amount = amountOfFactor(triangleNumber(i));
			System.out.println(i+"\t"+triangleNumber(i)+"\t"+amount);
			if(amount>500) {
				flag=false;
			}
			i++;
		}
	}

	public static int triangleNumber(int index) {
		int sum = 0;
		for (int i = 1; i <= index; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int amountOfFactor(int number) {
		if(number==1) {
			return 1;
		}else {
			int amount=0;
			for(int i=1;i<=Math.sqrt(number);i++) {
				if(number%i==0) {
					if((number/i)>i) {
						amount+=2;
					}
				}
			}
			return amount;
		}
	}
}
