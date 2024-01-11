package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	

	public Point() {
		super();//표시가 안된 Object의 생성자가 super 자동 표시된것
	}

	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
