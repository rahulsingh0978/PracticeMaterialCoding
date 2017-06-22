package com.amazon.practice;

public class Solution {
	void powerSet(String[] a){
		int setSize = a.length;
		boolean b;
		int totalSet = (int) Math.pow(2,setSize);
		for(int i =0; i < totalSet ; i++){
			System.out.print(i);
			for(int j = 0 ; j<setSize ; j++){
				
				if((i&(1<<j)) >0 ) {
					System.out.print(" "+a[j]+",");
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Solution o = new Solution();
		String[] a = {"a","b","c"};
		o.powerSet(a);
	}
}
