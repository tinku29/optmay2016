package com.two95.chapter5;

public class ClientBSearchToolTest {

	public static void main(String[] args) {
	SuperiorSearchTool tool=SearchTools.getClientBSearchTool();
	tool.seachMySqlDB();
	tool.searchImage();
	tool.searchOracleDB();
	tool.searchWeb();
	tool.searchNovel();
	tool.searchLdap();
	tool.searchLibraries();
	}

}
