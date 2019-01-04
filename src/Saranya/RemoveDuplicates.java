package Saranya;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String stringWithDuplicates="aaaaaaaa";
char[] ch = stringWithDuplicates.toCharArray();
boolean[] found=new boolean[256];
StringBuilder sb=new StringBuilder();
System.out.println("string with duplicates is  "+stringWithDuplicates);
for(char c:ch) {
	if(!found[c]) {
		found[c]=true;
		sb.append(c);
	}
}
System.out.println("String after duplicates removed  "+sb.toString());
	}

}
