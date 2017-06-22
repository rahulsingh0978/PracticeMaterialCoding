package com.string;

public class ReverseWords {
	static void reverse(String ip) {
		String[] stringArray = ip.split(" ");
		String reverseString = "";
		for (int i = stringArray.length - 1; i >= 0; i--) {
			reverseString += stringArray[i] + " ";
		}
		System.out.println(reverseString);
	}

	static void reverseWithoutJava(String ip) {
		String rev = "";
		String finalChar = "";
		int n = 0;
		for (int i = ip.length() - 1; i >= 0; i--) {
			rev +=i!=0? ip.charAt(i):ip.charAt(i)+" ";
			if (ip.charAt(i) == ' '|| i==0) {
				for (int j = rev.length() - 1; j >= 0; j--) {
					finalChar += rev.charAt(j);
				}
				rev = "";
			}
		}
		System.out.println(finalChar);
	}

	public static void main(String[] arg) {
		// reverse("i love programming");
		String name = "rahul";
		name = "singh";
		System.out.println(name);
		reverseWithoutJava("i love programming in java");
	}

}
