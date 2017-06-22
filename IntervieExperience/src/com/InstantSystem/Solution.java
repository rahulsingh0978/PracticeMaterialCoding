package com.InstantSystem;
interface a{
	void show();
}
interface b{
	void show();
}
public class Solution implements a,b {
 public String check(String a){
	 System.out.println("string");
	 return a;
 }
 public int check(int a){
	 System.out.println("integer");
	 return a;
 }
	public int method(int x){
	 try{
		 return 1;
	 }
	 catch(Exception e){
		 return 2;
	 }
	 finally{
		 return 3;
	 }
 }
 public static void main(String[] args) {
	Solution o = new Solution();
	//System.out.println(o.method(0));
	
	//System.out.println(o.check(null));
	
	String s1 = new String("Rahul");
	//s1 = "singh";
	String s2 = new String("Rahul");
	System.out.println(s1== s2);
	//s1.concat(s2);
	System.out.println(s1);
	o.show();
}
@Override
public void show() {
	System.out.println("this is print");
	
}
}
