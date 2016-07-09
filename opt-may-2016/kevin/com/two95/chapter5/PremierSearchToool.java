package com.two95.chapter5;

public class PremierSearchToool implements DatabaseSearch,DirectorySearch,InternetSearch {
    @Override
	public void searchOracleDB() {
		System.out.println("Found 2 results in Oracle DB");
		
	}

	@Override
	public void searchMySqlDB() {
		System.out.println("Found 3 results in MySQL DB");
		
	}

	@Override
	public void searchNovel() {
		System.out.println("Found 5 results in Novel");
		
	}

	@Override
	public void searchLdap() {
		System.out.println("Found 5 results in LDAP");
		
	}

	@Override
	public void searchWeb() {
		System.out.println("Found 10 Web results");
		
	}

	@Override
	public void searchImage() {
		System.out.println("Found 10 Image results");
		
	}
	
}