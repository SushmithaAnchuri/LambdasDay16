package com.jobiak.java8;

import java.util.function.*;
public class TestFunctions {

	public static void main(String[] args) {
		Function<String,Integer>lengthFunction=(String str)->{return str.length();};
		int result=lengthFunction.apply("Jobiak.com");
		System.out.println(result);

}
}
