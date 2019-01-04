
public  class lion extends Animal{
	 int a;
	public static void main(String[] args) {
		lion l = new lion();
		l.eats();
		int a1 = l.stays();
		System.out.println("a1 is :"+a1);
		System.out.println(l.a);
		
		
	}
	public void eats() {
		System.out.println(this);
		System.out.println("eats animals");
	}

	@Override
	public void lives() {
		// TODO Auto-generated method stub
		System.out.println("lives in cage");
		
	}
	
	public  int stays() {
		
		this.a=10;
		
		return a;
	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		
	}


	

}
