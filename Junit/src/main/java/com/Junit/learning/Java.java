package com.Junit.learning;

import java.util.Arrays;

public class Java {
	
	public String reversing (String word) {
		String reversed = "";
		for(int i=1;i<word.length()+1;i++) {
			reversed += word.charAt(word.length()-i);
		}
		
		return reversed;
	}
	
	public int[] sortingarray (int[] arr) {
		Arrays.sort(arr);
		
		return arr;
	}
	
	public int adddummy (int num) {
		for(int i=0;i<10000;i++)
			num+=i;
		return num;
	}

	public static void main(String[] args) {
		Java rev = new Java();
		System.out.println("Reversed String is : "+ rev.reversing("Java"));

	}

}
