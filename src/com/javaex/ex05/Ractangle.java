package com.javaex.ex05;


public class Ractangle {
	
	private int width;
	private int height;
	
	public Ractangle(int width, int height) {
		this.height=height;
		this.width=width;
	}
	
	
	
	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public boolean equals(Object obj) {
		Ractangle r=(Ractangle)obj;
		boolean result;
		if(this.width*this.height==r.width*r.height) {
			result=true;
		}else {
			result=false;
		}
		return result;
		
		
	}
}
