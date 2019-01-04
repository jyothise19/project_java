import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collections {
	

		public static void main(String[] args) {
		Collections coll = new Collections();
		coll.normalArray();
		coll.arrayList();
		coll.linkdlist();
		coll.linkedHasset();
		coll.hahset();  //removes duplicate elements
		
        coll.characterOccurence();
		coll.printDuplicateListWithCount();
		}

		public void normalArray() {

		String[] arr = {"Kishan","Jyothi","Bhuvan","null"};
		

		//simple for loop
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		System.out.println("-------------");
		//advanced for loop
		for(String s: arr) {
		System.out.println(s);
		}

		

		}


		
		public void arrayList() {
		System.out.println("------ Array List Example ------");
		ArrayList<String> al = new ArrayList<String>();
		List<String> e =new ArrayList<String>();
		al.add("S Kishan");
		al.add("S Jyothi");
		al.add("bhuvan");
		al.add("S Bhuvan");
		al.add("S Bhuvan");
		al.add(null);
		al.add(null);
		al.add(null);

		//advanced for loop
		for(String s: al) {
		System.out.println(s);
		}

		System.out.println("---for each----");
		al.remove(1);
		int size = al.size();

		for(String s: al) {
		System.out.println(s);
		}

		
		}

		public void linkdlist() {
		System.out.println("-----linkdlist----");
		LinkedList<String> al = new LinkedList<>();
		al.add("S Kishan");
		al.add("S Jyothi");
		al.add("S Bhuvan");
		al.add("S Bhuvan");
		al.add("bhuvan");
		al.add(null);
		al.add(null);
		al.add(null);

		//advanced for loop
		for(String s: al) {
		System.out.println(s);
		}
		}

		public void hahset() {
		System.out.println("------------------hash set---------");
		Set<String> al = new HashSet<>();
		al.add("S Kishan");
		al.add("Jyothi");
		al.add("bhuvan");
		al.add("Bhuvan");
		al.add(null);
		al.add(null);
		al.add(null);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		//advanced for loop
		al.remove(2);
		for(String s: al) {
		System.out.println(s);
		}
		}
  public void linkedHasset() {
	  System.out.println("/******linked hash set***********/");
	  LinkedHashSet<String> lhs = new LinkedHashSet<>();
	  lhs.add("Jyo");
	  lhs.add("santhu");
	  lhs.add("null");
	  lhs.add("null");
	  lhs.add("Zebra");
	  
	  for (String s:lhs) {
		  System.out.println(s);
	  }
	  
  }

		

		// get Duplicate string with count
		public void printDuplicateListWithCount() {
		List<String> al = new ArrayList<String>();
		al.add("Kishan");
		al.add("S Kishan");
		al.add("Bhuvan");
		al.add("Jyothi");
		al.add("Kishan");
		al.add("bhuvan");
		al.add("Kishan");
		al.add("Jyothi");
		
	    
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		Integer count;
		for(String s:al) {
		count=map.get(s);
		if(count==null) {
			count=1;}
			else {
				count++;
			}
		map.put(s, count);
		}
		
		System.out.println(map);
		}
		
		
		
		
		
		
		
		
	public void characterOccurence() {	
		Integer count;
		String str="saranya";
		char[] a =str.toCharArray();
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		for(Character c:a) {
			
			
			mp.put(c, mp.containsKey(c)?(mp.get(c)+1):1);
			
			
		}
		System.out.println("character occurence is:"+mp);
	
	}
}


		
		
		
		
		
		
