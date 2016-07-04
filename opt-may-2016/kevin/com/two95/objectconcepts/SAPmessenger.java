package com.two95.objectconcepts;

public class SAPmessenger extends MainframeMessenger {
	public void sendMessage(String message){
		formatMessage(message);
		System.out.println("Message "+message+" send to SAP system");
	}

}
