package Interviewquestions;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String a = "input";
		String b = "putin";
		if(a.length()==b.length()) {
			System.out.println("Given Strings are anagrams.");
		}
		else {
			System.out.println("Given Strings are not anagrams.");
		}
		char a1[] = a.toCharArray();
		char b1[] = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		if(Arrays.equals(a1,b1)) {
			System.out.println("Given Strings are anagrams.");
		}
		else {
			System.out.println("Given Strings are not anagrams.");
		}
	}
	}
