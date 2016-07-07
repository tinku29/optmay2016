package com.two95.objectconcepts;

public class OracleUser {

	public static void main(String[] args) {
		Oracle db=new Oracle();
		db.getConnection();
		db.createStatement();
		db.executeQuery();
		db.shutDown();
	}

}
