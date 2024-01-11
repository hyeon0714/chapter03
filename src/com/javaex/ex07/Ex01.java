package com.javaex.ex07;

public class Ex01 {
	
	public static void main(String[] args) {
		 
		//기본자료형의 wrapper클래스 상태
		
		Integer a=3;//박싱=>주소를 갖는다
		Integer b=new Integer(3);//기본적인 박스=>주소를 갖는다
		

		int c=new Integer(3);//언박싱=>주소가 없이 값만 바로
		
		System.out.println(a==c);
		System.out.println(a==b);//박싱된 a와 b의 관계로 서로 다른 주소를 가진다
		System.out.println(b==c);
		System.out.println(a.equals(c));
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		
		//'=='주소값을 비교
		//'eqauls'값을 비교
		
		System.out.println("----");
		
		int d=3;//기본적인 언박싱=>주소가 없이 값만 바로
		System.out.println(a==d);//d의 주소가 없어서 a와 d는 같다고 나온다
		System.out.println(a.equals(d));
		
		
		Integer in=1;
		
		int result=Integer.parseInt("1234567");//스테틱 메모리에 있는 메소드->parseint(문자열의 정수를 출력)
		System.out.println(result+3);
		System.out.println(in);
		
		
		String result2=String.valueOf(111);//스태틱 메모리에 있는 메소드->valueof(정수를 문자로 출력)
		System.out.println(result2+3);
	}
}
