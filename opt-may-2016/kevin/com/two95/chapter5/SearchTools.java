package com.two95.chapter5;

public class SearchTools {
	public static PremierSearchTool getClientASearchTool(){
		PremierSearchTool p=new PremierSearchTool();
		return p;
	}
	public static SuperiorSearchTool getClientBSearchTool(){
		SuperiorSearchTool s=new SuperiorSearchTool();
		return s;
	}
	public static PremierSearchTool getClientCSearchTool(){
		PremierSearchTool p=new SuperiorSearchTool();
		return p;
	}
	public static InternetSearch getClientDSearchTool(){
		InternetSearch p=new PremierSearchToool();
		return p;
	}


}
