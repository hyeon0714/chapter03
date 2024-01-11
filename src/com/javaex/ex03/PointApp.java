package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
	
	Point a=new Point(5,5);
	Point b=new Point(10,10);
	Point c=new Point(10,10);

	
	System.out.println(b.equals(c));
	//Point 클래스에서 boolean 메소드를 기본 주소를 비교하는 메소드에서
	//값을 비교하는 메소드로 재정의 했기에 b와 c가 같은것으로 나온다
	
	
	System.out.println(b==c);
	//new를 통해 새 주소를 만들어서 다른 주소가 비교된다
	
	Point d=c;
	c.setX(3);
	System.out.println(d==c);
	//c와d의 주소가 합쳐졌기에 c의 값이 바뀌면 d도 같이 바뀐다
	
	
	}
}
