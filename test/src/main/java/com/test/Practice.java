package com.test;

public class Practice {
public static void main(String[] args) {
	Runnable printMessage = () -> {
		System.out.println("Hello India");
	};
	printMessage.run();
}
}
