package com.two95.objectconcepts;

public class MainframeMessenger {
	public void formatMessage(String str){
		System.out.println("Message formatted");
	}
	public void sendMessage(String message){
		formatMessage(message);
		System.out.println("Message "+message+" send to Mainframe");
	}
}
