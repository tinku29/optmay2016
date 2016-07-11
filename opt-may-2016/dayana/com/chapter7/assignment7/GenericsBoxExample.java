package com.chapter7.assignment7;

public class GenericsBoxExample<T> {
	private T t;
	public void add(T t)
	{
		this.t = t;
	}
	public T get()
	{
		return t;
	}
	
}
