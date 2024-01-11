package com.javaex.ex06;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		int c=b;
		
		System.out.println(b==c);
		
		b=4;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(b==c);
		//object 클래스의 객체가 주소를 기준으로 바뀌는 것과 다르게
		//기본형들은 값이 바뀌게 되면 값을 기준으로 바뀌게 된다
		
		System.out.println("=======");
		
		
		
		String str1="abc";
		String str2="def";
		String str3="def";
		String str4=str3;
		
		System.out.println(str2.equals(str3));
		System.out.println(str2==str3);
		System.out.println(str2.equals(str4));
		System.out.println(str2==str4);
		
		str2="ABC";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str2.equals(str3));
		System.out.println(str2==str3);
		System.out.println(str2==str4);
		//문자열 상수로 이루어진 String 객체는 변경이 불가능하다
		//str2번의 기존 'def'객체의 수정이 불가능하기에 str2번은 새로운 객체를 만들게 된다(객체를따라가는 주소값도 변경)
		//str3번은 기존의 'def'객체를 str2번은 새로운 객체를 표시해서 2개의 값이 다르다
		//object클래스와 String클래스는 상태가 다르다
		
		System.out.println("===================================");
		System.out.println("===================================");
		
		String aa=new String("학국대학교");
		String bb=new String("한국대학교");//new로 새로 만들기
		String cc=aa;//덮어쓰기
		
		System.out.println(aa.equals(bb));
		System.out.println(aa==bb);//aa와 bb의 주소가 다르다 //new로 새로 만들면 주소가 다르게 들어간다 
		System.out.println(aa.equals(cc));
		System.out.println(aa==cc);
		
		System.out.println("-----");
		aa="한국전문대";
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(aa==cc);
		
		//덮어쓰기의 상태에서 aa의 값이 변하면서 aa는 새로운 주소를 가졌고 cc와 다르게 되엇다
		
		
	}
}
