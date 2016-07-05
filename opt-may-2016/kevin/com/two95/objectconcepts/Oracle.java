package com.two95.objectconcepts;

public class Oracle implements Database{
	static{
		System.out.println("Oracle DB initialized");
	}
	public void getConnection(){
		clearCache();
		System.out.println("Got the connection from Oracle DB");
	}
	private void clearCache(){
		System.out.println("Cache cleared");
	}
	public void createStatement(){
		System.out.println("Created Oracle statement");
	}
	public void executeQuery(){
		System.out.println("SQL executed");
	}
	public void shutDown(){
		System.out.println("Oracle shutdown completed");
	}

}
