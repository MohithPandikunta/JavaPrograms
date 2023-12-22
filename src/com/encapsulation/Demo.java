package com.encapsulation;

public class Demo {
	int a;
	private float b;
	Demo (int a)
	{
		this.a=a;
	}
	void demoDetails()
	{
		System.out.println("a="+a);
		System.out.println("b="+getB());
	}
	public void setB(int b)
	{
		this.b=b;
		
	}
	public float getB()
	{
		return b;
		
	}


}
