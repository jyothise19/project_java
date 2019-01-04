package basicPrograms;

import java.util.Scanner;



public class palind {
	static Scanner scan =new Scanner(System.in);
	static int sum=0,r=0;
	public static void main(String args[]) {
		palind p=new palind();
		/*p.palindrome();*/
		/*p.armstrong(571);*/
		/*p.chara();*/
		p.stringReverse();
		double a=p.area(3);
		System.out.println("area of the given radius"+a);
	}
	
	
	public void palindrome() {
		System.out.println("enter the value for which palindrome needs to be found");
		
	int n=scan.nextInt();
		Boolean b = scan.hasNext();
		int temp=n;
		while(n!=0)
		{
		r=n%10;
		sum=sum*10+r;
		n=n/10;
		}
		if(temp==sum) {
		System.out.println("palindrome"+sum);
		
		}else {
			System.out.println("reverse of the number is"+sum);
			System.out.println("not a palindrome");}
		
	}
	public void armstrong(int n) {
		int temp=n;
		while(n!=0)
		{
			r=n%10;
			sum= sum+r*r*r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("the given numbe ris an armstrong number");
		}
		else
		{
			System.out.println("not an armstrong");
		}
	}
	public void chara() {
	/*	String s ="gfhdjss89e";*/
		String s= scan.next();
		int n= s.length();
		for (int i=0;i<n;i++) { /*when i<=n hit with StringIndexOutOfBoundsException*/
			if(Character.isAlphabetic(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
		}
		
	}
	public double area(int r) {
		double area= Math.PI*r*r;
		return area;
	}
	
	public void stringReverse() {
		System.out.println("enter the string");
		String s =scan.nextLine();
		int l =s.length();
		String reverse="";
		for(int i=l-1;i>=0;i--) {
		reverse= reverse+s.charAt(i);
		}
		System.out.println("Reverse of given string is:"+reverse);
	}
	
}
