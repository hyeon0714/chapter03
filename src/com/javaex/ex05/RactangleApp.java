package com.javaex.ex05;

public class RactangleApp {
	
	public static void main(String[] args) {
		
		Ractangle r01=new Ractangle(4,4);
		Ractangle r02=new Ractangle(8,2);
		Ractangle r03=new Ractangle(8,8);
		
		System.out.println(r01.equals(r02));
		System.out.println(r02.equals(r01));
		System.out.println(r01.equals(r03));
	}
}
