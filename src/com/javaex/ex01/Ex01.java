package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Object obj=new Object();
		Object obj2=new Object();
		
		System.out.println(obj.getClass());//표시가 없어도 기본적으로 항상 존재한다//클래스 정보
		
		System.out.println(obj.toString());//주소와 비슷
		
		System.out.println(obj.hashCode());//주소의 값표현
		
		System.out.println(obj.equals(obj));//주소의 비교(값의 비교 '=='과 다름)
		
		
		System.out.println("===============");
		
		//클래스 정보
		System.out.println(obj.getClass());
		
		
		//클래스 주소/
		System.out.println(obj.toString());
		System.out.println(obj);//같은 값이다
		
		
		//해쉬코드
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		
		
		//비교
		System.out.println(obj.equals(obj2));
		
	}

}
