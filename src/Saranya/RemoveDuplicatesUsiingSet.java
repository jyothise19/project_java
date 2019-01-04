package Saranya;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesUsiingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="saranya";
		for(int i=0;i<=20;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.nextLine();
		
		removeduplicates(s);
		
		}
	}
	public static void removeduplicates(String str) {
		Set<Character> set=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			//System.out.println(str.charAt(i));
		char c=str.charAt(i);
		
		if(!set.contains(c)) {
			set.add(c);
			sb.append(c);
		}
	}
		System.out.println("after removing duplicates   "+sb.toString());

}
}
