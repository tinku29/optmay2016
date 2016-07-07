package com.two95.objectconcepts;

public interface Database {
	public void getConnection();
	public void createStatement();
	public void executeQuery();
	public void shutDown();

}
