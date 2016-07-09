package com.two95.chapter5;

public class ClientDSearchToolTest {

	public static void main(String[] args) {
		InternetSearch tool = SearchTools.getClientDSearchTool();
		tool.searchWeb();
		tool.searchImage();

	}

}
