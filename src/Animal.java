
public abstract class Animal {

	public static void main(String[] args) {
		Animal an = new Animal();
	}
	public Animal() {
		
	}
	public void juii() {}
	
	public abstract void eats();
	public abstract void lives();
	public void sleep() {
		Thread.sleep(1000);
	}
	public  abstract void colour();}
