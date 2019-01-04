package Saranya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class RD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=new LinkedList<String>();
list.add("android");
list.add("android");
list.add("windows");
List li = new ArrayList();
li.add("jyo");
li.add(1);

System.out.println("arraylist"+li);
System.out.println("before remove"   +list.size());
System.out.println(list);

HashSet<String> hashset=new HashSet<String>(list);
//System.out.println(hashset);
ArrayList<String> newlist=new ArrayList<String>(hashset);
System.out.println("after remove"+newlist.size());
System.out.println(newlist);

	}

}
