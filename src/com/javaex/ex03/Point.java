package com.javaex.ex03;

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
	
	/*
	public boolean eqauls(Object ace) {
		if(this.x==this.getX() &&this.y==this.getY()) {
			return true;
		}else {
			return false;
		}
	}
	*/
	@Override
	public boolean equals(Object obj) {
		Point p=(Point)obj;//형변환
		boolean result;
		if(this.x==p.x && this.y==p.y) { 
			result=true;
		}else {
			result=false;
		}
		return result;
	}
	
	
	
}
