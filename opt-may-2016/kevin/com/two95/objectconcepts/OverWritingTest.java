package com.two95.objectconcepts;

public class OverWritingTest {

	public static void main(String[] args) {
		MainframeMessenger m=new MainframeMessenger();
		m.sendMessage("Hello");
		SAPmessenger s=new SAPmessenger();
		s.sendMessage("Hello");

	}

}
