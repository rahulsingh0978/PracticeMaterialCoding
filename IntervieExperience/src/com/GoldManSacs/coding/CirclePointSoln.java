package com.GoldManSacs.coding;

import java.util.Scanner;

class Solution{
	static int findNumberOfPoints(int radius){
		int temp ,sqTemp , count=0;
		for(int i=0;i<=radius;i++){
			temp = (radius-i)*(radius+i);
			sqTemp = (int) Math.sqrt(temp);
			if(sqTemp*sqTemp == temp){
				count++;
			}
		}
		
		return count*2;
		
	}
}


class SolutionUsingTrigo{
	static int findNumberOfPointsOnCircle(int radius){
		int count=0;
		for(int i =0;i<=360;i++){
		double rad = Math.toRadians(i);
		int cos = (int)Math.cos(rad);
		System.out.println("cos :"+cos);
		}
		return count;
	
	}
}
public class CirclePointSoln {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int i = sc.nextInt();
		//System.out.println(Solution.findNumberOfPoints(i));
		System.out.println("cos  "+SolutionUsingTrigo.findNumberOfPointsOnCircle(12));
		
	}
}
