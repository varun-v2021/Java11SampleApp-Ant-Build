package com.java11.sample;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test for \"var\" in java 11");
		var test = new ArrayList<String>();
		test.add("a");
		test.add("b");
		test.add("c");
		test.add("d");
		test.forEach((x) -> {System.out.println(x);});
	}

}
