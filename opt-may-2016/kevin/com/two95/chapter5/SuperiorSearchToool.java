package com.two95.chapter5;

public class SuperiorSearchToool extends PremierSearchToool implements DirectorySearch, LibrarySearch {

	@Override
	public void  searchLibraries() {
		System.out.println("Found 9 results in Libraries");
	}

	@Override
	public void searchNovel() {
		System.out.println("Performing enhanced Novel Search");
		System.out.println("Found 20 Novel results");

	}

	@Override
	public void searchLdap() {
		System.out.println("Performing enhanced LDAP Search");
		System.out.println("Found 15 results in LDAP");

	}

}
