package com.two95.chapter5;

public class ClientASearchToolTest {

	public static void main(String[] args) {
		PremierSearchTool tool = SearchTools.getClientASearchTool();
		tool.searchWeb();
		tool.searchImage();
		tool.searchNovel();
		tool.searchLdap();
		tool.searchOracleDB();
		tool.seachMySqlDB();
		

	}

}
