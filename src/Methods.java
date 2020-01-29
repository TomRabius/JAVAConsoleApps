
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHelloWorld();
		sayHelloTo("Tom");
		sayHelloTo("Petra");
		int x = returnFive();
		System.out.println(x);
		
		int result = square(returnFive()); //try entering x, 5 or returnFive().
		System.out.println(result);
	}
	//This method returns a multiply of the called out number. It returns a value AND takes in data.
	static int square(int x) {
		return x * x;
	}
	
	// this method returns an int type with the value 5.
	static int returnFive() {
		return 5;
	}
	//This method will say hello to whatever name is passed when called.
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}
	//This method simply says Hello, world!
	static void sayHelloWorld() {
		System.out.println("Hello, world!");
	}

}
