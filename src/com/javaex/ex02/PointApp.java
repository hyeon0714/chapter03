package com.javaex.ex02;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point a=new Point(2,3);
		
		Point b=new Point(2,3);
		
		
		
		System.out.println(a.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.toString());
		System.out.println(a);
		
		System.out.println("=========");
		System.out.println(a.equals(b));//주소를 비교해서 false
		System.out.println(a.getX()==b.getX());//값을 비교해서 true
		System.out.println("=========");
		
		System.out.println(b.hashCode());
		System.out.println(b.getClass());
		System.out.println(b.getClass().getName());
		System.out.println(b.toString());
		System.out.println(b);
		
		
		System.out.println("=========");
		
		a=b;//a와 b의 주소값이 같아져서 a의 주소값이 없어짐
		
		System.out.println(a.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.toString());
		System.out.println(a);
		
		b.setX(4);
		b.setY(3);
		a.setX(7);//a의 주소값이 b의 주소값으로 덮어씌워져서 b만 수정해도 a의 값이 바뀌고
		//b의 주소만 수정해도 a의 값이 바뀐다
		
		System.out.println("=========");
		System.out.println(a.equals(b));//주소를 비교해서 false
		System.out.println(a.getX()==b.getX());//값을 비교해서 true
		System.out.println(a.getX());
		System.out.println(b.getX());
		System.out.println("=========");
		System.out.println(a.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.toString());
		System.out.println(a);
		

		
	}
}
