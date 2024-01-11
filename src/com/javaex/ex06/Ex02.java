package com.javaex.ex06;

public class Ex02 {
	
	public static void main(String[] args) {
		
		String a=new String(" abc");
		String b=new String(", efg");
		String c=new String(" abc");
		System.out.println(a==c);//new를 통해 처음부터 다른 주소로 만듬

		
		System.out.println("------");
		
		System.out.println(a.concat(b));//concat은 더하기 개념
		System.out.println(a.trim());//trim은 공백 제거
		System.out.println(a.replace("ab", "12"));//replace는 변경
		System.out.println("-----");
		String[] str01=b.split(",");
		for(int i=0; i<str01.length; i++) {
			System.out.println(str01[i]);
		}//','를 기준으로 잘라서 표시 ""(공백),"efg" 2개
		
		System.out.println("------");
		String str02="Hello java!";
		System.out.println(str02.substring(5));//5번까지 제외후 나머지
		System.out.println(str02.substring(1,7));//2번부터 6까지의 문자만
		
		System.out.println(str02.charAt(1));//0번부터 시작해서 1번째의 문자만
		
		System.out.println("=======");
		
		
		String s01="hi";
		String s02="hi";
		if(s01==s02) {
			System.out.println("주소같음");
		}else {
			System.out.println("주소다름");
		}
		
		if(s01.equals(s02)) {
			System.out.println("이름 같음");
		}else {
			System.out.println("이름 다름");
		}
		
		System.out.println(s01==s02);//같은 값만 찾아서 같은 주소를 덮어쓰기로
		s01="HI";
		System.out.println(s01==s02);//덮어쓰기 상태는 값이 바뀌면 다른 주소로 바뀐다(객채변경불가==immutable)
		if(s01==s02) {
			System.out.println("주소같음");
		}else {
			System.out.println("주소다름");
		}
		
		if(s01.equals(s02)) {
			System.out.println("이름 같음");
		}else {
			System.out.println("이름 다름");
		}		
		
		System.out.println("===========");
		String s03="Hi";
		System.out.println("Hi".equals(s03));//문자를 기준으로 equals도 사용 가능
		
	}
}
