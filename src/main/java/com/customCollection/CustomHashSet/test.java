package com.customCollection.CustomHashSet;

import java.util.HashSet;

public class test {
	public static void main(String[] args) {
		NewHashSet<Integer> customIntegerBucket = new NewHashSet<>();
		HashSet<Integer> javaBucket = new HashSet<>();

		long startCustomTime = System.nanoTime();
		for(int i=0;i < 100000; i++){
			customIntegerBucket.add(i);
		}
		customIntegerBucket.contains(21);
		long endCustomTime = System.nanoTime();
		System.out.println("Custom HashSet: " + (endCustomTime - startCustomTime));


		long startJavaTime = System.nanoTime();
		for(int i=0;i < 100000; i++){
			javaBucket.add(i);
		}
		customIntegerBucket.contains(21);
		long endJavaTime = System.nanoTime();
		System.out.println("Java HashSet: " + (endJavaTime - startJavaTime));
	}
}
