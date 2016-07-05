package com.two95.objectconcepts;

public class MultipleMessengerTest {

	public static void main(String[] args) {
		MultipleMessenger messenger=new MultipleMessenger();
		messenger.sendMessage("Hello");
		messenger.sendMessage("Hello", "World");
		messenger.sendMessage("Hello", "World", "Beautiful");

	}

}
