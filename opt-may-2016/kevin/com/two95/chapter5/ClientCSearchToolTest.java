package com.two95.chapter5;

public class ClientCSearchToolTest {

	public static void main(String[] args) {
		PremierSearchTool tool=SearchTools.getClientCSearchTool();
		tool.searchWeb();
		tool.searchImage();
		tool.searchNovel();
		tool.searchLdap();
		tool.searchOracleDB();
		tool.seachMySqlDB();

	}

}
