package com.two95.objectconcepts;

public class MultipleMessenger {
	public void sendMessage(String msg1){
		System.out.println(msg1+" send to the Mainframe");
	}
	public void sendMessage(String msg1,String msg2){
		System.out.println(msg1+" "+msg2+" send to the Mainframe");
	}
	public void sendMessage(String msg1,String msg2,String msg3){
		System.out.println(msg1+" "+msg2+" "+msg3+" send tho the Mainframe");
	}

}
